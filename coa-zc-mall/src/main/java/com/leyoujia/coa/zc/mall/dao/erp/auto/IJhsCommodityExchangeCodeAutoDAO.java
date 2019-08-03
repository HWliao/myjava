package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityExchangeCodeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityExchangeCode;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface IJhsCommodityExchangeCodeAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodityExchangeCode> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityExchangeCodeResult")
    JhsCommodityExchangeCode selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityExchangeCodeResult")
    List<JhsCommodityExchangeCode> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default Function<SelectStatementProvider, List<JhsCommodityExchangeCode>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityExchangeCodeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="COMMODITY_ID", property="commodityId", jdbcType=JdbcType.INTEGER),
        @Result(column="EXCHANGE_CODE", property="exchangeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="VALID", property="valid", jdbcType=JdbcType.TINYINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsCommodityExchangeCode> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodityExchangeCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityExchangeCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityExchangeCode)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default int insert(JhsCommodityExchangeCode record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityExchangeCode)
                .map(commodityId).toProperty("commodityId")
                .map(exchangeCode).toProperty("exchangeCode")
                .map(valid).toProperty("valid")
                .map(createTime).toProperty("createTime")
                .map(updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default int insertSelective(JhsCommodityExchangeCode record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityExchangeCode)
                .map(commodityId).toPropertyWhenPresent("commodityId", record::getCommodityId)
                .map(exchangeCode).toPropertyWhenPresent("exchangeCode", record::getExchangeCode)
                .map(valid).toPropertyWhenPresent("valid", record::getValid)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityExchangeCode>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, exchangeCode, valid, createTime, updateTime)
                .from(jhsCommodityExchangeCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityExchangeCode>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, commodityId, exchangeCode, valid, createTime, updateTime)
                .from(jhsCommodityExchangeCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityExchangeCode>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, exchangeCode, valid, createTime, updateTime)
                .from(jhsCommodityExchangeCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityExchangeCode>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, commodityId, exchangeCode, valid, createTime, updateTime)
                .from(jhsCommodityExchangeCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default JhsCommodityExchangeCode selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, commodityId, exchangeCode, valid, createTime, updateTime)
                .from(jhsCommodityExchangeCode)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodityExchangeCode record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityExchangeCode)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(exchangeCode).equalTo(record::getExchangeCode)
                .set(valid).equalTo(record::getValid)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodityExchangeCode record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityExchangeCode)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(exchangeCode).equalToWhenPresent(record::getExchangeCode)
                .set(valid).equalToWhenPresent(record::getValid)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default int updateByPrimaryKey(JhsCommodityExchangeCode record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityExchangeCode)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(exchangeCode).equalTo(record::getExchangeCode)
                .set(valid).equalTo(record::getValid)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    default int updateByPrimaryKeySelective(JhsCommodityExchangeCode record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityExchangeCode)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(exchangeCode).equalToWhenPresent(record::getExchangeCode)
                .set(valid).equalToWhenPresent(record::getValid)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}