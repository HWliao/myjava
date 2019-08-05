package com.leyoujia.coa.zc.core.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Web mvc 配置
 *
 * @author lhw
 * @date 2019/8/5
 */
@Configuration
@Import({LoginInterceptor.class, OperatorMethodArgumentsResolver.class})
public class WebMvcConfig {
}
