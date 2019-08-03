package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;

/**
 * 支付结果dto
 *
 * @author l
 * @since 2019/7/30
 */
public class PayResultDto implements Serializable {
  private static final long serialVersionUID = 3123244838474298033L;
  /**
   * 支付结果--未找到订单
   */
  public static final Integer CODE_NOT_FOUND = 0;
  /**
   * 支付结果--已付款
   */
  public static final Integer CODE_PAID = 1;
  /**
   * 支付结果--已处理
   */
  public static final Integer CODE_DEALT = 2;
  /**
   * 支付结果--库存不足
   */
  public static final Integer CODE_SHORTAGE = 3;
  /**
   * 支付结果--支付失败
   */
  public static final Integer CODE_PAY_FAILURE = 4;
  /**
   * 支付结果--支付成功
   */
  public static final Integer CODE_SUCCEED = 5;
  /**
   * 支付结果--参数错误
   */
  public static final Integer CODE_PARAM_ERROR = 6;
  /**
   * 支付结果--系统错误
   */
  public static final Integer CODE_SYS_ERROR = 7;
  /**
   * 支付结果编号
   */
  private Integer code;
  /**
   * 支付方式
   */
  private String payment;
  /**
   * 支付订单
   */
  private OrderDetailDto order;
  /**
   * 支付账号
   */
  private String account;
  /**
   * 账号名
   */
  private String accountName;
  /**
   * 支付银行
   */
  private String bank;
  /**
   * 二维码
   */
  private String QRCode;
  /**
   * 支付编码
   */
  private String payCode;
  /**
   * 支付金额
   */
  private Double amount;

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public OrderDetailDto getOrder() {
    return order;
  }

  public void setOrder(OrderDetailDto order) {
    this.order = order;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getQRCode() {
    return QRCode;
  }

  public void setQRCode(String QRCode) {
    this.QRCode = QRCode;
  }

  public String getPayCode() {
    return payCode;
  }

  public void setPayCode(String payCode) {
    this.payCode = payCode;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "PayResultDto{" +
      "code=" + code +
      ", payment='" + payment + '\'' +
      ", order='" + order + '\'' +
      ", account='" + account + '\'' +
      ", accountName='" + accountName + '\'' +
      ", bank='" + bank + '\'' +
      ", QRCode='" + QRCode + '\'' +
      ", payCode='" + payCode + '\'' +
      ", amount=" + amount +
      '}';
  }
}
