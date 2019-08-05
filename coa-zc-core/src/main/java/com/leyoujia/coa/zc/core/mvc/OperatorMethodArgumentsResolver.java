package com.leyoujia.coa.zc.core.mvc;

import com.jjshome.erp.entity.extras.Operator;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Nonnull;
import javax.servlet.http.HttpSession;
import java.util.List;

import static com.leyoujia.coa.zc.core.constant.ComConst.SESSION_OPERATOR;

/**
 * 登录对象参数解析
 *
 * @author lhw
 * @date 2019/8/5
 */
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@AutoConfigureAfter(ApplicationContext.class)
@ConditionalOnProperty(name = "coa.mvc.operator-resolver.enable")
@Configuration
@EnableConfigurationProperties(OperatorMethodArgumentsResolverConfig.class)
public class OperatorMethodArgumentsResolver implements WebMvcConfigurer {


  @Override
  public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
    resolvers.add(new HandlerMethodArgumentResolver() {
      @Override
      public boolean supportsParameter(@Nonnull MethodParameter parameter) {
        return parameter.getParameterType().equals(Operator.class);
      }

      @Override
      public Object resolveArgument(@Nonnull MethodParameter parameter, ModelAndViewContainer mavContainer, @Nonnull NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpSession session = (HttpSession) webRequest.getSessionMutex();
        return session.getAttribute(SESSION_OPERATOR);
      }
    });
  }
}
