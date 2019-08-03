package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 订单参数, 用于创建订单
 *
 * @author lhw
 * @date 2019/7/31
 */
public class OrderCommand implements Serializable {
  private static final long serialVersionUID = -5873857287014913458L;

  /**
   * 用户ID 必填
   */
  private String userId;
  /**
   * 用户名称 乐有家网订单必填
   */
  private String userName;
  /**
   * 订单来源/渠道 必填 1 乐划算 2 乐办公 3 乐有家网, 以createOrder参数channel为主
   */
  private Integer from;
  /**
   * 商品ID 必填
   */
  private Integer commodityId;
  /**
   * 购买数量 必填 注意有虚拟类商品/服装套装商品 只能购买一个
   */
  private Long count;
  /**
   * 有分类字典的商品必须选择商品分类字典 对应CommodityDictDto.dict
   */
  private String dictText;

  /**
   * 收货方式 1 快递 2 自取
   * 虚拟类商品 只能选择自取
   * 其他商品可以选择快递或者自取
   * 选择快递时必须填写收件人和收件地址
   */
  private Integer takeType;
  /**
   * 收件人
   */
  private String takeWorker;
  /**
   * 收件人号码
   */
  private String takePhone;
  /**
   * 收件 - 省
   */
  private String takeProvince;
  /**
   * 收件 - 市
   */
  private String takeCity;
  /**
   * 收件 - 区
   */
  private String takeArea;
  /**
   * 收件地址
   */
  private String takeAdrr;
  /**
   * 分行名称(不包含组别),收件人地址自动填充时需要的参数
   */
  private String shopName;

  /**
   * 备注说明 100个字符 非必填
   */
  private String remark;

  /**
   * 带有子商品的商品购买时,需要选择商品"规格"
   * 主要指的是 服装套装类(公费套装/非公费套装)商品
   * 此类商品带有子商品,且子商品带有分类字典(规格), 每种商品对应的每种规格的库存有外部供应商管理(有单独的管理平台)
   * 此类商品购买时必须要勾选每种子商品的对应规格
   */
  private List<OrderDictDto> standard;
  /**
   * 体检人信息, 体检类商品必填, 其他不用填写
   */
  private OrderMedicalExaminerDto medicalExaminer;

  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }

  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public String getDictText() {
    return dictText;
  }

  public void setDictText(String dictText) {
    this.dictText = dictText;
  }

  public Integer getTakeType() {
    return takeType;
  }

  public void setTakeType(Integer takeType) {
    this.takeType = takeType;
  }

  public String getTakeWorker() {
    return takeWorker;
  }

  public void setTakeWorker(String takeWorker) {
    this.takeWorker = takeWorker;
  }

  public String getTakePhone() {
    return takePhone;
  }

  public void setTakePhone(String takePhone) {
    this.takePhone = takePhone;
  }

  public String getTakeProvince() {
    return takeProvince;
  }

  public void setTakeProvince(String takeProvince) {
    this.takeProvince = takeProvince;
  }

  public String getTakeCity() {
    return takeCity;
  }

  public void setTakeCity(String takeCity) {
    this.takeCity = takeCity;
  }

  public String getTakeArea() {
    return takeArea;
  }

  public void setTakeArea(String takeArea) {
    this.takeArea = takeArea;
  }

  public String getTakeAdrr() {
    return takeAdrr;
  }

  public void setTakeAdrr(String takeAdrr) {
    this.takeAdrr = takeAdrr;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public List<OrderDictDto> getStandard() {
    return standard;
  }

  public void setStandard(List<OrderDictDto> standard) {
    this.standard = standard;
  }

  public OrderMedicalExaminerDto getMedicalExaminer() {
    return medicalExaminer;
  }

  public void setMedicalExaminer(OrderMedicalExaminerDto medicalExaminer) {
    this.medicalExaminer = medicalExaminer;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "OrderCommand{" +
      "userId='" + userId + '\'' +
      ", userName='" + userName + '\'' +
      ", from=" + from +
      ", commodityId=" + commodityId +
      ", count=" + count +
      ", dictText='" + dictText + '\'' +
      ", takeType=" + takeType +
      ", takeWorker='" + takeWorker + '\'' +
      ", takePhone='" + takePhone + '\'' +
      ", takeProvince='" + takeProvince + '\'' +
      ", takeCity='" + takeCity + '\'' +
      ", takeArea='" + takeArea + '\'' +
      ", takeAdrr='" + takeAdrr + '\'' +
      ", remark='" + remark + '\'' +
      ", standard=" + standard +
      ", medicalExaminer=" + medicalExaminer +
      '}';
  }
}
