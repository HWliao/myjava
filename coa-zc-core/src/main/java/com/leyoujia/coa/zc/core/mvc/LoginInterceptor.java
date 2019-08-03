package com.leyoujia.coa.zc.core.mvc;

import com.google.common.collect.Lists;
import com.leyoujia.coa.common.exception.LogoutException;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 登入拦截器
 *
 * @author lhw
 * @date 2019/7/20
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

  /**
   * 白名单
   */
  private List<String> whitelist;

  /**
   * 放过所有
   */
  private static final String ALL = "all";

  public LoginInterceptor(List<String> whitelist) {
    this.whitelist = CollectionUtils.isEmpty(whitelist) ? Lists.newArrayList() : whitelist;
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    if (!(handler instanceof HandlerMethod)) {
      return super.preHandle(request, response, handler);
    }
    if (this.whitelist.contains(ALL)) {
      return super.preHandle(request, response, handler);
    }
    String uri = request.getRequestURI();
    if (this.whitelist.contains(uri)) {
      return super.preHandle(request, response, handler);
    }

    HttpSession session = request.getSession();
    if (session == null) {
      throw new LogoutException("获取不到会话");
    }
    Object person = session.getAttribute("operator");
    if (person == null) {
      throw new LogoutException("未登入");
    }
    return super.preHandle(request, response, handler);
  }
}
