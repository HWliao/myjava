package com.leyoujia.coa.zc.mall.service;

import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDto;
import com.leyoujia.coa.zc.mall.domain.mall.AppCommodityDto;

import java.util.List;

/**
 * 商品service接口
 *
 * @author l
 * @since 2019/7/25
 */
public interface IJhsCommodityService {

  /**
   * 根据用户查询商品 乐有家网
   *
   * @param workerId 用户id
   * @param page     分页
   * @return 集合
   */
  PageInfo<CommodityDto> searchVisibleVirtualCommodities(String workerId, PageInfo page);

  /**
   * 乐办公查询商品列表
   *
   * @param workerId 员工id
   * @param page     分页
   * @return 集合
   */
  PageInfo<CommodityDto> searchCommoditiesForApp(String workerId, PageInfo page);

  /**
   * 查询商品详情
   *
   * @param commodityId 商品id
   * @return 商品详情
   */
  CommodityDetailDto getCommodityDetail(Integer commodityId);

  /**
   * 云办公商品列表查询
   *
   * @param workerId 员工编号
   * @return 集合
   */
  List<AppCommodityDto> listCommoditiesForApp(String workerId);

  /**
   * 获取商品主图
   *
   * @param commodityId 商品id
   * @return 图片
   */
  String getCommodityImage(Integer commodityId);

  /**
   * 更新商品数量
   *
   * @param commodityId 分类字典id
   * @param count       数量
   * @return 修改数量
   */
  int updateCommodityCount(Integer commodityId, int count);

  /**
   * 更新商品分类字典数量
   *
   * @param dictId 分类字典id
   * @param count  数量
   * @return 修改数量
   */
  int updateCommodityDictCount(Integer dictId, int count);

  /**
   * 商品库存自减
   *
   * @param commodityId 商品id
   * @return 影响商品数
   */
  int stockDecrement(Integer commodityId);
}
