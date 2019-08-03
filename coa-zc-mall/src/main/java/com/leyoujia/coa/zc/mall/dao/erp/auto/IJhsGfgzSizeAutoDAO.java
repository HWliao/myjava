package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsGfgzSizeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsGfgzSize;
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
public interface IJhsGfgzSizeAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsGfgzSize> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsGfgzSizeResult")
    JhsGfgzSize selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsGfgzSizeResult")
    List<JhsGfgzSize> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default Function<SelectStatementProvider, List<JhsGfgzSize>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsGfgzSizeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SUB_ID", property="subId", jdbcType=JdbcType.INTEGER),
        @Result(column="SUB_NAME", property="subName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE_NAME", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SIZE", property="size", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOTAL", property="total", jdbcType=JdbcType.INTEGER)
    })
    List<JhsGfgzSize> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsGfgzSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsGfgzSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsGfgzSize)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default int insert(JhsGfgzSize record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsGfgzSize)
                .map(subId).toProperty("subId")
                .map(subName).toProperty("subName")
                .map(type).toProperty("type")
                .map(typeName).toProperty("typeName")
                .map(size).toProperty("size")
                .map(total).toProperty("total")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default int insertSelective(JhsGfgzSize record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsGfgzSize)
                .map(subId).toPropertyWhenPresent("subId", record::getSubId)
                .map(subName).toPropertyWhenPresent("subName", record::getSubName)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(typeName).toPropertyWhenPresent("typeName", record::getTypeName)
                .map(size).toPropertyWhenPresent("size", record::getSize)
                .map(total).toPropertyWhenPresent("total", record::getTotal)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsGfgzSize>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, subId, subName, type, typeName, size, total)
                .from(jhsGfgzSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsGfgzSize>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, subId, subName, type, typeName, size, total)
                .from(jhsGfgzSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsGfgzSize>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, subId, subName, type, typeName, size, total)
                .from(jhsGfgzSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsGfgzSize>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, subId, subName, type, typeName, size, total)
                .from(jhsGfgzSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default JhsGfgzSize selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, subId, subName, type, typeName, size, total)
                .from(jhsGfgzSize)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsGfgzSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsGfgzSize)
                .set(subId).equalTo(record::getSubId)
                .set(subName).equalTo(record::getSubName)
                .set(type).equalTo(record::getType)
                .set(typeName).equalTo(record::getTypeName)
                .set(size).equalTo(record::getSize)
                .set(total).equalTo(record::getTotal);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsGfgzSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsGfgzSize)
                .set(subId).equalToWhenPresent(record::getSubId)
                .set(subName).equalToWhenPresent(record::getSubName)
                .set(type).equalToWhenPresent(record::getType)
                .set(typeName).equalToWhenPresent(record::getTypeName)
                .set(size).equalToWhenPresent(record::getSize)
                .set(total).equalToWhenPresent(record::getTotal);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default int updateByPrimaryKey(JhsGfgzSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsGfgzSize)
                .set(subId).equalTo(record::getSubId)
                .set(subName).equalTo(record::getSubName)
                .set(type).equalTo(record::getType)
                .set(typeName).equalTo(record::getTypeName)
                .set(size).equalTo(record::getSize)
                .set(total).equalTo(record::getTotal)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    default int updateByPrimaryKeySelective(JhsGfgzSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsGfgzSize)
                .set(subId).equalToWhenPresent(record::getSubId)
                .set(subName).equalToWhenPresent(record::getSubName)
                .set(type).equalToWhenPresent(record::getType)
                .set(typeName).equalToWhenPresent(record::getTypeName)
                .set(size).equalToWhenPresent(record::getSize)
                .set(total).equalToWhenPresent(record::getTotal)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}