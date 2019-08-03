package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityStockLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityStockLog;
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
public interface IJhsCommodityStockLogkAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodityStockLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityStockLogResult")
    JhsCommodityStockLog selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityStockLogResult")
    List<JhsCommodityStockLog> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default Function<SelectStatementProvider, List<JhsCommodityStockLog>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityStockLogResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STOCK_ID", property="stockId", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="SUB_TYPE", property="subType", jdbcType=JdbcType.CHAR),
        @Result(column="NUM", property="num", jdbcType=JdbcType.DECIMAL),
        @Result(column="DESCR", property="descr", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BI_DATE", property="biDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsCommodityStockLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodityStockLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityStockLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityStockLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default int insert(JhsCommodityStockLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityStockLog)
                .map(stockId).toProperty("stockId")
                .map(type).toProperty("type")
                .map(subType).toProperty("subType")
                .map(num).toProperty("num")
                .map(descr).toProperty("descr")
                .map(status).toProperty("status")
                .map(createTime).toProperty("createTime")
                .map(biDate).toProperty("biDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default int insertSelective(JhsCommodityStockLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityStockLog)
                .map(stockId).toPropertyWhenPresent("stockId", record::getStockId)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(subType).toPropertyWhenPresent("subType", record::getSubType)
                .map(num).toPropertyWhenPresent("num", record::getNum)
                .map(descr).toPropertyWhenPresent("descr", record::getDescr)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(biDate).toPropertyWhenPresent("biDate", record::getBiDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStockLog>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, stockId, type, subType, num, descr, status, createTime, biDate)
                .from(jhsCommodityStockLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStockLog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, stockId, type, subType, num, descr, status, createTime, biDate)
                .from(jhsCommodityStockLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStockLog>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, stockId, type, subType, num, descr, status, createTime, biDate)
                .from(jhsCommodityStockLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStockLog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, stockId, type, subType, num, descr, status, createTime, biDate)
                .from(jhsCommodityStockLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default JhsCommodityStockLog selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, stockId, type, subType, num, descr, status, createTime, biDate)
                .from(jhsCommodityStockLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodityStockLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStockLog)
                .set(stockId).equalTo(record::getStockId)
                .set(type).equalTo(record::getType)
                .set(subType).equalTo(record::getSubType)
                .set(num).equalTo(record::getNum)
                .set(descr).equalTo(record::getDescr)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(biDate).equalTo(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodityStockLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStockLog)
                .set(stockId).equalToWhenPresent(record::getStockId)
                .set(type).equalToWhenPresent(record::getType)
                .set(subType).equalToWhenPresent(record::getSubType)
                .set(num).equalToWhenPresent(record::getNum)
                .set(descr).equalToWhenPresent(record::getDescr)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(biDate).equalToWhenPresent(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default int updateByPrimaryKey(JhsCommodityStockLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStockLog)
                .set(stockId).equalTo(record::getStockId)
                .set(type).equalTo(record::getType)
                .set(subType).equalTo(record::getSubType)
                .set(num).equalTo(record::getNum)
                .set(descr).equalTo(record::getDescr)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(biDate).equalTo(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    default int updateByPrimaryKeySelective(JhsCommodityStockLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStockLog)
                .set(stockId).equalToWhenPresent(record::getStockId)
                .set(type).equalToWhenPresent(record::getType)
                .set(subType).equalToWhenPresent(record::getSubType)
                .set(num).equalToWhenPresent(record::getNum)
                .set(descr).equalToWhenPresent(record::getDescr)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(biDate).equalToWhenPresent(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}