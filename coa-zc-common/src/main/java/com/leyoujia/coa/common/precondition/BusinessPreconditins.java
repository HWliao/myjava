package com.leyoujia.coa.common.precondition;

import com.leyoujia.coa.zc.client.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 业务条件判断
 *
 * @author lhw
 * @date 2019/7/20
 */
public final class BusinessPreconditins {

  private static Logger LOGGER = LoggerFactory.getLogger(BusinessPreconditins.class);

  /**
   * 不满足条件这抛出异常
   *
   * @param expression 条件
   * @param message    异常说明
   */
  public static void checkBusiness(boolean expression, String message) {
    if (!expression) {
      throw new BusinessException(StringUtils.defaultString(message));
    }
  }

  /**
   * 不满足条件这抛出异常
   *
   * @param expression 条件
   * @param message    异常说明
   */
  public static void checkBusiness(boolean expression, String message, boolean needLog) {
    if (!expression) {
      try {
        throw new BusinessException(StringUtils.defaultString(message));
      } catch (BusinessException e) {
        if (needLog) {
          LOGGER.error("@checkBusiness:", e);
        }
        throw e;
      }
    }
  }
}
