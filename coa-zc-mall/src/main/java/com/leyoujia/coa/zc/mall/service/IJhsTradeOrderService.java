package com.leyoujia.coa.zc.mall.service;

import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.OrderCommand;
import com.leyoujia.coa.zc.client.mall.domain.OrderDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderDto;
import com.leyoujia.coa.zc.client.mall.exception.OrderCreateException;
import com.leyoujia.coa.zc.client.mall.domain.PayResultDto;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsTradeOrder;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * 订单service接口
 *
 * @author l
 * @since 2019/7/26
 */
public interface IJhsTradeOrderService {
  /**
   * 根据用户与订单状态查询订单
   *
   * @param workerId 用户标识
   * @param statuses 状态列表
   * @return 订单列表
   */
  List<JhsTradeOrder> listByWorkerAndStatus(String workerId, List<Integer> statuses);

  /**
   * 根据用户与渠道查询订单
   *
   * @param workerId 用户标识
   * @param channel  下单渠道
   * @param pageInfo 分页信息
   * @return 订单列表
   */
  PageInfo<OrderDto> listByWorkerAndChannel(String workerId, Integer channel, PageInfo pageInfo);

  /**
   * 根据订单id查询订单详情
   *
   * @param orderId 订单id
   * @return 订单详情
   */
  OrderDetailDto getOrderDetailById(Integer orderId);

  /**
   * 创建订单
   *
   * @param command 订单参数
   * @return 订单
   * @throws OrderCreateException 订单创建异常
   */
  OrderDetailDto createOrder(@Nonnull OrderCommand command) throws OrderCreateException;

  /**
   * 根据订单编号查询订单
   *
   * @param orderNo 订单编号
   * @return 订单信息
   */
  JhsTradeOrder getOrderByOrderNo(String orderNo);

  /**
   * 支付订单
   *
   * @param orderId 订单id
   * @param payment 支付方式
   * @return 支付结果
   */
  PayResultDto payOrder(Integer orderId, String payment);

  /**
   * 订单获取兑换码
   *
   * @param order 订单
   */
  void orderGetExchangeCode(JhsTradeOrder order);

  /**
   * 订单获取兑换链接
   * @param order 订单
   * @param link 兑换链接
   */
  void orderGetExchangeLink(JhsTradeOrder order, String link);

}
