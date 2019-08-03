package com.leyoujia.coa.zc.core.mvc;

import com.jjshome.erp.entity.extras.Operator;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpSession;

/**
 * @author lhw
 * @date 2019/7/25
 */
public class OperatorMethodArgumentsResolver implements HandlerMethodArgumentResolver {
  @Override
  public boolean supportsParameter(MethodParameter parameter) {
    return parameter.getParameterType().equals(Operator.class);

  }

  @Override
  public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
    HttpSession session = (HttpSession) webRequest.getSessionMutex();
    return session.getAttribute("operator");
  }
}
