package com.leyoujia.coa.zc.client.mall.domain;

import java.io.Serializable;

/**
 * 订单包含子商品分类
 *
 * @author lhw
 * @date 2019/7/31
 */
public class OrderDictDto implements Serializable {
  private static final long serialVersionUID = -5477602779393347975L;

  /**
   * 子商品ID
   */
  private Integer id;
  /**
   * 子商品名称(短名)
   */
  private String name;
  /**
   * 所选子商品分类
   */
  private String dictText;
  /**
   * 是否为公费子商品
   */
  private boolean isGf;
  /**
   * 购买数量,可以不填写以父商品为自主
   */
  private Integer count;

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDictText() {
    return dictText;
  }

  public void setDictText(String dictText) {
    this.dictText = dictText;
  }

  public boolean isGf() {
    return isGf;
  }

  public void setGf(boolean gf) {
    isGf = gf;
  }

  @Override
  public String toString() {
    return "OrderDictDto{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", dictText='" + dictText + '\'' +
      ", isGf=" + isGf +
      ", count=" + count +
      '}';
  }
}
