package com.leyoujia.coa.zc.mall.domain.mall;

import com.google.common.collect.Lists;
import com.leyoujia.coa.zc.mall.dao.erp.entity.*;
import org.apache.commons.collections4.CollectionUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import static com.leyoujia.coa.zc.client.mall.constant.CommodityConst.*;

/**
 * 商品领域模型
 *
 * @author lhw
 * @date 2019/7/29
 */
public class CommodityDomain implements Serializable {
  private static final long serialVersionUID = -3453677778941346056L;

  /**
   * 商品基本信息
   */
  private JhsCommodity commodity;
  /**
   * 商品分类
   */
  private List<JhsCommodityDict> dicts;
  /**
   * 商品描述
   */
  private JhsCommodityText text;
  /**
   * 商品类别
   */
  private JhsSubject subject;
  /**
   * 子商品
   */
  private List<CommodityDomain> childs;

  /**
   * 子商品类别
   */
  private String childType;
  /**
   * 子商品互斥标识
   */
  private String childOnlyOne;

  // ==== 商品库存先关 ====

  /**
   * 服装类商品具有真正的库存管理
   */
  private List<JhsCommodityStock> stocks;
  /**
   * 兑换码,在售/有效数量
   */
  private Long exchangeCodeNum;

  // ==== 商品类别先关 ====

  /**
   * 是否为子商品
   */
  private boolean child;
  /**
   * 是否为服装类商品
   */
  private boolean cloth;
  /**
   * 是否为套装
   */
  private boolean suit;
  /**
   * 是否为公费套装
   */
  private boolean gfSuit;
  /**
   * 是否为体检类商品
   */
  private boolean medicalExaminer;
  /**
   * 是否虚拟类商品
   */
  private boolean virtual;
  /**
   * 兑换码
   */
  private boolean exchangeCode;
  /**
   * 兑换链接
   */
  private boolean exchangeLink;


  /**
   * 是否只能单次购买
   *
   * @return 是否
   */
  public boolean canOnlyOne() {
    return this.getCommodity() != null && this.isVirtual() && Objects.equals(this.getCommodity().getExchangeCondition(), EXCHANGE_CONDITION_ONCE);

  }

  /**
   * 判断买家和卖家是否同一个人
   *
   * @param buyer 买家
   * @return 是否
   */
  public boolean isSlef(@Nullable String buyer) {
    return this.getCommodity() != null && Objects.equals(buyer, this.getCommodity().getSellerWorkerId());
  }


  /**
   * 是否为有效商品(可以出售/购买)
   *
   * @return 是否
   */
  public boolean isValidCommodity() {
    return this.getCommodity() != null
      && Objects.equals(this.getCommodity().getIsDown(), IS_DOWN_N)
      && (Objects.equals(this.getCommodity().getStatus(), STATUS_CHECKED)
      || Objects.equals(this.getCommodity().getStatus(), STATUS_AUCTIONNING));
  }

  @Nullable
  public CommodityDomain findChild(@Nonnull Integer commodityId) {
    List<CommodityDomain> tmps = this.getChilds();
    tmps = CollectionUtils.isNotEmpty(tmps) ? tmps : Lists.newArrayList();
    return tmps.stream().filter(tmp -> Objects.equals(tmp.getCommodity().getId(), commodityId)).findFirst().orElse(null);
  }

  public boolean hasChild() {
    return this.childs != null && this.childs.size() > 0;
  }

  public boolean isExchangeCode() {
    return exchangeCode;
  }

  public void setExchangeCode(boolean exchangeCode) {
    this.exchangeCode = exchangeCode;
  }

  public boolean isExchangeLink() {
    return exchangeLink;
  }

  public void setExchangeLink(boolean exchangeLink) {
    this.exchangeLink = exchangeLink;
  }

  public List<JhsCommodityDict> getDicts() {
    return dicts;
  }

  public void setDicts(List<JhsCommodityDict> dicts) {
    this.dicts = dicts;
  }

  public JhsCommodity getCommodity() {
    return commodity;
  }

  public void setCommodity(JhsCommodity commodity) {
    this.commodity = commodity;
  }

  public JhsCommodityText getText() {
    return text;
  }

  public void setText(JhsCommodityText text) {
    this.text = text;
  }

  public JhsSubject getSubject() {
    return subject;
  }

  public void setSubject(JhsSubject subject) {
    this.subject = subject;
  }

  public List<CommodityDomain> getChilds() {
    return childs;
  }

  public void setChilds(List<CommodityDomain> childs) {
    this.childs = childs;
  }

  public List<JhsCommodityStock> getStocks() {
    return stocks;
  }

  public void setStocks(List<JhsCommodityStock> stocks) {
    this.stocks = stocks;
  }

  public Long getExchangeCodeNum() {
    return exchangeCodeNum;
  }

  public void setExchangeCodeNum(Long exchangeCodeNum) {
    this.exchangeCodeNum = exchangeCodeNum;
  }

  public boolean isChild() {
    return child;
  }

  public void setChild(boolean child) {
    this.child = child;
  }

  public boolean isCloth() {
    return cloth;
  }

  public void setCloth(boolean cloth) {
    this.cloth = cloth;
  }

  public boolean isSuit() {
    return suit;
  }

  public void setSuit(boolean suit) {
    this.suit = suit;
  }

  public boolean isGfSuit() {
    return gfSuit;
  }

  public void setGfSuit(boolean gfSuit) {
    this.gfSuit = gfSuit;
  }

  public boolean isMedicalExaminer() {
    return medicalExaminer;
  }

  public void setMedicalExaminer(boolean medicalExaminer) {
    this.medicalExaminer = medicalExaminer;
  }

  public boolean isVirtual() {
    return virtual;
  }

  public void setVirtual(boolean virtual) {
    this.virtual = virtual;
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

  @Override
  public String toString() {
    return "CommodityDomain{" +
      "commodity=" + commodity +
      ", dicts=" + dicts +
      ", text=" + text +
      ", subject=" + subject +
      ", childs=" + childs +
      ", childType='" + childType + '\'' +
      ", childOnlyOne='" + childOnlyOne + '\'' +
      ", stocks=" + stocks +
      ", exchangeCodeNum=" + exchangeCodeNum +
      ", child=" + child +
      ", cloth=" + cloth +
      ", suit=" + suit +
      ", gfSuit=" + gfSuit +
      ", medicalExaminer=" + medicalExaminer +
      ", virtual=" + virtual +
      ", exchangeCode=" + exchangeCode +
      ", exchangeLink=" + exchangeLink +
      '}';
  }

}
