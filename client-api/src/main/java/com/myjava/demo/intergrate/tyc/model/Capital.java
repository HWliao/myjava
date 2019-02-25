package com.myjava.demo.intergrate.tyc.model;

import java.io.Serializable;

/**
 * 认缴记录
 *
 * @author lhw
 * @date 2019/2/25
 */
public class Capital implements Serializable {
  private static final long serialVersionUID = -2164232583148038752L;

  /**
   * 认缴金额
   */
  private String amomon;
  /**
   * 认缴时间
   */
  private String time;
  /**
   * 出资比例
   */
  private String percent;
  /**
   * 出资形式
   */
  private String paymet;

  public String getAmomon() {
    return amomon;
  }

  public void setAmomon(String amomon) {
    this.amomon = amomon;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getPercent() {
    return percent;
  }

  public void setPercent(String percent) {
    this.percent = percent;
  }

  public String getPaymet() {
    return paymet;
  }

  public void setPaymet(String paymet) {
    this.paymet = paymet;
  }
}
