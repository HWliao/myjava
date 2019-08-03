package com.leyoujia.coa.zc.client.mall.exception;

import com.leyoujia.coa.zc.client.exception.BusinessException;

/**
 * 订单参数异常
 *
 * @author lhw
 * @date 2019/7/31
 */
public class OrderCreateException extends BusinessException {
  private static final long serialVersionUID = -9139445547759388816L;

  /**
   * 订单参数 空检验/有效性校验不通过
   */
  public static final int COMMAND_ERROR = 1;

  /**
   * 未找到有效商品
   */
  public static final int COMMODITY_NOT_FOUND = 10;
  /**
   * 无效商品
   */
  public static final int COMMODITY_INVALID = 11;
  /**
   * 商品库存不足
   */
  public static final int COMMODITY_NO_STOCK = 12;
  /**
   * 购买受限 有的商品只能买一次/不能购买自己上架的商品
   */
  public static final int COMMODITY_RSTRICTED = 13;
  /**
   * 分类字典选择错误/规格选择错误
   */
  public static final int COMMODITY_DICT_ERROR = 14;
  /**
   * 商品设置/配置 错误 服装类商品必须带有分类字典 套装必须带有子商品
   */
  public static final int COMMODITY_SETTING_ERROR = 15;
  /**
   * 用户ID/员工编号 为空/无效/找不到员工
   */
  public static final int USER_ID_INVALID = 20;
  /**
   * 用户名称 为空/无效
   */
  public static final int USER_NAME_INVALID = 21;
  /**
   * 创建订单失败, 插入数据失败
   */
  public static final int ORDER_CREATE_ERROR = 30;

  /**
   * 错误码
   */
  private int code;

  public OrderCreateException() {
  }

  public OrderCreateException(String message) {
    super(message);
  }

  public OrderCreateException(String message, Throwable cause) {
    super(message, cause);
  }

  public OrderCreateException(Throwable cause) {
    super(cause);
  }

  public OrderCreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public OrderCreateException(int code) {
    this.code = code;
  }

  public OrderCreateException(String message, int code) {
    super(message);
    this.code = code;
  }

  public OrderCreateException(String message, Throwable cause, int code) {
    super(message, cause);
    this.code = code;
  }

  public OrderCreateException(Throwable cause, int code) {
    super(cause);
    this.code = code;
  }

  public OrderCreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
    super(message, cause, enableSuppression, writableStackTrace);
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
