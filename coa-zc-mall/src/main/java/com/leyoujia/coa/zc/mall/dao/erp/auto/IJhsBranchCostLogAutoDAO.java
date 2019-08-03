package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsBranchCostLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsBranchCostLog;
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
public interface IJhsBranchCostLogAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsBranchCostLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsBranchCostLogResult")
    JhsBranchCostLog selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsBranchCostLogResult")
    List<JhsBranchCostLog> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default Function<SelectStatementProvider, List<JhsBranchCostLog>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsBranchCostLogResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ORDER_ID", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERTATION_LOG", property="opertationLog", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_DATE", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BI_DATE", property="biDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsBranchCostLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsBranchCostLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsBranchCostLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsBranchCostLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default int insert(JhsBranchCostLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsBranchCostLog)
                .map(orderId).toProperty("orderId")
                .map(opertationLog).toProperty("opertationLog")
                .map(status).toProperty("status")
                .map(createDate).toProperty("createDate")
                .map(updateDate).toProperty("updateDate")
                .map(biDate).toProperty("biDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default int insertSelective(JhsBranchCostLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsBranchCostLog)
                .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
                .map(opertationLog).toPropertyWhenPresent("opertationLog", record::getOpertationLog)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
                .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
                .map(biDate).toPropertyWhenPresent("biDate", record::getBiDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsBranchCostLog>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, orderId, opertationLog, status, createDate, updateDate, biDate)
                .from(jhsBranchCostLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsBranchCostLog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderId, opertationLog, status, createDate, updateDate, biDate)
                .from(jhsBranchCostLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsBranchCostLog>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, orderId, opertationLog, status, createDate, updateDate, biDate)
                .from(jhsBranchCostLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsBranchCostLog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderId, opertationLog, status, createDate, updateDate, biDate)
                .from(jhsBranchCostLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default JhsBranchCostLog selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, orderId, opertationLog, status, createDate, updateDate, biDate)
                .from(jhsBranchCostLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsBranchCostLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsBranchCostLog)
                .set(orderId).equalTo(record::getOrderId)
                .set(opertationLog).equalTo(record::getOpertationLog)
                .set(status).equalTo(record::getStatus)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(biDate).equalTo(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsBranchCostLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsBranchCostLog)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(opertationLog).equalToWhenPresent(record::getOpertationLog)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(biDate).equalToWhenPresent(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default int updateByPrimaryKey(JhsBranchCostLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsBranchCostLog)
                .set(orderId).equalTo(record::getOrderId)
                .set(opertationLog).equalTo(record::getOpertationLog)
                .set(status).equalTo(record::getStatus)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(biDate).equalTo(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    default int updateByPrimaryKeySelective(JhsBranchCostLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsBranchCostLog)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(opertationLog).equalToWhenPresent(record::getOpertationLog)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(biDate).equalToWhenPresent(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}