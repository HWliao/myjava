package com.leyoujia.coa.zc.mall.domain.mall;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 移动端
 *
 * @author lhw
 * @date 2019/7/26
 */
public class AppCommodityDto implements Serializable {

  private static final long serialVersionUID = -7216343919744111409L;
  /**
   * 商品id
   */
  private Integer commodityId;
  /**
   * 商品名称
   */
  private String title;

  /**
   * 类别id
   */
  private Integer categoryId;
  /**
   * 类别名
   */
  private String categoryName;
  /**
   * 商品短名
   */
  private String shortName;
  /**
   * 图片链接
   */
  private String photoUrl;
  /**
   * 商品数量
   */
  private Integer count;
  /**
   * 单价
   */
  private BigDecimal price;
  /**
   * 支付方式 2 支付宝 3 储备金 4 乐豆 2,3,4 表示支持3种支付方式
   */
  private String payMethod;

  /**
   * 商品为兑换码/兑换链接 兑换条件 1 单次兑换 2 多次兑换
   */
  private Integer exchangeCondition;

  /**
   * 订单ID 已购买的商品对应的订单id 针对单次兑换的商品
   */
  private Integer orderId;
  /**
   * 订单状态 -1已过期, 0等待付款, 1已取消, 2已付款, 3已发货, 4买家已收货, 5交易成功
   */
  private Integer orderStatus;

  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getPayMethod() {
    return payMethod;
  }

  public void setPayMethod(String payMethod) {
    this.payMethod = payMethod;
  }

  public Integer getExchangeCondition() {
    return exchangeCondition;
  }

  public void setExchangeCondition(Integer exchangeCondition) {
    this.exchangeCondition = exchangeCondition;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }

  @Override
  public String toString() {
    return "AppCommodityDto{" +
      "commodityId=" + commodityId +
      ", title='" + title + '\'' +
      ", categoryId=" + categoryId +
      ", categoryName='" + categoryName + '\'' +
      ", shortName='" + shortName + '\'' +
      ", photoUrl='" + photoUrl + '\'' +
      ", count=" + count +
      ", price=" + price +
      ", payMethod='" + payMethod + '\'' +
      ", exchangeCondition=" + exchangeCondition +
      ", orderId=" + orderId +
      ", orderStatus=" + orderStatus +
      '}';
  }
}
