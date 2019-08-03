package com.leyoujia.coa.zc.core.mvc;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.collect.Lists;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.http.MediaType;

/**
 * @author lhw
 * @date 2019/7/20
 */
public class AbstractHttpConverterConfig {

  protected HttpMessageConverters createHttpConverter() {
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    fastConverter.setSupportedMediaTypes(Lists.newArrayList(MediaType.parseMediaType("application/json;charset=UTF-8"), MediaType.parseMediaType("text/html;charset=UTF-8")));
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteMapNullValue);
    fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteNullStringAsEmpty);
    fastConverter.setFastJsonConfig(fastJsonConfig);
    return new HttpMessageConverters(fastConverter);
  }
}
