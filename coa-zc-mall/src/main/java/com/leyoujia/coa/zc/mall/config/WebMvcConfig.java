package com.leyoujia.coa.zc.mall.config;

import com.leyoujia.coa.zc.core.mvc.LoginInterceptor;
import com.leyoujia.coa.zc.core.mvc.OperatorMethodArgumentsResolver;
import com.leyoujia.coa.zc.mall.config.property.LoginInterceptorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * web mvc 配置
 *
 * @author lhw
 * @date 2019/7/20
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Autowired
  private LoginInterceptorProperties loginInterceptorProperties;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // 登录拦截器
    registry.addInterceptor(new LoginInterceptor(this.loginInterceptorProperties.getWhitelist()));
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowCredentials(true)
      .allowedOrigins("*")
      .allowedHeaders("*")
      .allowedMethods("*");
  }

  @Override
  public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
    // 登入信息解析注入
    resolvers.add(new OperatorMethodArgumentsResolver());
  }
}
