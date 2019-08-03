package com.leyoujia.coa.zc.mall.util;

import org.apache.commons.lang3.StringUtils;

import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.LEYOUJIA_MALL;
import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.PREFIX_LEYOUJIA;

/**
 * 用户账户工具类
 *
 * @author lhw
 * @date 2019/7/29
 */
public class UserAccountUtil {

  /**
   * 获取商城中用户唯一标识
   *
   * @param from 来源
   * @param uuid 唯一标识
   * @return str
   */
  public static String getUserId(int from, String uuid) {
    if (StringUtils.isEmpty(uuid)) {
      return null;
    }
    if (LEYOUJIA_MALL == from) {
      return PREFIX_LEYOUJIA + uuid;
    }
    return uuid;
  }

}
