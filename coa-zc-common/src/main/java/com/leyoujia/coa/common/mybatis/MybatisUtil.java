package com.leyoujia.coa.common.mybatis;

import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.where.WhereDSL;
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;

/**
 * mybatis工具类
 *
 * @author l
 * @since 2019/7/29
 */
public class MybatisUtil {
  /**
   * WhereClauseProvider查询参数名
   */
  public static final String PARAM_NAME_WHERECLAUSE = "whereClauseProvider";

  /**
   * 构造WhereClauseProvider
   * <p>
   * 当SQL有多个参数时，需用@param("name")区分
   * 此处统一赋予WhereClauseProvider参数名
   *
   * @param whereDsl WhereDSL
   * @return WhereClauseProvider
   */
  public static WhereClauseProvider createWhereClauseProvider(WhereDSL whereDsl) {
    return whereDsl.build().render(RenderingStrategy.MYBATIS3, PARAM_NAME_WHERECLAUSE);
  }
}
