package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsAuctionRecordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsAuctionRecord;
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
public interface IJhsAuctionRecordAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsAuctionRecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsAuctionRecordResult")
    JhsAuctionRecord selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsAuctionRecordResult")
    List<JhsAuctionRecord> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default Function<SelectStatementProvider, List<JhsAuctionRecord>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsAuctionRecordResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="COMMODITY_ID", property="commodityId", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_TITLE", property="commodityTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="STAFF_ID", property="staffId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STAFF_NAME", property="staffName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="PRE_PRICE", property="prePrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsAuctionRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsAuctionRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsAuctionRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsAuctionRecord)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default int insert(JhsAuctionRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsAuctionRecord)
                .map(commodityId).toProperty("commodityId")
                .map(commodityTitle).toProperty("commodityTitle")
                .map(staffId).toProperty("staffId")
                .map(staffName).toProperty("staffName")
                .map(price).toProperty("price")
                .map(prePrice).toProperty("prePrice")
                .map(createDate).toProperty("createDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default int insertSelective(JhsAuctionRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsAuctionRecord)
                .map(commodityId).toPropertyWhenPresent("commodityId", record::getCommodityId)
                .map(commodityTitle).toPropertyWhenPresent("commodityTitle", record::getCommodityTitle)
                .map(staffId).toPropertyWhenPresent("staffId", record::getStaffId)
                .map(staffName).toPropertyWhenPresent("staffName", record::getStaffName)
                .map(price).toPropertyWhenPresent("price", record::getPrice)
                .map(prePrice).toPropertyWhenPresent("prePrice", record::getPrePrice)
                .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionRecord>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, commodityTitle, staffId, staffName, price, prePrice, createDate)
                .from(jhsAuctionRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionRecord>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, commodityId, commodityTitle, staffId, staffName, price, prePrice, createDate)
                .from(jhsAuctionRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionRecord>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, commodityId, commodityTitle, staffId, staffName, price, prePrice, createDate)
                .from(jhsAuctionRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsAuctionRecord>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, commodityId, commodityTitle, staffId, staffName, price, prePrice, createDate)
                .from(jhsAuctionRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default JhsAuctionRecord selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, commodityId, commodityTitle, staffId, staffName, price, prePrice, createDate)
                .from(jhsAuctionRecord)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsAuctionRecord record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionRecord)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityTitle).equalTo(record::getCommodityTitle)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(price).equalTo(record::getPrice)
                .set(prePrice).equalTo(record::getPrePrice)
                .set(createDate).equalTo(record::getCreateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsAuctionRecord record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionRecord)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityTitle).equalToWhenPresent(record::getCommodityTitle)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(prePrice).equalToWhenPresent(record::getPrePrice)
                .set(createDate).equalToWhenPresent(record::getCreateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default int updateByPrimaryKey(JhsAuctionRecord record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionRecord)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityTitle).equalTo(record::getCommodityTitle)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(price).equalTo(record::getPrice)
                .set(prePrice).equalTo(record::getPrePrice)
                .set(createDate).equalTo(record::getCreateDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    default int updateByPrimaryKeySelective(JhsAuctionRecord record) {
        return UpdateDSL.updateWithMapper(this::update, jhsAuctionRecord)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityTitle).equalToWhenPresent(record::getCommodityTitle)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(prePrice).equalToWhenPresent(record::getPrePrice)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}