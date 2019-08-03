package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 商品详情dto
 *
 * @author l
 * @since 2019/7/26
 */
public class CommodityDetailDto implements Serializable {
  private static final long serialVersionUID = 7141844642430947704L;
  /**
   * 商品id
   */
  private Integer id;
  /**
   * 商品标题
   */
  private String title;
  /**
   * 商品类别id
   */
  private Integer categoryId;
  /**
   * 商品类别名称
   */
  private String categoryName;
  /**
   * 商品简称
   */
  private String shortName;
  /**
   * 商品主图
   */
  private String image;
  /**
   * 商品价格
   */
  private Double price;
  /**
   * 支付方式 2 支付宝 3 储备金 4 乐豆 2,3,4 三种都支持
   */
  private String payMethod;
  /**
   * 兑换条件 1 单次兑换 2 多次兑换
   */
  private Integer exchangeCondition;
  /**
   * 商品数量 存在分类按商品分类中数量买卖,存在子商品按子商品中数量买卖
   */
  private Long quantity;
  /**
   * 商品描述
   */
  private String describe;
  /**
   * 使用说明
   */
  private String manual;
  /**
   * 商品分类
   */
  private List<CommodityDictDto> dicts;
  /**
   * 子商品 成套卖的商品,存在子商品. 主要是服装类商品有套装
   */
  private List<CommodityDetailDto> childs;
  /**
   * 子商品类型 0 公费自费 1 仅公费 2 仅自费
   */
  private String childType;
  /**
   * 唯一性标识,具有相同标识子商品只能购买一个,空或者空字符串不做判断
   */
  private String childOnlyOne;

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

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
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

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getPayMethod() {
    return payMethod;
  }

  public void setPayMethod(String payMethod) {
    this.payMethod = payMethod;
  }

  public List<CommodityDictDto> getDicts() {
    return dicts;
  }

  public void setDicts(List<CommodityDictDto> dicts) {
    this.dicts = dicts;
  }

  public List<CommodityDetailDto> getChilds() {
    return childs;
  }

  public void setChilds(List<CommodityDetailDto> childs) {
    this.childs = childs;
  }

  public String getChildType() {
    return childType;
  }

  public void setChildType(String childType) {
    this.childType = childType;
  }

  public String getChildOnlyOne() {
    return childOnlyOne;
  }

  public void setChildOnlyOne(String childOnlyOne) {
    this.childOnlyOne = childOnlyOne;
  }

  public Integer getExchangeCondition() {
    return exchangeCondition;
  }

  public void setExchangeCondition(Integer exchangeCondition) {
    this.exchangeCondition = exchangeCondition;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
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
    return "CommodityDetailDto{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", categoryId=" + categoryId +
      ", categoryName='" + categoryName + '\'' +
      ", shortName='" + shortName + '\'' +
      ", image='" + image + '\'' +
      ", price=" + price +
      ", payMethod='" + payMethod + '\'' +
      ", exchangeCondition=" + exchangeCondition +
      ", quantity=" + quantity +
      ", describe='" + describe + '\'' +
      ", manual='" + manual + '\'' +
      ", dicts=" + dicts +
      ", childs=" + childs +
      ", childType='" + childType + '\'' +
      ", childOnlyOne='" + childOnlyOne + '\'' +
      '}';
  }
}
