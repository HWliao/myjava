package com.leyoujia.coa.zc.core.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;

/**
 * 数据源配置抽象
 *
 * @author lhw
 * @date 2019/7/19
 */
public abstract class AbstractDataSourceConfig {

  protected Advisor createAdvisor(TransactionInterceptor advice) {
    AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    pointcut.setExpression("(execution (* com.***.service.*.*(..))) || (execution (* com.***.manager.*.*(..)))");
    return new DefaultPointcutAdvisor(pointcut, advice);
  }

  protected TransactionInterceptor createAdvice(DataSourceTransactionManager tx) {
    DefaultTransactionAttribute required = new DefaultTransactionAttribute();
    required.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

    DefaultTransactionAttribute supports = new DefaultTransactionAttribute();
    supports.setPropagationBehavior(TransactionDefinition.PROPAGATION_SUPPORTS);

    DefaultTransactionAttribute notSupports = new DefaultTransactionAttribute();
    supports.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);

    NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
    source.addTransactionalMethod("add*", required);
    source.addTransactionalMethod("save*", required);
    source.addTransactionalMethod("delete*", required);
    source.addTransactionalMethod("update*", required);
    source.addTransactionalMethod("exec*", required);
    source.addTransactionalMethod("set*", required);
    source.addTransactionalMethod("get*", supports);
    source.addTransactionalMethod("query*", supports);
    source.addTransactionalMethod("find*", supports);
    source.addTransactionalMethod("list*", supports);
    source.addTransactionalMethod("count*", supports);
    source.addTransactionalMethod("is*", supports);
    source.addTransactionalMethod("*", supports);
    // 调用远程接口不开事务
    source.addTransactionalMethod("remote*", notSupports);
    source.addTransactionalMethod("call*", notSupports);
    return new TransactionInterceptor(tx, source);
  }

  protected SqlSessionFactory createSqlSessionFactory(DataSource dataSource, String path) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(path));
    return bean.getObject();
  }

}
