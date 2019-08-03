package com.leyoujia.coa.zc.mall.manager.mall;

import com.leyoujia.coa.zc.client.mall.domain.PayResultDto;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsTradeOrder;

/**
 * 订单manager接口
 *
 * @author l
 * @since 2019/7/31
 */
public interface IOrderManager {
  /**
   * 调用支付平台支付
   *
   * @param order 订单信息
   * @param payment 支付方式
   * @return 支付结果
   */
  PayResultDto pay(JhsTradeOrder order, String payment);

  /**
   * 支付成功后更新订单、子订单和公费订单
   * @param order 订单信息
   * @param payment 支付方式
   * @return 更新是否成功
   */
  boolean updateOrderForPaySuccess(JhsTradeOrder order, String payment);
}
