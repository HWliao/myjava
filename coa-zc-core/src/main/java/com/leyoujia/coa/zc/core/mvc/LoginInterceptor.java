package com.leyoujia.coa.zc.core.mvc;

import com.google.common.collect.Lists;
import com.leyoujia.coa.zc.core.exception.LoginException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

import static com.leyoujia.coa.zc.core.constant.ComConst.SESSION_OPERATOR;

/**
 * @author lhw
 * @date 2019/8/5
 */
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass({Servlet.class, DispatcherServlet.class})
@AutoConfigureAfter(ApplicationContext.class)
@ConditionalOnProperty(name = "coa.mvc.login-interceptor.enable")
@Configuration
@EnableConfigurationProperties(LoginInterceptorConfig.class)
public class LoginInterceptor implements ApplicationContextAware, ServletContextAware, WebMvcConfigurer {
  private static Logger LOG = LoggerFactory.getLogger(LoginInterceptor.class);

  private ApplicationContext applicationContext;
  private ServletContext servletContext;

  /**
   * 路径匹配 支持Ant-style path patterns
   */
  private AntPathMatcher pathMatcher = new AntPathMatcher();

  /**
   * 白名单
   */
  private final List<String> whiteList = Lists.newCopyOnWriteArrayList();

  /**
   * 配置
   */
  @Autowired
  private LoginInterceptorConfig config;

  @PostConstruct
  public void init() {
    String contextPath = this.servletContext.getContextPath();
    contextPath = StringUtils.defaultString(contextPath, "/");
    contextPath = contextPath.endsWith("/") ? contextPath : contextPath + "/";

    LOG.debug("init content path:{}", contextPath);
    // 默认加入一下白名单
    List<String> defWhithList = Lists.newArrayList(
      // 根路径
      contextPath,
      // 首页
      contextPath + "index",
      contextPath + "index.*",
      // 错误页面
      contextPath + "error",
      // 500
      contextPath + "500",
      contextPath + "500.*",
      // 401 未授权
      contextPath + "401",
      contextPath + "401.*",
      // 404
      contextPath + "404",
      contextPath + "404.*",
      // aicp
      contextPath + "aicp"
    );
    this.whiteList.addAll(defWhithList);

    // 添加配置中的白名单
    if (CollectionUtils.isNotEmpty(this.config.getWhiteList())) {
      this.whiteList.addAll(this.config.getWhiteList());
    }
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new HandlerInterceptorAdapter() {
      @Override
      public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        boolean isHandlerMethod = handler instanceof HandlerMethod;
        boolean matchWhiteList = whiteList.stream().anyMatch(pattern -> pathMatcher.match(pattern, uri));

        LOG.debug("preHandle URI:{},isHandlerMethod:{},matchWhiteList:{}", request.getRequestURI(), isHandlerMethod, matchWhiteList);

        if (!isHandlerMethod || matchWhiteList) {
          return super.preHandle(request, response, handler);
        }

        HttpSession session = request.getSession(true);
        if (session == null) {
          throw new LoginException("会话不存在!");
        }
        Object operator = session.getAttribute(SESSION_OPERATOR);
        if (operator == null) {
          throw new LoginException("请重新登录!");
        }
        return super.preHandle(request, response, handler);
      }
    });
  }

  /**
   * 新增白名单
   *
   * @param list 白名单
   */
  public void addWhiteList(List<String> list) {
    if (CollectionUtils.isNotEmpty(list)) {
      this.whiteList.addAll(list);
    }
  }

  @Override
  public void setApplicationContext(@Nonnull ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  @Override
  public void setServletContext(@Nonnull ServletContext servletContext) {
    this.servletContext = servletContext;
  }
}
