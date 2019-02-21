package com.myjava.demo.intergrate.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 天眼查先关配置
 *
 * @author lhw
 * @date 2019/2/19
 */
@ConfigurationProperties("tyc")
public class TianyanchaProperties {
  /**
   * 根据信用代码组织机构代码获取公司信息接口
   */
  private TycConfig i736;

  public TycConfig getI736() {
    return i736;
  }

  public void setI736(TycConfig i736) {
    this.i736 = i736;
  }

  /**
   * 天眼查接口配置
   */
  public static class TycConfig {
    /**
     * 接口id
     */
    private String id;
    /**
     * 接口名
     */
    private String name;
    /**
     * 接口描述
     */
    private String descr;
    /**
     * 接口地址
     */
    private String url;
    /**
     * 接口访问令牌
     */
    private String token;
    /**
     * 接口访问方法
     */
    private String method;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDescr() {
      return descr;
    }

    public void setDescr(String descr) {
      this.descr = descr;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }

    public String getToken() {
      return token;
    }

    public void setToken(String token) {
      this.token = token;
    }

    public String getMethod() {
      return method;
    }

    public void setMethod(String method) {
      this.method = method;
    }
  }

}
