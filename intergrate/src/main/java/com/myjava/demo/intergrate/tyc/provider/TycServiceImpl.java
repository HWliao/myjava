package com.myjava.demo.intergrate.tyc.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.myjava.demo.intergrate.configuration.properties.TianyanchaProperties;
import com.myjava.demo.intergrate.tyc.model.Company;
import com.myjava.demo.intergrate.tyc.model.TycResult;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 天眼查服务实现
 *
 * @author lhw
 * @date 2019/2/21
 */
@Service
@Component
public class TycServiceImpl implements ITycService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private RestTemplateBuilder restTemplateBuilder;
  @Autowired
  private TianyanchaProperties tyc;

  private RestTemplate restTemplate;

  @PostConstruct
  public void init() {
    final String token = this.tyc.getI736().getToken();

    MappingJackson2HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
    jacksonConverter.getObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

    // 通过拦截器增加请求头
    this.restTemplate = this.restTemplateBuilder
      .messageConverters(jacksonConverter)
      .additionalInterceptors(new ClientHttpRequestInterceptor() {
        @Override
        @Nonnull
        public ClientHttpResponse intercept(@Nonnull HttpRequest request, @Nonnull byte[] body, @Nonnull ClientHttpRequestExecution execution) throws IOException {
          HttpHeaders headers = request.getHeaders();
          headers.add(HttpHeaders.AUTHORIZATION, token);
          return execution.execute(request, body);
        }
      })
      .build();
  }


  @Override
  public Company getCompanyByCode(String code) {
    if (StringUtils.isEmpty(code)) {
      return null;
    }
    TycResult result = this.restTemplate.getForObject(this.tyc.getI736().getUrl() + "?code={1}", TycResult.class, code);
    return result == null ? null : result.getResult();
  }
}
