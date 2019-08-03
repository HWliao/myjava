package com.leyoujia.coa.zc.mall.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.leyoujia.coa.zc.core.config.AbstractDataSourceConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.lang.annotation.Aspect;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.Advisor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;

/**
 * kp
 *
 * @author lhw
 * @date 2019/7/19
 */
//@Aspect
//@Configuration
//@MapperScan(basePackages = "com.leyoujia.coa.zc.mall.dao.kp", sqlSessionTemplateRef = "kpSqlSessionTemplate")
public class KpDataSourceConfig extends AbstractDataSourceConfig {

  @ConfigurationProperties(prefix = "spring.datasource.kp")
  @Bean
  @Primary
  public DataSource kpDataSource() {
    return DruidDataSourceBuilder.create().build();
  }

  @Primary
  @Bean
  public SqlSessionFactory kpSqlSessionFactory() throws Exception {
    return createSqlSessionFactory(kpDataSource(), "classpath*:com/leyoujia/coa/zc/mall/dao/kp/mapper/*.xml");
  }

  @Primary
  @Bean
  public SqlSessionTemplate kpSqlSessionTemplate() throws Exception {
    return new SqlSessionTemplate(kpSqlSessionFactory());
  }

  @Primary
  @Bean
  public DataSourceTransactionManager kpTxManager() {
    return new DataSourceTransactionManager(kpDataSource());
  }

  @Bean
  public TransactionInterceptor kpTxAdvice() {
    return createAdvice(kpTxManager());
  }

  @Bean
  public Advisor kpTxAdviceAdvisor() {
    return createAdvisor(kpTxAdvice());
  }
}
