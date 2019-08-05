package com.leyoujia.coa.zc.core.mvc;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 使用fastjson http message converter
 *
 * @author lhw
 * @date 2019/8/5
 */
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@AutoConfigureAfter(ApplicationContext.class)
@ConditionalOnProperty(name = "coa.mvc.http-message-converter.enable")
@Configuration
@EnableConfigurationProperties(FastjsonHttpMessageConverterConfig.class)
public class FastjsonHttpMessageConverter implements WebMvcConfigurer {

  private static Logger LOG = LoggerFactory.getLogger(FastjsonHttpMessageConverter.class);

  @Autowired
  private FastjsonHttpMessageConverterConfig config;

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    LOG.debug("configureMessageConverters config:{}, converters:{}", this.config, converters);

    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

    List<MediaType> types = Lists.newArrayList(MediaType.parseMediaType("application/json;charset=UTF-8"), MediaType.parseMediaType("text/html;charset=UTF-8"));
    if (this.config.getSupportedMediaTypes() != null) {
      types.addAll(this.config.getSupportedMediaTypes());
    }
    fastConverter.setSupportedMediaTypes(types);

    FastJsonConfig fastJsonConfig = this.config.getFastJsonConfig() != null ? this.config.getFastJsonConfig() : new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteMapNullValue);
    fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteNullStringAsEmpty);
    fastConverter.setFastJsonConfig(fastJsonConfig);
    converters.add(fastConverter);
  }
}
