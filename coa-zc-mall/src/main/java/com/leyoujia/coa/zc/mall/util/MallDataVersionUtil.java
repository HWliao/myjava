package com.leyoujia.coa.zc.mall.util;

import com.leyoujia.coa.common.date.DateUtil;

import java.util.Date;

/**
 * 商城 库存/订单 版本工具类
 *
 * @author lhw
 * @date 2019/7/29
 */
public class MallDataVersionUtil {

  /**
   * 库存数据版本
   *
   * @return 版本号
   */
  public static int getStockDataVersion() {
    Date date = DateUtil.parse("2019-03-16", "yyyy-MM-dd");
    // 这里相当于默认去版本2
    return date == null || System.currentTimeMillis() > date.getTime() ? 2 : 1;
  }


  /**
   * 订单数据八本
   *
   * @return 版本号
   */
  public static int getOrderDataVersion() {
    Date date = DateUtil.parse("2019-03-16", "yyyy-MM-dd");
    // 这里相当于默认取版本3
    return date == null || System.currentTimeMillis() > date.getTime() ? 3 : 2;
  }


}
