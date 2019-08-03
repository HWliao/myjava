package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsExchangeSizeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsExchangeSize;
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
public interface IJhsExchangeSizeAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsExchangeSize> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsExchangeSizeResult")
    JhsExchangeSize selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsExchangeSizeResult")
    List<JhsExchangeSize> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default Function<SelectStatementProvider, List<JhsExchangeSize>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsExchangeSizeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ORDER_TYPE", property="orderType", jdbcType=JdbcType.INTEGER),
        @Result(column="ORDER_ID", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_ID", property="commodityId", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_NAME", property="commodityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OLD_SIZE", property="oldSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="NEW_SIZE", property="newSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_DATE", property="updateDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsExchangeSize> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsExchangeSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsExchangeSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsExchangeSize)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default int insert(JhsExchangeSize record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsExchangeSize)
                .map(orderType).toProperty("orderType")
                .map(orderId).toProperty("orderId")
                .map(commodityId).toProperty("commodityId")
                .map(commodityName).toProperty("commodityName")
                .map(oldSize).toProperty("oldSize")
                .map(newSize).toProperty("newSize")
                .map(count).toProperty("count")
                .map(createDate).toProperty("createDate")
                .map(updateDate).toProperty("updateDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default int insertSelective(JhsExchangeSize record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsExchangeSize)
                .map(orderType).toPropertyWhenPresent("orderType", record::getOrderType)
                .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
                .map(commodityId).toPropertyWhenPresent("commodityId", record::getCommodityId)
                .map(commodityName).toPropertyWhenPresent("commodityName", record::getCommodityName)
                .map(oldSize).toPropertyWhenPresent("oldSize", record::getOldSize)
                .map(newSize).toPropertyWhenPresent("newSize", record::getNewSize)
                .map(count).toPropertyWhenPresent("count", record::getCount)
                .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
                .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsExchangeSize>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, orderType, orderId, commodityId, commodityName, oldSize, newSize, count, createDate, updateDate)
                .from(jhsExchangeSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsExchangeSize>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderType, orderId, commodityId, commodityName, oldSize, newSize, count, createDate, updateDate)
                .from(jhsExchangeSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsExchangeSize>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, orderType, orderId, commodityId, commodityName, oldSize, newSize, count, createDate, updateDate)
                .from(jhsExchangeSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsExchangeSize>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderType, orderId, commodityId, commodityName, oldSize, newSize, count, createDate, updateDate)
                .from(jhsExchangeSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default JhsExchangeSize selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, orderType, orderId, commodityId, commodityName, oldSize, newSize, count, createDate, updateDate)
                .from(jhsExchangeSize)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsExchangeSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsExchangeSize)
                .set(orderType).equalTo(record::getOrderType)
                .set(orderId).equalTo(record::getOrderId)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityName).equalTo(record::getCommodityName)
                .set(oldSize).equalTo(record::getOldSize)
                .set(newSize).equalTo(record::getNewSize)
                .set(count).equalTo(record::getCount)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateDate).equalTo(record::getUpdateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsExchangeSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsExchangeSize)
                .set(orderType).equalToWhenPresent(record::getOrderType)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityName).equalToWhenPresent(record::getCommodityName)
                .set(oldSize).equalToWhenPresent(record::getOldSize)
                .set(newSize).equalToWhenPresent(record::getNewSize)
                .set(count).equalToWhenPresent(record::getCount)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default int updateByPrimaryKey(JhsExchangeSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsExchangeSize)
                .set(orderType).equalTo(record::getOrderType)
                .set(orderId).equalTo(record::getOrderId)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityName).equalTo(record::getCommodityName)
                .set(oldSize).equalTo(record::getOldSize)
                .set(newSize).equalTo(record::getNewSize)
                .set(count).equalTo(record::getCount)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateDate).equalTo(record::getUpdateDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    default int updateByPrimaryKeySelective(JhsExchangeSize record) {
        return UpdateDSL.updateWithMapper(this::update, jhsExchangeSize)
                .set(orderType).equalToWhenPresent(record::getOrderType)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityName).equalToWhenPresent(record::getCommodityName)
                .set(oldSize).equalToWhenPresent(record::getOldSize)
                .set(newSize).equalToWhenPresent(record::getNewSize)
                .set(count).equalToWhenPresent(record::getCount)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}