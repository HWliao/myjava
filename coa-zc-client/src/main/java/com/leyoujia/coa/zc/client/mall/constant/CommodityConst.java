package com.leyoujia.coa.zc.client.mall.constant;

/**
 * 商品常量
 *
 * @author lhw
 * @date 2019/7/29
 */
public interface CommodityConst {
  /**
   * 虚拟类分类根id
   */
  Integer VIRTUAL_SUB_ROOT_ID = 251;
  /**
   * 兑换码
   */
  Integer COMMODITY_EXCHANGE_CODE = 252;
  /**
   * 兑换链接
   */
  Integer COMMODITY_EXCHANGE_LINK = 253;

  /**
   * 服装类商品
   */
  Integer COMMODITY_CLOTH = 67;
  /**
   * 公费套装1
   */
  Integer COMMODITY_GF1 = 204;
  /**
   * 公费套装2
   */
  Integer COMMODITY_GF2 = 205;
  /**
   * 公费套装3
   */
  Integer COMMODITY_GF3 = 206;
  /**
   * 体检类商品
   */
  Integer COMMODITY_MEDICAL_EXAMINER = 250;

  /**
   * 商品在售--上架
   */
  Integer ON_SALE = 0;
  /**
   * 商品已审核
   */
  Integer STATUS_AUDITED = 1;

  /**
   * 下架
   */
  Integer IS_DOWN_Y = 1;
  /**
   * 上架
   */
  Integer IS_DOWN_N = 0;
  /**
   * 未审核
   */
  Integer STATUS_UNCHECKED = 0;
  /**
   * 已通过审核
   */
  Integer STATUS_CHECKED = 1;
  /**
   * 未通过审核
   */
  Integer STATUS_CHECKED_NO = 2;
  /**
   * 已锁定-等待买家付款
   */
  Integer STATUS_LOCKED = 6;
  /**
   * 拍卖中
   */
  Integer STATUS_AUCTIONNING = 8;

  /**
   * 兑换条件：单次
   */
  Integer EXCHANGE_CONDITION_ONCE = 1;
  /**
   * 兑换条件：多次
   */
  Integer EXCHANGE_CONDITION_REPEATEDLY = 2;

  /**
   * 支付方式--网银
   */
  String PAYMENT_ONLINE_BANKING = "1";
  /**
   * 支付方式--支付宝
   */
  String PAYMENT_ALIPAY = "2";
  /**
   * 支付方式--储备金
   */
  String PAYMENT_CBJ = "3";
  /**
   *支付方式-- 乐豆
   */
  String PAYMENT_LD = "4";
  /**
   * 兑换码有效
   */
  Integer EXCHANGE_CODE_VALID = 1;
  /**
   * 兑换码无效
   */
  Integer EXCHANGE_CODE_INVALID = 0;
}
