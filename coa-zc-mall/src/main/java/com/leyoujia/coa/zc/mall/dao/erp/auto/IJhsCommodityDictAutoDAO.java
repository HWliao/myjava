package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDictDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityDict;
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
public interface IJhsCommodityDictAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodityDict> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityDictResult")
    JhsCommodityDict selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityDictResult")
    List<JhsCommodityDict> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default Function<SelectStatementProvider, List<JhsCommodityDict>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityDictResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DICTTEXT", property="dicttext", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMODITYID", property="commodityid", jdbcType=JdbcType.INTEGER),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATETIME", property="updatetime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsCommodityDict> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodityDict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityDict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityDict)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default int insert(JhsCommodityDict record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityDict)
                .map(dicttext).toProperty("dicttext")
                .map(commodityid).toProperty("commodityid")
                .map(count).toProperty("count")
                .map(createtime).toProperty("createtime")
                .map(updatetime).toProperty("updatetime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default int insertSelective(JhsCommodityDict record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityDict)
                .map(dicttext).toPropertyWhenPresent("dicttext", record::getDicttext)
                .map(commodityid).toPropertyWhenPresent("commodityid", record::getCommodityid)
                .map(count).toPropertyWhenPresent("count", record::getCount)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .map(updatetime).toPropertyWhenPresent("updatetime", record::getUpdatetime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityDict>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, dicttext, commodityid, count, createtime, updatetime)
                .from(jhsCommodityDict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityDict>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, dicttext, commodityid, count, createtime, updatetime)
                .from(jhsCommodityDict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityDict>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, dicttext, commodityid, count, createtime, updatetime)
                .from(jhsCommodityDict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityDict>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, dicttext, commodityid, count, createtime, updatetime)
                .from(jhsCommodityDict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default JhsCommodityDict selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, dicttext, commodityid, count, createtime, updatetime)
                .from(jhsCommodityDict)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodityDict record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityDict)
                .set(dicttext).equalTo(record::getDicttext)
                .set(commodityid).equalTo(record::getCommodityid)
                .set(count).equalTo(record::getCount)
                .set(createtime).equalTo(record::getCreatetime)
                .set(updatetime).equalTo(record::getUpdatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodityDict record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityDict)
                .set(dicttext).equalToWhenPresent(record::getDicttext)
                .set(commodityid).equalToWhenPresent(record::getCommodityid)
                .set(count).equalToWhenPresent(record::getCount)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default int updateByPrimaryKey(JhsCommodityDict record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityDict)
                .set(dicttext).equalTo(record::getDicttext)
                .set(commodityid).equalTo(record::getCommodityid)
                .set(count).equalTo(record::getCount)
                .set(createtime).equalTo(record::getCreatetime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    default int updateByPrimaryKeySelective(JhsCommodityDict record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityDict)
                .set(dicttext).equalToWhenPresent(record::getDicttext)
                .set(commodityid).equalToWhenPresent(record::getCommodityid)
                .set(count).equalToWhenPresent(record::getCount)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}