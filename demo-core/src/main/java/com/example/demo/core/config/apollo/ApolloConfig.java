package com.example.demo.core.config.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Configuration;

/**
 * apollo配置类
 *
 * @author HWliao
 */
@Configuration
@EnableApolloConfig(order = 1)
public class ApolloConfig {
}
