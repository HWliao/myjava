package com.leyoujia.coa.zc.client.mall.service;

import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDto;

/**
 * 商品服务
 *
 * @author lhw
 * @date 2019/7/25
 */
public interface ICommodityProviderService {
  /**
   * 查询商品列表,房产网专用
   *
   * @param workerId 用户标识,为空时不做用户先关判断
   * @param page     分页信息,为null时不分页
   * @return 商品列表
   */
  PageInfo<CommodityDto> searchVisibleVirtualCommodities(String workerId, PageInfo page);

  /**
   * 查询商品列表, 乐办公app专用
   *
   * @param workerId 员工id
   * @param page     分页
   * @return 商品列表
   */
  PageInfo<CommodityDto> searchCommoditiesForApp(String workerId, PageInfo page);

  /**
   * 查询商品详情
   *
   * @param commodityId 商品id
   * @return 商品详情
   */
  CommodityDetailDto getCommodityDetail(Integer commodityId);
}
