package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityTextDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityText;
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
public interface IJhsCommodityTextkAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodityText> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityTextResult")
    JhsCommodityText selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityTextResult")
    List<JhsCommodityText> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default Function<SelectStatementProvider, List<JhsCommodityText>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityTextResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="ATTACH_ID", property="attachId", jdbcType=JdbcType.INTEGER),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT", property="ext", jdbcType=JdbcType.VARCHAR),
        @Result(column="MANUAL", property="manual", jdbcType=JdbcType.VARCHAR)
    })
    List<JhsCommodityText> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodityText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityText)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default int insert(JhsCommodityText record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityText)
                .map(type).toProperty("type")
                .map(attachId).toProperty("attachId")
                .map(content).toProperty("content")
                .map(ext).toProperty("ext")
                .map(manual).toProperty("manual")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default int insertSelective(JhsCommodityText record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityText)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(attachId).toPropertyWhenPresent("attachId", record::getAttachId)
                .map(content).toPropertyWhenPresent("content", record::getContent)
                .map(ext).toPropertyWhenPresent("ext", record::getExt)
                .map(manual).toPropertyWhenPresent("manual", record::getManual)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityText>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, type, attachId, content, ext, manual)
                .from(jhsCommodityText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityText>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, type, attachId, content, ext, manual)
                .from(jhsCommodityText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityText>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, type, attachId, content, ext, manual)
                .from(jhsCommodityText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityText>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, type, attachId, content, ext, manual)
                .from(jhsCommodityText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default JhsCommodityText selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, type, attachId, content, ext, manual)
                .from(jhsCommodityText)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodityText record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityText)
                .set(type).equalTo(record::getType)
                .set(attachId).equalTo(record::getAttachId)
                .set(content).equalTo(record::getContent)
                .set(ext).equalTo(record::getExt)
                .set(manual).equalTo(record::getManual);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodityText record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityText)
                .set(type).equalToWhenPresent(record::getType)
                .set(attachId).equalToWhenPresent(record::getAttachId)
                .set(content).equalToWhenPresent(record::getContent)
                .set(ext).equalToWhenPresent(record::getExt)
                .set(manual).equalToWhenPresent(record::getManual);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default int updateByPrimaryKey(JhsCommodityText record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityText)
                .set(type).equalTo(record::getType)
                .set(attachId).equalTo(record::getAttachId)
                .set(content).equalTo(record::getContent)
                .set(ext).equalTo(record::getExt)
                .set(manual).equalTo(record::getManual)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    default int updateByPrimaryKeySelective(JhsCommodityText record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityText)
                .set(type).equalToWhenPresent(record::getType)
                .set(attachId).equalToWhenPresent(record::getAttachId)
                .set(content).equalToWhenPresent(record::getContent)
                .set(ext).equalToWhenPresent(record::getExt)
                .set(manual).equalToWhenPresent(record::getManual)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}