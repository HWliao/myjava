package com.leyoujia.coa.zc.client.mall.constant;

import java.util.Arrays;
import java.util.List;

/**
 * 订单常量
 *
 * @author lhw
 * @date 2019/7/29
 */
public interface OrderConst {
  /**
   * 已过期
   **/
  Integer STATUS_EXPIRE = -1;
  /**
   * 待付款
   **/
  Integer STATUS_WAITIND_PAYMENT = 0;
  /**
   * 已取消
   **/
  Integer STATUS_CANCEL = 1;
  /**
   * 已付款
   **/
  Integer STATUS_PAID = 2;
  /**
   * 已发货
   **/
  Integer STATUS_SHIPPED = 3;
  /**
   * 已收货
   **/
  Integer STATUS_RECEIVED = 4;
  /**
   * 交易成功
   **/
  Integer STATUS_SUCCEED = 5;
  /**
   * 已结款
   **/
  Integer STATUS_SETTLED = 8;
  /**
   * 待收款
   **/
  Integer STATUS_PENDING_PAYMENT = 11;

  /**
   * 工资代扣
   */
  Integer STATUS_GZDK = 20;
  /**
   * 公费
   */
  Integer STATUS_GF = 21;
  /**
   * 报销中
   **/
  Integer STATUS_REIMBURSING = 40;
  /**
   * 报销不通过
   **/
  Integer STATUS_REIMBURSE_UNQUALIFIED = 41;
  /**
   * 报销通过
   **/
  Integer STATUS_REIMBURSE_QUALIFIED = 42;
  /**
   * 有效订单状态
   */
  List<Integer> VALID_ORDER_STATUSES = Arrays.asList(STATUS_WAITIND_PAYMENT, STATUS_PAID, STATUS_SHIPPED, STATUS_RECEIVED, STATUS_SUCCEED, STATUS_SETTLED, STATUS_REIMBURSING, STATUS_REIMBURSE_UNQUALIFIED, STATUS_REIMBURSE_QUALIFIED);

  /**
   * 收货方式 快递
   */
  Integer TAKE_POST = 1;
  /**
   * 收货方式 自取
   */
  Integer TAKE_SELF = 2;

  /**
   * 兑换码
   */
  Integer EXCHANGE_METHOD_CODE = 1;
  /**
   * 兑换链接
   */
  Integer EXCHANGE_METHOD_LINK = 2;
  /**
   * 公费订单的后缀
   */
  String GF_ORDER_SUFFIX = "-gf";
}
