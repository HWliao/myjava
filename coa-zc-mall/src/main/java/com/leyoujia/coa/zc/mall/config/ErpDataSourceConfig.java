package com.leyoujia.coa.zc.mall.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.leyoujia.coa.zc.core.config.AbstractDataSourceConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.lang.annotation.Aspect;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.Advisor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;

/**
 * tiger_erp
 *
 * @author lhw
 * @date 2019/7/19
 */
@Configuration
@MapperScan(basePackages = "com.leyoujia.coa.zc.mall.dao.erp", sqlSessionTemplateRef = "erpSqlSessionTemplate")
public class ErpDataSourceConfig extends AbstractDataSourceConfig {

  @ConfigurationProperties(prefix = "spring.datasource.erp")
  @Bean
  public DataSource erpDataSource() {
    return DruidDataSourceBuilder.create().build();
  }

  @Bean
  public SqlSessionFactory erpSqlSessionFactory(@Qualifier("erpDataSource") DataSource erpDataSource) throws Exception {
    return createSqlSessionFactory(erpDataSource, "classpath*:com/leyoujia/coa/zc/mall/dao/erp/mapper/*.xml");
  }

  @Bean
  public SqlSessionTemplate erpSqlSessionTemplate(@Qualifier("erpSqlSessionFactory") SqlSessionFactory erpSqlSessionFactory) throws Exception {
    return new SqlSessionTemplate(erpSqlSessionFactory);
  }

  @Bean
  public DataSourceTransactionManager erpTxManager(@Qualifier("erpDataSource") DataSource erpDataSource) {
    return new DataSourceTransactionManager(erpDataSource);
  }

  @Bean
  public TransactionInterceptor erpTxAdvice(@Qualifier("erpTxManager") DataSourceTransactionManager erpTxManager) {
    return createAdvice(erpTxManager);
  }

  @Bean
  public Advisor erpTxAdviceAdvisor(@Qualifier("erpTxAdvice") TransactionInterceptor erpTxAdvice) {
    return createAdvisor(erpTxAdvice);
  }
}
