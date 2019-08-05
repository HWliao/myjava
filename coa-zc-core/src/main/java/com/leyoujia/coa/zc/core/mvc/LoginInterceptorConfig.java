package com.leyoujia.coa.zc.core.mvc;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;
import java.util.List;

/**
 * 登录拦截器配置
 *
 * @author lhw
 * @date 2019/8/5
 */
@ConfigurationProperties(prefix = "coa.mvc.login-interceptor")
public class LoginInterceptorConfig implements Serializable {

  private static final long serialVersionUID = -3845421724781976371L;

  /**
   * enable login interceptor 是否启用登录拦截器
   */
  private boolean enable = false;

  /**
   * white list 白名单
   */
  private List<String> whiteList;

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  public List<String> getWhiteList() {
    return whiteList;
  }

  public void setWhiteList(List<String> whiteList) {
    this.whiteList = whiteList;
  }

  @Override
  public String toString() {
    return "LoginInterceptorConfig{" +
      "enable=" + enable +
      ", whiteList=" + whiteList +
      '}';
  }
}


