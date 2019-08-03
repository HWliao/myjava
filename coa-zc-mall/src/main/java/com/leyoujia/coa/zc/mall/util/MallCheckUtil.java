package com.leyoujia.coa.zc.mall.util;

import com.leyoujia.coa.zc.client.mall.exception.OrderCreateException;
import org.apache.commons.lang3.StringUtils;

/**
 * 商城用于检查的
 *
 * @author lhw
 * @date 2019/7/31
 */
public class MallCheckUtil {

  public static void checkCeateOrder(boolean expression, String message, int code) {
    if (!expression) {
      throw new OrderCreateException(StringUtils.defaultString(message), code);
    }
  }
}
