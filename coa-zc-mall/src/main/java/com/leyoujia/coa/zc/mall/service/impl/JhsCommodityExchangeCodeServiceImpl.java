package com.leyoujia.coa.zc.mall.service.impl;

import com.leyoujia.coa.zc.client.mall.constant.CommodityConst;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsCommodityExchangeCodeAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityExchangeCodeDynamicSqlSupport;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityExchangeCode;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityExchangeCodeService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品兑换码service实现类
 *
 * @author l
 * @since 2019/7/31
 */
@Service
public class JhsCommodityExchangeCodeServiceImpl implements IJhsCommodityExchangeCodeService {
  @Autowired
  private IJhsCommodityExchangeCodeAutoDAO exchangeCodeAutoDAO;

  @Override
  public JhsCommodityExchangeCode getValid(Integer commodityId) {
    if (commodityId == null) {
      return null;
    }
    List<JhsCommodityExchangeCode> exchangeCodes = this.exchangeCodeAutoDAO.selectByExample()
      .where(JhsCommodityExchangeCodeDynamicSqlSupport.commodityId, SqlBuilder.isEqualTo(commodityId))
      .and(JhsCommodityExchangeCodeDynamicSqlSupport.valid, SqlBuilder.isEqualTo(CommodityConst.EXCHANGE_CODE_VALID))
      .limit(1)
      .build().execute();
    if (CollectionUtils.isEmpty(exchangeCodes)) {
      return null;
    }
    return exchangeCodes.get(0);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public void invalidCode(JhsCommodityExchangeCode code) {
    if (code == null || StringUtils.isBlank(code.getExchangeCode()) || code.getCommodityId() == null) {
      return;
    }
    JhsCommodityExchangeCode codeObj = new JhsCommodityExchangeCode();
    codeObj.setValid(CommodityConst.EXCHANGE_CODE_INVALID);
    this.exchangeCodeAutoDAO.updateByExampleSelective(codeObj)
      .where(JhsCommodityExchangeCodeDynamicSqlSupport.commodityId, SqlBuilder.isEqualTo(code.getCommodityId()))
      .and(JhsCommodityExchangeCodeDynamicSqlSupport.exchangeCode, SqlBuilder.isEqualTo(code.getExchangeCode()))
      .build().execute();
  }
}
