package com.leyoujia.coa.zc.core.mvc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication.Type;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Servlet;

/**
 * Web mvc 配置
 *
 * @author lhw
 * @date 2019/8/5
 */
@Configuration
@Import({LoginInterceptor.class})
public class WebMvcConfig {
}
