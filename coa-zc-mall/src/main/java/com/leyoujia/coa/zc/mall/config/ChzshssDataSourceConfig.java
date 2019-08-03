package com.leyoujia.coa.zc.mall.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.leyoujia.coa.zc.core.config.AbstractDataSourceConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.Advisor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;

/**
 * chzshss
 *
 * @author lhw
 * @date 2019/7/19
 */
//@Configuration
//@MapperScan(basePackages = "com.leyoujia.coa.zc.mall.dao.chzshss", sqlSessionTemplateRef = "chzshssSqlSessionTemplate")
public class ChzshssDataSourceConfig extends AbstractDataSourceConfig {

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource.chzshss")
  public DataSource chzshssDataSource() {
    return DruidDataSourceBuilder.create().build();
  }

  @Bean
  public SqlSessionFactory chzshssSqlSessionFactory() throws Exception {
    return createSqlSessionFactory(chzshssDataSource(), "classpath*:com/leyoujia/coa/zc/mall/dao/chzshss/mapper/*.xml");
  }

  @Bean
  public SqlSessionTemplate chzshssSqlSessionTemplate() throws Exception {
    return new SqlSessionTemplate(chzshssSqlSessionFactory());
  }

  @Bean
  public DataSourceTransactionManager chzshssTxManager() {
    return new DataSourceTransactionManager(chzshssDataSource());
  }

  @Bean
  public TransactionInterceptor chzshssTxAdvice() {
    return createAdvice(chzshssTxManager());
  }

  @Bean
  public Advisor chzshssTxAdviceAdvisor() {
    return createAdvisor(chzshssTxAdvice());
  }
}
