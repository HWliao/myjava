package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;

/**
 * 订单体检人信息
 *
 * @author lhw
 * @date 2019/7/31
 */
public class OrderMedicalExaminerDto implements Serializable {
  private static final long serialVersionUID = 2727069371458621434L;

  /**
   * id
   */
  private Integer id;
  /**
   * 订单id,可以为null
   */
  private Integer orderId;
  /**
   * 体检人名称
   */
  private String examinerName;
  /**
   * 身份证号码
   */
  private String idCard;
  /**
   * 电话号码
   */
  private String phoneNumber;
  /**
   * 体检省份
   */
  private String provinceCode;
  private String province;
  /**
   * 体检市
   */
  private String cityCode;
  private String cityName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public String getExaminerName() {
    return examinerName;
  }

  public void setExaminerName(String examinerName) {
    this.examinerName = examinerName;
  }

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  @Override
  public String toString() {
    return "OrderMedicalExaminerDto{" +
      "id=" + id +
      ", orderId=" + orderId +
      ", examinerName='" + examinerName + '\'' +
      ", idCard='" + idCard + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      ", provinceCode='" + provinceCode + '\'' +
      ", province='" + province + '\'' +
      ", cityCode='" + cityCode + '\'' +
      ", cityName='" + cityName + '\'' +
      '}';
  }
}
