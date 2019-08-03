package com.leyoujia.coa.zc.mall.manager.mall.impl;

import com.google.common.collect.Lists;
import com.leyoujia.coa.zc.mall.dao.erp.auto.*;
import com.leyoujia.coa.zc.mall.dao.erp.entity.*;
import com.leyoujia.coa.zc.mall.domain.mall.CommodityDomain;
import com.leyoujia.coa.zc.mall.manager.mall.ICommodityManager;
import com.leyoujia.coa.zc.mall.util.MallDataVersionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.leyoujia.coa.common.constant.DbConst.DB_STR_Y;
import static com.leyoujia.coa.common.constant.DbConst.DB_Y;
import static com.leyoujia.coa.zc.client.mall.constant.CommodityConst.*;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityTextDynamicSqlSupport.attachId;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsUnitedCommodityDynamicSqlSupport.commodityPid;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author lhw
 * @date 2019/7/29
 */
@Component
public class CommodityManagerImpl implements ICommodityManager {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private IJhsCommodityAutoDAO iJhsCommodityAutoDAO;
  @Autowired
  private IJhsCommodityDictAutoDAO iJhsCommodityDictAutoDAO;
  @Autowired
  private IJhsCommodityTextkAutoDAO iJhsCommodityTextkAutoDAO;
  @Autowired
  private IJhsSubjectAutoDAO iJhsSubjectAutoDAO;
  @Autowired
  private IJhsCommodityStockAutoDAO iJhsCommodityStockAutoDAO;
  @Autowired
  private IJhsCommodityExchangeCodeAutoDAO iJhsCommodityExchangeCodeAutoDAO;
  @Autowired
  private IJhsUnitedCommodityAutoDAO iJhsUnitedCommodityAutoDAO;


  @Override
  public CommodityDomain getCommodityDomain(@Nonnull Integer commodityId) {
    return this.getCommodityDomain(commodityId, false, null);
  }

  /**
   * 获取领域模型
   *
   * @param commodityId 商品id
   * @param child       是否子商品
   * @return 模型
   */
  private CommodityDomain getCommodityDomain(@Nonnull Integer commodityId, boolean child, CommodityDomain tmp) {
    CommodityDomain domain = tmp == null ? new CommodityDomain() : tmp;

    JhsCommodity commodity = this.iJhsCommodityAutoDAO.selectByPrimaryKey(commodityId);
    if (commodity == null) {
      return null;
    }

    domain.setCommodity(commodity);
    // 商品分类字典
    domain.setDicts(this.listDictsByCommodityId(domain.getCommodity().getId()));
    // 商品描述
    domain.setText(this.getTextByCommodityId(domain.getCommodity().getId()));
    // 商品分类
    domain.setSubject(this.iJhsSubjectAutoDAO.selectByPrimaryKey(domain.getCommodity().getCategoryId()));

    // 子商品
    domain.setChild(child);
    if (!child) {
      List<CommodityDomain> childs = this.listChilds(domain.getCommodity().getId());
      domain.setChilds(childs);
    }

    // 服装类
    domain.setCloth(this.isCloth(domain.getSubject()));
    domain.setSuit(this.isSuit(domain.getSubject(), domain.hasChild()));
    domain.setGfSuit(this.isGfSuit(domain.getSubject()));

    // 体检类
    domain.setMedicalExaminer(this.isMedicalExaminer(domain.getSubject()));

    // 虚拟类
    domain.setVirtual(this.isVirtual(domain.getSubject()));
    domain.setExchangeCode(this.isExchangeCode(domain.getSubject()));
    domain.setExchangeLink(this.isExchangeLink(domain.getSubject()));


    if (domain.isCloth() && !domain.hasChild()) {
      // 服装类无子商品查询对应分类的库存
      domain.setStocks(this.listCommodityStocks(domain.getCommodity().getId()));
    }
    if (domain.isExchangeCode()) {
      domain.setExchangeCodeNum(this.countExchangeCodeNum(domain.getCommodity().getId()));
    }

    return domain;
  }

  private List<CommodityDomain> listChilds(@Nonnull Integer parentId) {
    return this.iJhsUnitedCommodityAutoDAO.selectByExample()
      .where(commodityPid, isEqualTo(parentId))
      .build()
      // 查询所有子商品
      .execute()
      .stream()
      // 根据id查询领域模型
      .map(child -> {
        CommodityDomain domain = new CommodityDomain();
        domain.setChildType(child.getType());
        domain.setChildOnlyOne(child.getOnlyOne());
        return this.getCommodityDomain(child.getCommoditySid(), true, domain);
      })
      .collect(Collectors.toList());

  }

  /**
   * 查询商品有效库存
   *
   * @param commodityId 商品id
   * @return 集合
   */
  private List<JhsCommodityStock> listCommodityStocks(@Nonnull Integer commodityId) {
    int version = MallDataVersionUtil.getStockDataVersion();
    return this.iJhsCommodityStockAutoDAO.selectByExample()
      .where(JhsCommodityStockDynamicSqlSupport.commodityId, isEqualTo(commodityId))
      .and(JhsCommodityStockDynamicSqlSupport.dataVersion, isEqualTo(version))
      .and(JhsCommodityStockDynamicSqlSupport.status, isEqualTo(DB_STR_Y))
      .build()
      .execute();
  }

  /**
   * 查询有效兑换码数量
   *
   * @param commodityId 商品id
   * @return 数量
   */
  @Override
  public Long countExchangeCodeNum(@Nonnull Integer commodityId) {
    return this.iJhsCommodityExchangeCodeAutoDAO.countByExample()
      .where(JhsCommodityExchangeCodeDynamicSqlSupport.commodityId, isEqualTo(commodityId))
      .and(JhsCommodityExchangeCodeDynamicSqlSupport.valid, isEqualTo(DB_Y))
      .build()
      .execute();
  }

  private boolean isExchangeLink(JhsSubject subject) {
    return isVirtual(subject) && Objects.equals(subject.getId(), COMMODITY_EXCHANGE_LINK);
  }

  private boolean isExchangeCode(JhsSubject subject) {
    return isVirtual(subject) && Objects.equals(subject.getId(), COMMODITY_EXCHANGE_CODE);
  }

  private boolean isVirtual(JhsSubject subject) {
    return subject != null && Objects.equals(subject.getSubRootid(), VIRTUAL_SUB_ROOT_ID);
  }

  private boolean isMedicalExaminer(JhsSubject subject) {
    return subject != null && Objects.equals(subject.getSubRootid(), COMMODITY_MEDICAL_EXAMINER);
  }

  private boolean isGfSuit(JhsSubject subject) {
    return isCloth(subject) && Lists.newArrayList(COMMODITY_GF1, COMMODITY_GF2, COMMODITY_GF3).contains(subject.getId());
  }

  private boolean isSuit(JhsSubject subject, boolean hasChild) {
    return this.isCloth(subject) && hasChild;
  }

  private boolean isCloth(@Nullable JhsSubject subject) {
    return subject != null && Objects.equals(subject.getSubRootid(), COMMODITY_CLOTH);
  }


  /**
   * 查询商品描述
   *
   * @param commodityId 商品ID
   * @return 商品描述
   */
  private JhsCommodityText getTextByCommodityId(@Nonnull Integer commodityId) {
    return this.iJhsCommodityTextkAutoDAO.selectByExample()
      .where(attachId, isEqualTo(commodityId))
      .limit(1)
      .build()
      .execute()
      .stream()
      .findFirst()
      .orElse(null);
  }

  /**
   * 查询商品分类字典
   *
   * @param commodityId 商品id
   * @return 集合
   */
  private List<JhsCommodityDict> listDictsByCommodityId(@Nonnull Integer commodityId) {
    return this.iJhsCommodityDictAutoDAO.selectByExample()
      .where(JhsCommodityDictDynamicSqlSupport.commodityid, isEqualTo(commodityId))
      .build()
      .execute();
  }
}
