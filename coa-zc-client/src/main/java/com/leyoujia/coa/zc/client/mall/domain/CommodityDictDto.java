package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;

/**
 * @author lhw
 * @date 2019/7/29
 */
public class CommodityDictDto implements Serializable {
  private static final long serialVersionUID = 2136245587545939712L;

  /**
   * 分类
   */
  private String dict;
  /**
   * 数量
   */
  private Long num;

  public String getDict() {
    return dict;
  }

  public void setDict(String dict) {
    this.dict = dict;
  }

  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "CommodityDictDto{" +
      "dict='" + dict + '\'' +
      ", num=" + num +
      '}';
  }
}
