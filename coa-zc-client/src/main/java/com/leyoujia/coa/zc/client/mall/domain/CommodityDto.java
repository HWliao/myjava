package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;

/**
 * 商品dto
 *
 * @author l
 * @since 2019/7/25
 */
public class CommodityDto implements Serializable {

  private static final long serialVersionUID = -6466332797598643329L;

  /**
   * 商品主键id
   */
  private Integer id;
  /**
   * 商品标题
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
   * 商品主图
   */
  private String image;
  /**
   * 商品数量
   */
  private Integer count;
  /**
   * 商品单价
   */
  private Double price;
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

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "CommodityDto{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", image='" + image + '\'' +
      ", price=" + price +
      '}';
  }
}
