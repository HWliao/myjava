package com.leyoujia.coa.zc.mall.config;

import com.leyoujia.coa.zc.core.mvc.AbstractHttpConverterConfig;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 支持fastjson http message converter
 *
 * @author lhw
 * @date 2019/7/20
 */
@Configuration
public class HttpConverterConfig extends AbstractHttpConverterConfig {
  @Bean
  public HttpMessageConverters fastJsonHttpMessageConverters() {
    return createHttpConverter();
  }
}
