package com.leyoujia.coa.zc.mall.config;

import com.jjshome.aicp.utils.AppInvokeListener;
import com.jjshome.oasys.utils.SpringContextUtil;
import com.jjshome.oasys.utils.SpringPropertyUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * aicp 接口管控
 *
 * @author lhw
 * @date 2019/7/23
 */
@ConfigurationProperties(prefix = "coa.aicp")
@Configuration
public class AicpConfig {
  /**
   * 请求路径
   */
  private String reqPath;
  /**
   * 请求方法
   */
  private String reqMainMethod;
  /**
   * 扫描的包
   */
  private String packagePath;
  /**
   * 服务编码
   */
  private String serviceCode;
  /**
   * 服务名称
   */
  private String serviceName;

  @Bean
  public SpringContextUtil createSpringContextUtil() {
    return new SpringContextUtil();
  }

  @Bean
  public SpringPropertyUtil createSpringPropertyUtil(SpringContextUtil springContextUtil) {
    return new SpringPropertyUtil();
  }


  @Bean(initMethod = "scanInit")
  public AppInvokeListener createAppInvokeListener(SpringContextUtil springContextUtil, SpringPropertyUtil springPropertyUtil) {
    AppInvokeListener listener = new AppInvokeListener();
    listener.setReqPath(this.reqPath);
    listener.setReqMainMethod(this.reqMainMethod);
    listener.setPackagePath(this.packagePath);
    listener.setServiceCode(this.serviceCode);
    listener.setServiceName(this.serviceName);
    return listener;
  }

  public String getReqPath() {
    return reqPath;
  }

  public void setReqPath(String reqPath) {
    this.reqPath = reqPath;
  }

  public String getReqMainMethod() {
    return reqMainMethod;
  }

  public void setReqMainMethod(String reqMainMethod) {
    this.reqMainMethod = reqMainMethod;
  }

  public String getPackagePath() {
    return packagePath;
  }

  public void setPackagePath(String packagePath) {
    this.packagePath = packagePath;
  }

  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }
}
