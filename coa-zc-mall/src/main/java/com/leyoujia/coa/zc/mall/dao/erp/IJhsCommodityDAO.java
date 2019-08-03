package com.leyoujia.coa.zc.mall.dao.erp;

import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDto;
import com.leyoujia.coa.zc.mall.domain.mall.AppCommodityDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 商品数据库接口
 *
 * @author lhw
 * @date 2019/7/26
 */
public interface IJhsCommodityDAO {
  /**
   * 移动端查询商品列表
   *
   * @param workerId 员工编号
   * @return 集合
   */
  List<AppCommodityDto> listCommoditiesForApp(@Param("workerId") String workerId);

  /**
   * 根据用户Id查询商品数量
   *
   * @param workerId    用户Id
   * @param from        来源
   * @param categoryIds 商品类别id
   * @return 数量
   */
  int countCommoditesByWorkerId(@Param("workerId") String workerId, @Param("from") Integer from, @Param("categoryIds") List<Integer> categoryIds);

  /**
   * 根据用户Id查询商品列表
   *
   * @param workerId    用户Id
   * @param from        来源
   * @param categoryIds 商品类别id
   * @param page        分页
   * @return 集合
   */
  List<CommodityDto> listCommoditiesByWorkerId(@Param("workerId") String workerId, @Param("from") Integer from, @Param("categoryIds") List<Integer> categoryIds, @Param("page") PageInfo page);

  /**
   * 增减商品数量
   *
   * @param id   商品id
   * @param unit 增减的数量
   * @return 更新条数
   */
  @Update("update JHS_COMMODITY set COUNT = COUNT ${operator} ${unit} where ID = ${id}")
  int plusCount(@Param("id") Integer id, @Param("unit") Integer unit, @Param("operator") Character operator);
}
