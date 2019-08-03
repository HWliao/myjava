package com.leyoujia.coa.zc.client.mall.service;

import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.OrderCommand;
import com.leyoujia.coa.zc.client.mall.domain.OrderDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderDto;
import com.leyoujia.coa.zc.client.mall.exception.OrderCreateException;
import com.leyoujia.coa.zc.client.mall.domain.PayResultDto;

/**
 * 交易订单服务
 *
 * @author lhw
 * @date 2019/7/25
 */
public interface ITradeOrderProviderService {
  /**
   * 查询订单列表
   *
   * @param workerId 用户id
   * @param channel  下单渠道 1 乐划算 2 乐办公 3 乐有家网
   *                 为null时查询所有渠道
   * @param pageInfo 分页条件
   *                 需设置pageNum--页码
   *                 pageSize--每页条数
   * @return 订单列表
   */
  PageInfo<OrderDto> listOrderByWorkerIdAndChannel(String workerId, Integer channel, PageInfo<OrderDto> pageInfo);

  /**
   * 查询订单详情
   *
   * @param orderId 订单主键id
   * @return 订单详情
   */
  OrderDetailDto getOrderDetailById(Integer orderId);

  /**
   * 创建交易订单
   *
   * @param command 创建订单需要的参数 不能为空
   *                command内部有一个form属性,意义同channel,不用设置
   * @param channel 订单来源/渠道 1 乐划算 2 乐办公 3 乐有家网 不能为空
   * @return 订单
   * @throws OrderCreateException     创建订单失败时,会抛出此异常
   * @throws IllegalArgumentException 方法参数错误
   */
  OrderDetailDto createOrder(OrderCommand command, Integer channel) throws IllegalArgumentException, OrderCreateException;
  /**
   * 支付订单
   * @param orderId 订单id
   * @param payment 支付方式
   *                2支付宝、3储备奖、4乐豆
   * @param channel 订单渠道
   *                1 乐划算 2 乐办公 3 乐有家网 不能为空
   * @return
   */
  PayResultDto payOrder(Integer orderId, String payment, Integer channel);
}
