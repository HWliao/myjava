package com.leyoujia.coa.zc.mall.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 登录拦截器配置
 *
 * @author lhw
 * @date 2019/7/22
 */
@ConfigurationProperties(prefix = "coa.zc.mall.login")
@Configuration
public class LoginInterceptorProperties {
  /**
   * 白名单
   */
  private List<String> whitelist;

  public List<String> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }
}
