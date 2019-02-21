package com.myjava.demo.intergrate.configuration;

import com.myjava.demo.intergrate.configuration.properties.TianyanchaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 应用配置类
 *
 * @author lhw
 * @date 2019/2/19
 */
@Configuration
@EnableConfigurationProperties(TianyanchaProperties.class)
public class ApplicationConfiguration {
}
