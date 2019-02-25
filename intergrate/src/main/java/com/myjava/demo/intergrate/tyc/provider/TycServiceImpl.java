package com.myjava.demo.intergrate.tyc.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.myjava.demo.intergrate.configuration.properties.TianyanchaProperties;
import com.myjava.demo.intergrate.tyc.model.Company;
import com.myjava.demo.intergrate.tyc.model.TycResult;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import java.io.IOException;

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
    // 通过拦截器增加请求头
    this.restTemplate = this.restTemplateBuilder.additionalInterceptors(new ClientHttpRequestInterceptor() {
      @Nonnull
      public ClientHttpResponse intercept(@Nonnull HttpRequest request, @Nonnull byte[] body, @Nonnull ClientHttpRequestExecution execution) throws IOException {
        HttpHeaders headers = request.getHeaders();
        headers.add(HttpHeaders.AUTHORIZATION, token);
        return execution.execute(request, body);
      }
    }).build();
  }


  public Company getCompanyByCode(String code) {
    if (StringUtils.isEmpty(code)) {
      return null;
    }
    TycResult result = this.restTemplate.getForObject(this.tyc.getI736().getUrl() + "?code={1}", TycResult.class, code);
    return result == null ? null : result.getResult();
  }
}
