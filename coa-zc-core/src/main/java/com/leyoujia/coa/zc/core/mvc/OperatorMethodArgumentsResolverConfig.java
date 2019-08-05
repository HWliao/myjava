package com.leyoujia.coa.zc.core.mvc;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * 登录对象解析配置类
 *
 * @author lhw
 * @date 2019/8/5
 */
@ConfigurationProperties("coa.mvc.operator-resolver")
public class OperatorMethodArgumentsResolverConfig implements Serializable {
  private static final long serialVersionUID = -6883936635745047962L;
  /**
   * enable operator method argument resulve
   * 是否启用登录对象参数解析
   */
  private boolean enable = false;

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  @Override
  public String toString() {
    return "OperatorMethodArgumentsResolverConfig{" +
      "enable=" + enable +
      '}';
  }
}
