package com.leyoujia.coa.zc.mall.service.impl;

import com.google.common.collect.Lists;
import com.leyoujia.coa.common.constant.DbConst;
import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDictDto;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDto;
import com.leyoujia.coa.zc.mall.dao.erp.IJhsCommodityDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsCommodityAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsCommodityDictAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDictDynamicSqlSupport;
import com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDynamicSqlSupport;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodity;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityDict;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityStock;
import com.leyoujia.coa.zc.mall.domain.mall.AppCommodityDto;
import com.leyoujia.coa.zc.mall.domain.mall.CommodityDomain;
import com.leyoujia.coa.zc.mall.manager.mall.ICommodityManager;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityService;
import org.apache.commons.collections4.CollectionUtils;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import static com.leyoujia.coa.zc.client.mall.constant.CommodityConst.COMMODITY_EXCHANGE_CODE;
import static com.leyoujia.coa.zc.client.mall.constant.CommodityConst.COMMODITY_EXCHANGE_LINK;
import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.APP_MALL;
import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.LEYOUJIA_MALL;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDictDynamicSqlSupport.jhsCommodityDict;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDynamicSqlSupport.jhsCommodity;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDynamicSqlSupport.photoUrl;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 商品service
 *
 * @author l
 * @since 2019/7/25
 */
@Service
public class JhsCommodityServiceImpl implements IJhsCommodityService {
  @Autowired
  private IJhsCommodityAutoDAO jhsCommodityAutoDAO;
  @Autowired
  private IJhsCommodityDAO iJhsCommodityDAO;
  @Autowired
  private IJhsCommodityDictAutoDAO iJhsCommodityDictAutoDAO;
  @Autowired
  private ICommodityManager iCommodityManager;

  @Override
  public PageInfo<CommodityDto> searchVisibleVirtualCommodities(String workerId, PageInfo page) {
    int total = this.iJhsCommodityDAO.countCommoditesByWorkerId(workerId, LEYOUJIA_MALL, Lists.newArrayList(COMMODITY_EXCHANGE_CODE, COMMODITY_EXCHANGE_LINK));
    List<CommodityDto> list = this.iJhsCommodityDAO.listCommoditiesByWorkerId(workerId, LEYOUJIA_MALL, Lists.newArrayList(COMMODITY_EXCHANGE_CODE, COMMODITY_EXCHANGE_LINK), page);
    return page == null ? PageInfo.get(list, total) : PageInfo.get(list, page.getPageNum(), page.getPageSize(), total);
  }

  @Override
  public PageInfo<CommodityDto> searchCommoditiesForApp(String workerId, PageInfo page) {
    int total = this.iJhsCommodityDAO.countCommoditesByWorkerId(workerId, APP_MALL, null);
    List<CommodityDto> list = this.iJhsCommodityDAO.listCommoditiesByWorkerId(workerId, APP_MALL, null, page);
    return page == null ? PageInfo.get(list, total) : PageInfo.get(list, page.getPageNum(), page.getPageSize(), total);
  }

  @Override
  public CommodityDetailDto getCommodityDetail(Integer commodityId) {
    if (commodityId == null) {
      return null;
    }
    CommodityDomain domain = this.iCommodityManager.getCommodityDomain(commodityId);
    if (domain == null) {
      return null;
    }

    CommodityDetailDto detail = this.convertDomainToDetail(domain);
    if (CollectionUtils.isNotEmpty(domain.getChilds())) {
      detail.setChilds(Lists.newArrayList());
      for (CommodityDomain child : domain.getChilds()) {
        detail.getChilds().add(this.convertDomainToDetail(child));
      }
    }
    return detail;
  }

  @Nonnull
  private CommodityDetailDto convertDomainToDetail(@Nonnull CommodityDomain domain) {
    CommodityDetailDto detail = new CommodityDetailDto();
    detail.setId(domain.getCommodity().getId());
    detail.setTitle(domain.getCommodity().getTitle());
    detail.setImage(domain.getCommodity().getPhotoUrl());
    detail.setPrice(domain.getCommodity().getPrice());
    detail.setShortName(domain.getCommodity().getShortName());
    detail.setPayMethod(domain.getCommodity().getPayMethod());

    // 商品描述
    if (domain.getText() != null) {
      detail.setDescribe(domain.getText().getContent());
      detail.setManual(domain.getText().getManual());
    }

    // 商品类别
    if (domain.getSubject() != null) {
      detail.setCategoryId(domain.getSubject().getId());
      detail.setCategoryName(domain.getSubject().getSubName());
    }

    // 商品数量 兑换码使用有效兑换码数量,其余使用商品数量
    if (domain.isExchangeCode()) {
      detail.setQuantity(domain.getExchangeCodeNum());
    } else {
      detail.setQuantity(domain.getCommodity().getCount().longValue());
    }

    // 商品分类
    detail.setDicts(this.combineDictAndStock(domain.isCloth() || domain.isChild() || domain.hasChild(), domain.getDicts(), domain.getStocks()));

    return detail;
  }

  /**
   * 合并分类字典和库存数据,主要是服装类
   *
   * @param useStock 是否使用库存
   * @param dicts    分类字典
   * @param stocks   库存数据
   * @return 分类字典
   */
  private List<CommodityDictDto> combineDictAndStock(boolean useStock, List<JhsCommodityDict> dicts, List<JhsCommodityStock> stocks) {
    if (CollectionUtils.isEmpty(dicts)) {
      return Lists.newArrayList();
    }
    stocks = CollectionUtils.isEmpty(stocks) ? Lists.newArrayList() : stocks;
    List<CommodityDictDto> cDicts = Lists.newArrayList();

    for (JhsCommodityDict dict : dicts) {
      CommodityDictDto cDict = this.convertDictToDict(dict);
      if (useStock) {
        // 有子商品这是用库存数量
        Long stockNum = stocks.stream()
          .filter(stock -> Objects.equals(stock.getCommodityId(), dict.getCommodityid()) && Objects.equals(stock.getCommodityStandard(), dict.getDicttext()))
          .findFirst()
          .map(JhsCommodityStock::getNum)
          .map(BigDecimal::longValue)
          .orElse(0L);
        cDict.setNum(stockNum);
      }
      cDicts.add(cDict);
    }
    return cDicts;
  }

  private CommodityDictDto convertDictToDict(JhsCommodityDict cDict) {
    CommodityDictDto dict = new CommodityDictDto();
    dict.setDict(cDict.getDicttext());
    dict.setNum(cDict.getCount().longValue());
    return dict;
  }

  @Override
  public List<AppCommodityDto> listCommoditiesForApp(String workerId) {
    return this.iJhsCommodityDAO.listCommoditiesForApp(workerId);
  }

  @Override
  public String getCommodityImage(Integer commodityId) {
    String image = null;
    if (commodityId == null) {
      return null;
    }
    //查询商品
    JhsCommodity commodity = this.jhsCommodityAutoDAO.selectOne(select(photoUrl)
      .from(jhsCommodity)
      .where(JhsCommodityDynamicSqlSupport.id, isEqualTo(commodityId))
      .build().render(RenderingStrategy.MYBATIS3));
    if (commodity != null) {
      //获取商品主图
      image = commodity.getPhotoUrl();
    }
    return image;
  }

  @Override
  public int updateCommodityCount(Integer commodityId, int count) {
    UpdateStatementProvider updateStatementProvider = update(jhsCommodity)
      .set(JhsCommodityDynamicSqlSupport.count).equalTo((int) count)
      .where(JhsCommodityDynamicSqlSupport.id, isEqualTo(commodityId))
      .build()
      .render(RenderingStrategy.MYBATIS3);
    return this.iJhsCommodityDictAutoDAO.update(updateStatementProvider);
  }

  @Override
  public int updateCommodityDictCount(Integer dictId, int count) {
    UpdateStatementProvider updateStatementProvider = update(jhsCommodityDict)
      .set(JhsCommodityDictDynamicSqlSupport.count).equalTo((int) count)
      .where(JhsCommodityDictDynamicSqlSupport.id, isEqualTo(dictId))
      .build()
      .render(RenderingStrategy.MYBATIS3);
    return this.iJhsCommodityDictAutoDAO.update(updateStatementProvider);
  }

  @Override
  public int stockDecrement(Integer commodityId) {
    if (commodityId == null) {
      return 0;
    }
    return this.iJhsCommodityDAO.plusCount(commodityId, 1, DbConst.OPERATE_MINUS);
  }
}
