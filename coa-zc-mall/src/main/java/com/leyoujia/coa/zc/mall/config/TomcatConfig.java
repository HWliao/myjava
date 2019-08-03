package com.leyoujia.coa.zc.mall.config;

import com.radiadesign.catalina.session.RedisSessionHandlerValve;
import com.radiadesign.catalina.session.RedisSessionManager;
import org.apache.catalina.Context;
import org.apache.catalina.Valve;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhw
 * @date 2019/7/25
 */
@Configuration
public class TomcatConfig {

  /**
   * redis host
   */
  @Value("${coa.session.redis.host}")
  private String host;
  /**
   * redis port
   */
  @Value("${coa.session.redis.port}")
  private Integer port;
  /**
   * redis database
   */
  @Value("${coa.session.redis.database}")
  private Integer database;

  @Bean
  public WebServerFactoryCustomizer<TomcatServletWebServerFactory> createTomcatCustomizer() {
    return factory -> {

      Valve valve = new RedisSessionHandlerValve();
      factory.addContextValves(valve);

      factory.addContextCustomizers(new TomcatContextCustomizer() {
        @Override
        public void customize(Context context) {
          RedisSessionManager redisSessionManager = new RedisSessionManager();
          redisSessionManager.setHost(host);
          redisSessionManager.setPort(port);
          redisSessionManager.setDatabase(database);
          context.setManager(redisSessionManager);
        }
      });

    };
  }

}
