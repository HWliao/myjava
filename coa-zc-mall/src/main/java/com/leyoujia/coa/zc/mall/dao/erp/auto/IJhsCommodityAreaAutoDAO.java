package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityAreaDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityArea;
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
public interface IJhsCommodityAreaAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodityArea> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityAreaResult")
    JhsCommodityArea selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityAreaResult")
    List<JhsCommodityArea> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default Function<SelectStatementProvider, List<JhsCommodityArea>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityAreaResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="commodity_id", property="commodityId", jdbcType=JdbcType.INTEGER),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_name", property="provinceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR)
    })
    List<JhsCommodityArea> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodityArea);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityArea);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityArea)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default int insert(JhsCommodityArea record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityArea)
                .map(commodityId).toProperty("commodityId")
                .map(provinceCode).toProperty("provinceCode")
                .map(provinceName).toProperty("provinceName")
                .map(cityCode).toProperty("cityCode")
                .map(cityName).toProperty("cityName")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default int insertSelective(JhsCommodityArea record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityArea)
                .map(commodityId).toPropertyWhenPresent("commodityId", record::getCommodityId)
                .map(provinceCode).toPropertyWhenPresent("provinceCode", record::getProvinceCode)
                .map(provinceName).toPropertyWhenPresent("provinceName", record::getProvinceName)
                .map(cityCode).toPropertyWhenPresent("cityCode", record::getCityCode)
                .map(cityName).toPropertyWhenPresent("cityName", record::getCityName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityArea>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, provinceCode, provinceName, cityCode, cityName)
                .from(jhsCommodityArea);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityArea>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, commodityId, provinceCode, provinceName, cityCode, cityName)
                .from(jhsCommodityArea);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityArea>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, provinceCode, provinceName, cityCode, cityName)
                .from(jhsCommodityArea);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityArea>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, commodityId, provinceCode, provinceName, cityCode, cityName)
                .from(jhsCommodityArea);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default JhsCommodityArea selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, commodityId, provinceCode, provinceName, cityCode, cityName)
                .from(jhsCommodityArea)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodityArea record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityArea)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(provinceCode).equalTo(record::getProvinceCode)
                .set(provinceName).equalTo(record::getProvinceName)
                .set(cityCode).equalTo(record::getCityCode)
                .set(cityName).equalTo(record::getCityName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodityArea record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityArea)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(provinceCode).equalToWhenPresent(record::getProvinceCode)
                .set(provinceName).equalToWhenPresent(record::getProvinceName)
                .set(cityCode).equalToWhenPresent(record::getCityCode)
                .set(cityName).equalToWhenPresent(record::getCityName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default int updateByPrimaryKey(JhsCommodityArea record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityArea)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(provinceCode).equalTo(record::getProvinceCode)
                .set(provinceName).equalTo(record::getProvinceName)
                .set(cityCode).equalTo(record::getCityCode)
                .set(cityName).equalTo(record::getCityName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    default int updateByPrimaryKeySelective(JhsCommodityArea record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityArea)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(provinceCode).equalToWhenPresent(record::getProvinceCode)
                .set(provinceName).equalToWhenPresent(record::getProvinceName)
                .set(cityCode).equalToWhenPresent(record::getCityCode)
                .set(cityName).equalToWhenPresent(record::getCityName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}