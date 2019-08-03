package com.leyoujia.coa.zc.core.tomcat;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * session share redis 配置
 *
 * @author lhw
 * @date 2019/8/3
 */
@ConfigurationProperties(prefix = "coa.session.redis")
public class ShareSessionRedisConfig implements Serializable {
  private static final long serialVersionUID = 8135324150199073819L;

  /**
   * enable tomcat session share
   * 启用tomcat session 共享
   */
  private boolean enable = false;

  /**
   * redis host
   * redis地址
   */
  private String host = "localhost";
  /**
   * redis port
   * redis端口
   */
  private Integer port = 6379;
  /**
   * redis database
   * 对应的database
   */
  private Integer database = 0;

  /**
   * redis password
   * redis密码
   */
  private String password = null;

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Integer getDatabase() {
    return database;
  }

  public void setDatabase(Integer database) {
    this.database = database;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  @Override
  public String toString() {
    return "ShareSessionRedisConfig{" +
      "host='" + host + '\'' +
      ", port=" + port +
      ", database=" + database +
      ", password='" + password + '\'' +
      '}';
  }
}
