package com.leyoujia.coa.common.http;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * http 工具类
 *
 * @author lhw
 * @date 2019/7/20
 */
public class HttpUtil {

  /**
   * 判断是否ajax请求, 异步请求
   *
   * @param request 请求
   * @return 是否
   */
  public static boolean isAjaxRequest(HttpServletRequest request) {
    if (request == null) {
      return false;
    }
    String header = request.getHeader("X-Requested-With");
    if (StringUtils.isNotEmpty(header)) {
      return true;
    }
    String json = request.getHeader("Accept");
    return StringUtils.containsIgnoreCase(json, "application/json");
  }
}
