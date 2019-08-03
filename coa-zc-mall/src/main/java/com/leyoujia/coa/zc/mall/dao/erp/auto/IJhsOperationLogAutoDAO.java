package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsOperationLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsOperationLog;
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
public interface IJhsOperationLogAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsOperationLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsOperationLogResult")
    JhsOperationLog selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsOperationLogResult")
    List<JhsOperationLog> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default Function<SelectStatementProvider, List<JhsOperationLog>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsOperationLogResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BUS_TYPE", property="busType", jdbcType=JdbcType.INTEGER),
        @Result(column="BUS_ID", property="busId", jdbcType=JdbcType.INTEGER),
        @Result(column="OP_TYPE", property="opType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OP_CONTENT", property="opContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="OP_WORKER_ID", property="opWorkerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="OP_WORKER_NAME", property="opWorkerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EXTRA1", property="extra1", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTRA2", property="extra2", jdbcType=JdbcType.VARCHAR)
    })
    List<JhsOperationLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsOperationLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsOperationLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsOperationLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default int insert(JhsOperationLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsOperationLog)
                .map(busType).toProperty("busType")
                .map(busId).toProperty("busId")
                .map(opType).toProperty("opType")
                .map(opContent).toProperty("opContent")
                .map(opWorkerId).toProperty("opWorkerId")
                .map(opWorkerName).toProperty("opWorkerName")
                .map(status).toProperty("status")
                .map(createTime).toProperty("createTime")
                .map(extra1).toProperty("extra1")
                .map(extra2).toProperty("extra2")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default int insertSelective(JhsOperationLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsOperationLog)
                .map(busType).toPropertyWhenPresent("busType", record::getBusType)
                .map(busId).toPropertyWhenPresent("busId", record::getBusId)
                .map(opType).toPropertyWhenPresent("opType", record::getOpType)
                .map(opContent).toPropertyWhenPresent("opContent", record::getOpContent)
                .map(opWorkerId).toPropertyWhenPresent("opWorkerId", record::getOpWorkerId)
                .map(opWorkerName).toPropertyWhenPresent("opWorkerName", record::getOpWorkerName)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(extra1).toPropertyWhenPresent("extra1", record::getExtra1)
                .map(extra2).toPropertyWhenPresent("extra2", record::getExtra2)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsOperationLog>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, busType, busId, opType, opContent, opWorkerId, opWorkerName, status, createTime, extra1, extra2)
                .from(jhsOperationLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsOperationLog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, busType, busId, opType, opContent, opWorkerId, opWorkerName, status, createTime, extra1, extra2)
                .from(jhsOperationLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsOperationLog>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, busType, busId, opType, opContent, opWorkerId, opWorkerName, status, createTime, extra1, extra2)
                .from(jhsOperationLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsOperationLog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, busType, busId, opType, opContent, opWorkerId, opWorkerName, status, createTime, extra1, extra2)
                .from(jhsOperationLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default JhsOperationLog selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, busType, busId, opType, opContent, opWorkerId, opWorkerName, status, createTime, extra1, extra2)
                .from(jhsOperationLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsOperationLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsOperationLog)
                .set(busType).equalTo(record::getBusType)
                .set(busId).equalTo(record::getBusId)
                .set(opType).equalTo(record::getOpType)
                .set(opContent).equalTo(record::getOpContent)
                .set(opWorkerId).equalTo(record::getOpWorkerId)
                .set(opWorkerName).equalTo(record::getOpWorkerName)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(extra1).equalTo(record::getExtra1)
                .set(extra2).equalTo(record::getExtra2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsOperationLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsOperationLog)
                .set(busType).equalToWhenPresent(record::getBusType)
                .set(busId).equalToWhenPresent(record::getBusId)
                .set(opType).equalToWhenPresent(record::getOpType)
                .set(opContent).equalToWhenPresent(record::getOpContent)
                .set(opWorkerId).equalToWhenPresent(record::getOpWorkerId)
                .set(opWorkerName).equalToWhenPresent(record::getOpWorkerName)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(extra1).equalToWhenPresent(record::getExtra1)
                .set(extra2).equalToWhenPresent(record::getExtra2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default int updateByPrimaryKey(JhsOperationLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsOperationLog)
                .set(busType).equalTo(record::getBusType)
                .set(busId).equalTo(record::getBusId)
                .set(opType).equalTo(record::getOpType)
                .set(opContent).equalTo(record::getOpContent)
                .set(opWorkerId).equalTo(record::getOpWorkerId)
                .set(opWorkerName).equalTo(record::getOpWorkerName)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(extra1).equalTo(record::getExtra1)
                .set(extra2).equalTo(record::getExtra2)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    default int updateByPrimaryKeySelective(JhsOperationLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsOperationLog)
                .set(busType).equalToWhenPresent(record::getBusType)
                .set(busId).equalToWhenPresent(record::getBusId)
                .set(opType).equalToWhenPresent(record::getOpType)
                .set(opContent).equalToWhenPresent(record::getOpContent)
                .set(opWorkerId).equalToWhenPresent(record::getOpWorkerId)
                .set(opWorkerName).equalToWhenPresent(record::getOpWorkerName)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(extra1).equalToWhenPresent(record::getExtra1)
                .set(extra2).equalToWhenPresent(record::getExtra2)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}