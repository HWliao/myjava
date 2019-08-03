package com.leyoujia.coa.zc.mall.manager.mall;

import com.leyoujia.coa.zc.mall.domain.mall.CommodityDomain;

import javax.annotation.Nonnull;

/**
 * @author lhw
 * @date 2019/7/29
 */
public interface ICommodityManager {
  /**
   * 根据商品ID查询商品领域模型
   *
   * @param commodityId 商品ID
   * @return 模型
   */
  CommodityDomain getCommodityDomain(@Nonnull Integer commodityId);

  /**
   * 有效兑换码数量
   * @param commodityId 商品id
   * @return 兑换码数量
   */
  public Long countExchangeCodeNum(@Nonnull Integer commodityId);
}
