package com.myjava.demo.intergrate.configuration;

import com.myjava.demo.intergrate.configuration.properties.TianyanchaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 应用配置类
 *
 * @author lhw
 * @date 2019/2/19
 */
@Configuration
@ImportResource("classpath*:/spring-dubbo.xml")
@EnableConfigurationProperties(TianyanchaProperties.class)
public class ApplicationConfiguration {
}
