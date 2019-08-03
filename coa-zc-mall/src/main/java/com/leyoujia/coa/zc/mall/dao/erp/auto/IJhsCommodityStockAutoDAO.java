package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityStockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodityStock;
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
public interface IJhsCommodityStockAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodityStock> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityStockResult")
    JhsCommodityStock selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityStockResult")
    List<JhsCommodityStock> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default Function<SelectStatementProvider, List<JhsCommodityStock>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityStockResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="COMMODITY_ID", property="commodityId", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_STANDARD", property="commodityStandard", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUM", property="num", jdbcType=JdbcType.DECIMAL),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_STORAGE_TIME", property="lastStorageTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="BI_DATE", property="biDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsCommodityStock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodityStock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityStock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodityStock)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default int insert(JhsCommodityStock record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityStock)
                .map(commodityId).toProperty("commodityId")
                .map(commodityStandard).toProperty("commodityStandard")
                .map(num).toProperty("num")
                .map(createTime).toProperty("createTime")
                .map(updateTime).toProperty("updateTime")
                .map(lastStorageTime).toProperty("lastStorageTime")
                .map(status).toProperty("status")
                .map(dataVersion).toProperty("dataVersion")
                .map(biDate).toProperty("biDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default int insertSelective(JhsCommodityStock record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodityStock)
                .map(commodityId).toPropertyWhenPresent("commodityId", record::getCommodityId)
                .map(commodityStandard).toPropertyWhenPresent("commodityStandard", record::getCommodityStandard)
                .map(num).toPropertyWhenPresent("num", record::getNum)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(lastStorageTime).toPropertyWhenPresent("lastStorageTime", record::getLastStorageTime)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(dataVersion).toPropertyWhenPresent("dataVersion", record::getDataVersion)
                .map(biDate).toPropertyWhenPresent("biDate", record::getBiDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStock>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, commodityStandard, num, createTime, updateTime, lastStorageTime, status, dataVersion, biDate)
                .from(jhsCommodityStock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStock>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, commodityId, commodityStandard, num, createTime, updateTime, lastStorageTime, status, dataVersion, biDate)
                .from(jhsCommodityStock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStock>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, commodityStandard, num, createTime, updateTime, lastStorageTime, status, dataVersion, biDate)
                .from(jhsCommodityStock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodityStock>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, commodityId, commodityStandard, num, createTime, updateTime, lastStorageTime, status, dataVersion, biDate)
                .from(jhsCommodityStock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default JhsCommodityStock selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, commodityId, commodityStandard, num, createTime, updateTime, lastStorageTime, status, dataVersion, biDate)
                .from(jhsCommodityStock)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodityStock record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStock)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityStandard).equalTo(record::getCommodityStandard)
                .set(num).equalTo(record::getNum)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(lastStorageTime).equalTo(record::getLastStorageTime)
                .set(status).equalTo(record::getStatus)
                .set(dataVersion).equalTo(record::getDataVersion)
                .set(biDate).equalTo(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodityStock record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStock)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityStandard).equalToWhenPresent(record::getCommodityStandard)
                .set(num).equalToWhenPresent(record::getNum)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(lastStorageTime).equalToWhenPresent(record::getLastStorageTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(dataVersion).equalToWhenPresent(record::getDataVersion)
                .set(biDate).equalToWhenPresent(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default int updateByPrimaryKey(JhsCommodityStock record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStock)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityStandard).equalTo(record::getCommodityStandard)
                .set(num).equalTo(record::getNum)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(lastStorageTime).equalTo(record::getLastStorageTime)
                .set(status).equalTo(record::getStatus)
                .set(dataVersion).equalTo(record::getDataVersion)
                .set(biDate).equalTo(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    default int updateByPrimaryKeySelective(JhsCommodityStock record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodityStock)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityStandard).equalToWhenPresent(record::getCommodityStandard)
                .set(num).equalToWhenPresent(record::getNum)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(lastStorageTime).equalToWhenPresent(record::getLastStorageTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(dataVersion).equalToWhenPresent(record::getDataVersion)
                .set(biDate).equalToWhenPresent(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}