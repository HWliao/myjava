package com.leyoujia.coa.zc.mall.provider.mall;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.constant.CommodityConst;
import com.leyoujia.coa.zc.client.mall.domain.OrderCommand;
import com.leyoujia.coa.zc.client.mall.domain.OrderDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderDto;
import com.leyoujia.coa.zc.client.mall.domain.PayResultDto;
import com.leyoujia.coa.zc.client.mall.exception.OrderCreateException;
import com.leyoujia.coa.zc.client.mall.service.ITradeOrderProviderService;
import com.leyoujia.coa.zc.mall.service.IJhsTradeOrderService;
import com.leyoujia.coa.zc.mall.util.UserAccountUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static com.google.common.base.Preconditions.checkArgument;
import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.*;

/**
 * 交易订单服务实现
 *
 * @author lhw
 * @date 2019/7/25
 */
@Service(interfaceClass = ITradeOrderProviderService.class, timeout = 5000)
public class TradeOrderProviderServiceImpl implements ITradeOrderProviderService {
  private static final Logger LOGGER = LoggerFactory.getLogger(TradeOrderProviderServiceImpl.class);
  @Autowired
  private IJhsTradeOrderService jhsTradeOrderService;

  @Override
  public PageInfo<OrderDto> listOrderByWorkerIdAndChannel(String workerId, Integer channel, PageInfo<OrderDto> pageInfo) {
    workerId = StringUtils.isNotEmpty(workerId) && channel != null ? UserAccountUtil.getUserId(channel, workerId) : workerId;
    return this.jhsTradeOrderService.listByWorkerAndChannel(workerId, channel, pageInfo);
  }

  @Override
  public OrderDetailDto getOrderDetailById(Integer orderId) {
    return this.jhsTradeOrderService.getOrderDetailById(orderId);
  }

  @Override
  public OrderDetailDto createOrder(OrderCommand command, Integer channel) throws IllegalArgumentException, OrderCreateException {
    checkArgument(command != null, "订单参数不能为空!");
    checkArgument(PC_MALL.equals(channel) || APP_MALL.equals(channel) || LEYOUJIA_MALL.equals(channel), "渠道类型错误!");

    command.setFrom(channel);

    // 乐有家网用户ID加前缀
    if (StringUtils.isNotEmpty(command.getUserId()) && LEYOUJIA_MALL.equals(command.getFrom())) {
      command.setUserId(UserAccountUtil.getUserId(command.getFrom(), command.getUserId()));
    }

    return this.jhsTradeOrderService.createOrder(command);
  }

  @Override
  public PayResultDto payOrder(Integer orderId, String payment, Integer channel) {
    PayResultDto payResultDto = new PayResultDto();
    //乐有家网支付方式只能为乐豆
    if (orderId == null || (LEYOUJIA_MALL.equals(channel) && !StringUtils.equals(payment, CommodityConst.PAYMENT_LD))) {
      payResultDto.setCode(PayResultDto.CODE_PARAM_ERROR);
      return payResultDto;
    }
    try {
      payResultDto = this.jhsTradeOrderService.payOrder(orderId, payment);
    } catch (Exception e) {
      LOGGER.error("订单支付--支付异常，订单ID：{}，渠道{}，异常：{}", orderId, channel, e);
      payResultDto.setCode(PayResultDto.CODE_SYS_ERROR);
    }
    return payResultDto;
  }
}
