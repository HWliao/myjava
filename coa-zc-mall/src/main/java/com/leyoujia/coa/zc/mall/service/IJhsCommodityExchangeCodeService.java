package com.leyoujia.coa.zc.mall.service;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityExchangeCode;

/**
 * 商品兑换码service接口
 *
 * @author l
 * @since 2019/7/31
 */
public interface IJhsCommodityExchangeCodeService {
  /**
   * 获取有效兑换码
   *
   * @param commodityId 商品id
   * @return 兑换码
   */
  JhsCommodityExchangeCode getValid(Integer commodityId);

  /**
   * 使兑换码无效
   *
   * @param code 商品兑换码对象
   */
  void invalidCode(JhsCommodityExchangeCode code);
}
