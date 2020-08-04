package com.example.demo.core.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mvc 先关配置
 * 此处用于spring mvc自定义配置
 *
 * @author HWliao
 */
@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {
}
