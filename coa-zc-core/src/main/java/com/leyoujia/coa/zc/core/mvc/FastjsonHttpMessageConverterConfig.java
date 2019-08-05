package com.leyoujia.coa.zc.core.mvc;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.MediaType;

import java.io.Serializable;
import java.util.List;

/**
 * fast json http message converter 配置
 *
 * @author lhw
 * @date 2019/8/5
 */
@ConfigurationProperties(prefix = "coa.mvc.http-message-converter")
public class FastjsonHttpMessageConverterConfig implements Serializable {
  private static final long serialVersionUID = 3872967811308533867L;

  /**
   * enable FastjsonHttpMessageConverter
   */
  private boolean enable = false;
  /**
   * supportedMediaTypes
   */
  private List<MediaType> supportedMediaTypes;
  /**
   * fast json 配置
   */
  private FastJsonConfig fastJsonConfig;

  public List<MediaType> getSupportedMediaTypes() {
    return supportedMediaTypes;
  }

  public void setSupportedMediaTypes(List<MediaType> supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
  }

  public FastJsonConfig getFastJsonConfig() {
    return fastJsonConfig;
  }

  public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {
    this.fastJsonConfig = fastJsonConfig;
  }

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  @Override
  public String toString() {
    return "FastjsonHttpMessageConverterConfig{" +
      "enable=" + enable +
      ", supportedMediaTypes=" + supportedMediaTypes +
      ", fastJsonConfig=" + fastJsonConfig +
      '}';
  }
}
