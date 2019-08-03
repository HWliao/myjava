package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单详情Dto
 *
 * @author l
 * @since 2019/7/29
 */
public class OrderDetailDto implements Serializable {
  private static final long serialVersionUID = 6881050922634279754L;
  /**
   * 主键id
   */
  private Integer id;
  /**
   * 订单号
   */
  private String orderNo;
  /**
   * 商品id
   */
  private Integer commodityId;
  /**
   * 商品名称
   */
  private String commodityName;
  /**
   * 商品单价格
   */
  private Double price;
  /**
   * 购买数量
   */
  private Integer count;
  /**
   * 总价
   */
  private Double total;
  /**
   * 来源 1 pc乐划算 2 乐办公 3 乐有家网
   */
  private Integer ofrom;
  /**
   * 订单状态
   * -1已过期, 0等待付款, 1已取消, 2已付款, 3已发货, 4买家已收货,
   * 5交易成功, 8已结款, 11待确认收款,  99交易关闭, 20工资代扣,
   * 21公费, 30退款审批中、31退款审批不通过、32退款审批通过、33已退款、
   * 40报销审批中、41报销审批不通过、42报销审批通过
   */
  private Integer status;
  /**
   * 员工ID/用户标识
   */
  private String workerId;
  /**
   * 确认收货时间/交易成功时间
   */
  private Date receiptDate;
  /**
   * 支付方式(0现金1现金和积分 废除)2支付宝3储备奖4顺豆
   */
  private String payMethod;
  /**
   * 结款时间
   */
  private Date paymentDate;
  /**
   * 交易终止时间
   */
  private Date stopTradeDate;
  /**
   * 兑换方式 1 兑换码 2 兑换链接
   */
  private Integer exchangeMethod;
  /**
   * 兑换链接
   */
  private String exchangeLink;
  /**
   * 兑换码
   */
  private String exchangeCode;
  /**
   * 商品主图
   */
  private String image;
  /**
   * 商品描述
   */
  private String describe;
  /**
   * 使用说明
   */
  private String manual;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }

  public String getCommodityName() {
    return commodityName;
  }

  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public Integer getOfrom() {
    return ofrom;
  }

  public void setOfrom(Integer ofrom) {
    this.ofrom = ofrom;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public Date getReceiptDate() {
    return receiptDate;
  }

  public void setReceiptDate(Date receiptDate) {
    this.receiptDate = receiptDate;
  }

  public String getPayMethod() {
    return payMethod;
  }

  public void setPayMethod(String payMethod) {
    this.payMethod = payMethod;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Date getStopTradeDate() {
    return stopTradeDate;
  }

  public void setStopTradeDate(Date stopTradeDate) {
    this.stopTradeDate = stopTradeDate;
  }

  public Integer getExchangeMethod() {
    return exchangeMethod;
  }

  public void setExchangeMethod(Integer exchangeMethod) {
    this.exchangeMethod = exchangeMethod;
  }

  public String getExchangeLink() {
    return exchangeLink;
  }

  public void setExchangeLink(String exchangeLink) {
    this.exchangeLink = exchangeLink;
  }

  public String getExchangeCode() {
    return exchangeCode;
  }

  public void setExchangeCode(String exchangeCode) {
    this.exchangeCode = exchangeCode;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }

  public String getManual() {
    return manual;
  }

  public void setManual(String manual) {
    this.manual = manual;
  }

  @Override
  public String toString() {
    return "OrderDetailDto{" +
      "id=" + id +
      ", orderNo='" + orderNo + '\'' +
      ", commodityId=" + commodityId +
      ", commodityName='" + commodityName + '\'' +
      ", price=" + price +
      ", count=" + count +
      ", total=" + total +
      ", ofrom=" + ofrom +
      ", status=" + status +
      ", workerId='" + workerId + '\'' +
      ", receiptDate=" + receiptDate +
      ", payMethod='" + payMethod + '\'' +
      ", paymentDate=" + paymentDate +
      ", stopTradeDate=" + stopTradeDate +
      ", exchangeMethod=" + exchangeMethod +
      ", exchangeLink='" + exchangeLink + '\'' +
      ", exchangeCode='" + exchangeCode + '\'' +
      ", image='" + image + '\'' +
      ", describe='" + describe + '\'' +
      ", manual='" + manual + '\'' +
      '}';
  }
}
