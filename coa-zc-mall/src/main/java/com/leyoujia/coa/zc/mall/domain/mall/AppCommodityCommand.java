package com.leyoujia.coa.zc.mall.domain.mall;

import java.io.Serializable;

/**
 * 移动端参数类型
 *
 * @author lhw
 * @date 2019/7/26
 */
public class AppCommodityCommand implements Serializable {

  private static final long serialVersionUID = -2984901844555570044L;

  /**
   * 员工工号
   */
  private String empNo;
  /**
   * 员工ID
   */
  private String empNumber;
  /**
   * 商品id
   */
  private Integer commodityId;
  /**
   * 订单号
   */
  private String orderNo;
  /**
   * 订单id
   */
  private Integer orderId;

  /**
   * 页面
   */
  private Integer pageNum;
  /**
   * 每页数据条数
   */
  private Integer pageSize;

  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }

  public String getEmpNumber() {
    return empNumber;
  }

  public void setEmpNumber(String empNumber) {
    this.empNumber = empNumber;
  }

  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  @Override
  public String toString() {
    return "AppCommodityCommand{" +
      "empNo='" + empNo + '\'' +
      ", empNumber='" + empNumber + '\'' +
      ", commodityId=" + commodityId +
      ", orderNo='" + orderNo + '\'' +
      ", orderId=" + orderId +
      ", pageNum=" + pageNum +
      ", pageSize=" + pageSize +
      '}';
  }
}
