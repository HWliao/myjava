package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsAuctionTipLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsAuctionTipLog;
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
public interface IJhsAuctionTipLogAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsAuctionTipLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsAuctionTipLogResult")
    JhsAuctionTipLog selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsAuctionTipLogResult")
    List<JhsAuctionTipLog> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default Function<SelectStatementProvider, List<JhsAuctionTipLog>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsAuctionTipLogResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ORDER_NO", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsAuctionTipLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsAuctionTipLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsAuctionTipLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsAuctionTipLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default int insert(JhsAuctionTipLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsAuctionTipLog)
                .map(orderNo).toProperty("orderNo")
                .map(status).toProperty("status")
                .map(createTime).toProperty("createTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default int insertSelective(JhsAuctionTipLog record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsAuctionTipLog)
                .map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionTipLog>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, orderNo, status, createTime)
                .from(jhsAuctionTipLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionTipLog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderNo, status, createTime)
                .from(jhsAuctionTipLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionTipLog>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, orderNo, status, createTime)
                .from(jhsAuctionTipLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionTipLog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderNo, status, createTime)
                .from(jhsAuctionTipLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default JhsAuctionTipLog selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, orderNo, status, createTime)
                .from(jhsAuctionTipLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsAuctionTipLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionTipLog)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsAuctionTipLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionTipLog)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default int updateByPrimaryKey(JhsAuctionTipLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionTipLog)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    default int updateByPrimaryKeySelective(JhsAuctionTipLog record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionTipLog)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}