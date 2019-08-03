package com.leyoujia.coa.zc.mall.manager.mall;

import com.jjshome.sp.entity.SystemParam;

/**
 * @author l
 * @since 2019/7/31
 */
public interface ISystemParamManager {
  /**
   * 获取系统参数
   *
   * @param paramName 参数名
   * @return 系统参数
   */
  SystemParam getParam(String paramName);

  /**
   * 获取系统参数值
   * @param paramName 参数名
   * @return 参数值
   */
  String getParamValue(String paramName);
}
