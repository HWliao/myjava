package com.leyoujia.coa.zc.core.tomcat;

import com.radiadesign.catalina.session.RedisSessionHandlerValve;
import com.radiadesign.catalina.session.RedisSessionManager;
import org.apache.catalina.Valve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * tomcat自动配置
 *
 * @author lhw
 * @date 2019/8/3
 */
@ConditionalOnProperty(name = "coa.session.redis.enable")
@ConditionalOnWebApplication
@ConditionalOnClass({TomcatServletWebServerFactory.class})
@Configuration
@EnableConfigurationProperties(ShareSessionRedisConfig.class)
public class TomcatAutoConfigure {
  private static Logger LOG = LoggerFactory.getLogger(TomcatAutoConfigure.class);

  @Autowired
  private ShareSessionRedisConfig shareSessionRedisConfig;

  @Bean
  public WebServerFactoryCustomizer<TomcatServletWebServerFactory> createTomcatCustomizer() {
    LOG.info("[tomcat share session]配置tomcat session 共享,参数:{}", shareSessionRedisConfig);
    return factory -> {

      Valve valve = new RedisSessionHandlerValve();
      factory.addContextValves(valve);

      factory.addContextCustomizers((TomcatContextCustomizer) context -> {
        RedisSessionManager redisSessionManager = new RedisSessionManager();
        redisSessionManager.setHost(shareSessionRedisConfig.getHost());
        redisSessionManager.setPort(shareSessionRedisConfig.getPort());
        redisSessionManager.setDatabase(shareSessionRedisConfig.getDatabase());
        redisSessionManager.setPassword(shareSessionRedisConfig.getPassword());
        context.setManager(redisSessionManager);
      });

    };
  }


}
