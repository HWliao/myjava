package com.myjava.demo.intergrate.tyc.model;

import java.io.Serializable;
import java.util.List;

/**
 * 股东信息
 *
 * @author lhw
 * @date 2019/2/25
 */
public class Holder implements Serializable {
  private static final long serialVersionUID = -6657336250023088295L;

  /**
   * 拥有公司个数
   */
  private Long toco;
  /**
   * 金额
   */
  private Long amount;
  /**
   * 对应表id
   */
  private Long id;
  /**
   * logo
   */
  private String logo;
  /**
   * 1-公司 2-人
   */
  private Integer type;
  /**
   * 认缴
   */
  private List<Capital> capital;

  public Long getToco() {
    return toco;
  }

  public void setToco(Long toco) {
    this.toco = toco;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public List<Capital> getCapital() {
    return capital;
  }

  public void setCapital(List<Capital> capital) {
    this.capital = capital;
  }
}
