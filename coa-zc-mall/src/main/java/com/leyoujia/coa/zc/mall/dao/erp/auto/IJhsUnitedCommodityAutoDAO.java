package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsUnitedCommodityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsUnitedCommodity;
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
public interface IJhsUnitedCommodityAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsUnitedCommodity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsUnitedCommodityResult")
    JhsUnitedCommodity selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsUnitedCommodityResult")
    List<JhsUnitedCommodity> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default Function<SelectStatementProvider, List<JhsUnitedCommodity>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsUnitedCommodityResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="COMMODITY_PID", property="commodityPid", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_SID", property="commoditySid", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="ONLY_ONE", property="onlyOne", jdbcType=JdbcType.CHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsUnitedCommodity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsUnitedCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsUnitedCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsUnitedCommodity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default int insert(JhsUnitedCommodity record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsUnitedCommodity)
                .map(commodityPid).toProperty("commodityPid")
                .map(commoditySid).toProperty("commoditySid")
                .map(type).toProperty("type")
                .map(onlyOne).toProperty("onlyOne")
                .map(createTime).toProperty("createTime")
                .map(updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default int insertSelective(JhsUnitedCommodity record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsUnitedCommodity)
                .map(commodityPid).toPropertyWhenPresent("commodityPid", record::getCommodityPid)
                .map(commoditySid).toPropertyWhenPresent("commoditySid", record::getCommoditySid)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(onlyOne).toPropertyWhenPresent("onlyOne", record::getOnlyOne)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsUnitedCommodity>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, commodityPid, commoditySid, type, onlyOne, createTime, updateTime)
                .from(jhsUnitedCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsUnitedCommodity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, commodityPid, commoditySid, type, onlyOne, createTime, updateTime)
                .from(jhsUnitedCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsUnitedCommodity>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, commodityPid, commoditySid, type, onlyOne, createTime, updateTime)
                .from(jhsUnitedCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsUnitedCommodity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, commodityPid, commoditySid, type, onlyOne, createTime, updateTime)
                .from(jhsUnitedCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default JhsUnitedCommodity selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, commodityPid, commoditySid, type, onlyOne, createTime, updateTime)
                .from(jhsUnitedCommodity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsUnitedCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsUnitedCommodity)
                .set(commodityPid).equalTo(record::getCommodityPid)
                .set(commoditySid).equalTo(record::getCommoditySid)
                .set(type).equalTo(record::getType)
                .set(onlyOne).equalTo(record::getOnlyOne)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsUnitedCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsUnitedCommodity)
                .set(commodityPid).equalToWhenPresent(record::getCommodityPid)
                .set(commoditySid).equalToWhenPresent(record::getCommoditySid)
                .set(type).equalToWhenPresent(record::getType)
                .set(onlyOne).equalToWhenPresent(record::getOnlyOne)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default int updateByPrimaryKey(JhsUnitedCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsUnitedCommodity)
                .set(commodityPid).equalTo(record::getCommodityPid)
                .set(commoditySid).equalTo(record::getCommoditySid)
                .set(type).equalTo(record::getType)
                .set(onlyOne).equalTo(record::getOnlyOne)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    default int updateByPrimaryKeySelective(JhsUnitedCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsUnitedCommodity)
                .set(commodityPid).equalToWhenPresent(record::getCommodityPid)
                .set(commoditySid).equalToWhenPresent(record::getCommoditySid)
                .set(type).equalToWhenPresent(record::getType)
                .set(onlyOne).equalToWhenPresent(record::getOnlyOne)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}