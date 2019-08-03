package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsCommodityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodity;
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
public interface IJhsCommodityAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsCommodity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityResult")
    JhsCommodity selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsCommodityResult")
    List<JhsCommodity> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default Function<SelectStatementProvider, List<JhsCommodity>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsCommodityResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="CATEGORY_ID", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="SHORT_NAME", property="shortName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHOTO_URL", property="photoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="STANDARD", property="standard", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODEL_NO", property="modelNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLOR", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="SIZE", property="size", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAY_METHOD", property="payMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUCTION_DATE", property="auctionDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRICE_START", property="priceStart", jdbcType=JdbcType.DOUBLE),
        @Result(column="PRICE_JUMP", property="priceJump", jdbcType=JdbcType.DOUBLE),
        @Result(column="MARKET_PRICE", property="marketPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="DELIVER_DATE", property="deliverDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELIVER_TYPE", property="deliverType", jdbcType=JdbcType.INTEGER),
        @Result(column="SELL_TYPE", property="sellType", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="INTEGRAL", property="integral", jdbcType=JdbcType.INTEGER),
        @Result(column="IS_VERIFY", property="isVerify", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="AUCTION_END_DATE", property="auctionEndDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STAFF_ID", property="staffId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STAFF_NAME", property="staffName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEPT_ID", property="deptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEPT_NAME", property="deptName", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_DOWN", property="isDown", jdbcType=JdbcType.INTEGER),
        @Result(column="IS_MANUAL_DOWN", property="isManualDown", jdbcType=JdbcType.INTEGER),
        @Result(column="IS_COMMISSION", property="isCommission", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMISSION_CM_NO", property="commissionCmNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMISSION_CM_NAME", property="commissionCmName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONTACT", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_REMARKS", property="checkRemarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE_MAX", property="priceMax", jdbcType=JdbcType.DOUBLE),
        @Result(column="IS_WORKER_PAY", property="isWorkerPay", jdbcType=JdbcType.TINYINT),
        @Result(column="SELLER_NAME", property="sellerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SELLER_WORKER_ID", property="sellerWorkerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SELLER_PHONE", property="sellerPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="SELLER_QQ", property="sellerQq", jdbcType=JdbcType.VARCHAR),
        @Result(column="GIVEN_CHANNEL", property="givenChannel", jdbcType=JdbcType.TINYINT),
        @Result(column="GIVEN_NAME", property="givenName", jdbcType=JdbcType.VARCHAR),
        @Result(column="GIVEN_WORKER_ID", property="givenWorkerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="GIVEN_PROJECT", property="givenProject", jdbcType=JdbcType.VARCHAR),
        @Result(column="GIVEN_CJ_NUMBER", property="givenCjNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="GIVEN_PROJECT_ID", property="givenProjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="SORT_NUM", property="sortNum", jdbcType=JdbcType.INTEGER),
        @Result(column="CHANNEL_HOUSING_RESOURCES", property="channelHousingResources", jdbcType=JdbcType.TINYINT),
        @Result(column="CHANNEL_HAPPY_OFFICE", property="channelHappyOffice", jdbcType=JdbcType.TINYINT),
        @Result(column="EXCHANGE_CONDITION", property="exchangeCondition", jdbcType=JdbcType.INTEGER),
        @Result(column="EXCHANGE_THIRD_LINK", property="exchangeThirdLink", jdbcType=JdbcType.VARCHAR)
    })
    List<JhsCommodity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsCommodity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default int insert(JhsCommodity record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodity)
                .map(title).toProperty("title")
                .map(categoryId).toProperty("categoryId")
                .map(shortName).toProperty("shortName")
                .map(photoUrl).toProperty("photoUrl")
                .map(count).toProperty("count")
                .map(standard).toProperty("standard")
                .map(modelNo).toProperty("modelNo")
                .map(color).toProperty("color")
                .map(size).toProperty("size")
                .map(payMethod).toProperty("payMethod")
                .map(auctionDate).toProperty("auctionDate")
                .map(priceStart).toProperty("priceStart")
                .map(priceJump).toProperty("priceJump")
                .map(marketPrice).toProperty("marketPrice")
                .map(price).toProperty("price")
                .map(deliverDate).toProperty("deliverDate")
                .map(deliverType).toProperty("deliverType")
                .map(sellType).toProperty("sellType")
                .map(status).toProperty("status")
                .map(integral).toProperty("integral")
                .map(isVerify).toProperty("isVerify")
                .map(createDate).toProperty("createDate")
                .map(auctionEndDate).toProperty("auctionEndDate")
                .map(staffId).toProperty("staffId")
                .map(staffName).toProperty("staffName")
                .map(deptId).toProperty("deptId")
                .map(deptName).toProperty("deptName")
                .map(isDown).toProperty("isDown")
                .map(isManualDown).toProperty("isManualDown")
                .map(isCommission).toProperty("isCommission")
                .map(commissionCmNo).toProperty("commissionCmNo")
                .map(commissionCmName).toProperty("commissionCmName")
                .map(contact).toProperty("contact")
                .map(checkRemarks).toProperty("checkRemarks")
                .map(priceMax).toProperty("priceMax")
                .map(isWorkerPay).toProperty("isWorkerPay")
                .map(sellerName).toProperty("sellerName")
                .map(sellerWorkerId).toProperty("sellerWorkerId")
                .map(sellerPhone).toProperty("sellerPhone")
                .map(sellerQq).toProperty("sellerQq")
                .map(givenChannel).toProperty("givenChannel")
                .map(givenName).toProperty("givenName")
                .map(givenWorkerId).toProperty("givenWorkerId")
                .map(givenProject).toProperty("givenProject")
                .map(givenCjNumber).toProperty("givenCjNumber")
                .map(givenProjectId).toProperty("givenProjectId")
                .map(sortNum).toProperty("sortNum")
                .map(channelHousingResources).toProperty("channelHousingResources")
                .map(channelHappyOffice).toProperty("channelHappyOffice")
                .map(exchangeCondition).toProperty("exchangeCondition")
                .map(exchangeThirdLink).toProperty("exchangeThirdLink")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default int insertSelective(JhsCommodity record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsCommodity)
                .map(title).toPropertyWhenPresent("title", record::getTitle)
                .map(categoryId).toPropertyWhenPresent("categoryId", record::getCategoryId)
                .map(shortName).toPropertyWhenPresent("shortName", record::getShortName)
                .map(photoUrl).toPropertyWhenPresent("photoUrl", record::getPhotoUrl)
                .map(count).toPropertyWhenPresent("count", record::getCount)
                .map(standard).toPropertyWhenPresent("standard", record::getStandard)
                .map(modelNo).toPropertyWhenPresent("modelNo", record::getModelNo)
                .map(color).toPropertyWhenPresent("color", record::getColor)
                .map(size).toPropertyWhenPresent("size", record::getSize)
                .map(payMethod).toPropertyWhenPresent("payMethod", record::getPayMethod)
                .map(auctionDate).toPropertyWhenPresent("auctionDate", record::getAuctionDate)
                .map(priceStart).toPropertyWhenPresent("priceStart", record::getPriceStart)
                .map(priceJump).toPropertyWhenPresent("priceJump", record::getPriceJump)
                .map(marketPrice).toPropertyWhenPresent("marketPrice", record::getMarketPrice)
                .map(price).toPropertyWhenPresent("price", record::getPrice)
                .map(deliverDate).toPropertyWhenPresent("deliverDate", record::getDeliverDate)
                .map(deliverType).toPropertyWhenPresent("deliverType", record::getDeliverType)
                .map(sellType).toPropertyWhenPresent("sellType", record::getSellType)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(integral).toPropertyWhenPresent("integral", record::getIntegral)
                .map(isVerify).toPropertyWhenPresent("isVerify", record::getIsVerify)
                .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
                .map(auctionEndDate).toPropertyWhenPresent("auctionEndDate", record::getAuctionEndDate)
                .map(staffId).toPropertyWhenPresent("staffId", record::getStaffId)
                .map(staffName).toPropertyWhenPresent("staffName", record::getStaffName)
                .map(deptId).toPropertyWhenPresent("deptId", record::getDeptId)
                .map(deptName).toPropertyWhenPresent("deptName", record::getDeptName)
                .map(isDown).toPropertyWhenPresent("isDown", record::getIsDown)
                .map(isManualDown).toPropertyWhenPresent("isManualDown", record::getIsManualDown)
                .map(isCommission).toPropertyWhenPresent("isCommission", record::getIsCommission)
                .map(commissionCmNo).toPropertyWhenPresent("commissionCmNo", record::getCommissionCmNo)
                .map(commissionCmName).toPropertyWhenPresent("commissionCmName", record::getCommissionCmName)
                .map(contact).toPropertyWhenPresent("contact", record::getContact)
                .map(checkRemarks).toPropertyWhenPresent("checkRemarks", record::getCheckRemarks)
                .map(priceMax).toPropertyWhenPresent("priceMax", record::getPriceMax)
                .map(isWorkerPay).toPropertyWhenPresent("isWorkerPay", record::getIsWorkerPay)
                .map(sellerName).toPropertyWhenPresent("sellerName", record::getSellerName)
                .map(sellerWorkerId).toPropertyWhenPresent("sellerWorkerId", record::getSellerWorkerId)
                .map(sellerPhone).toPropertyWhenPresent("sellerPhone", record::getSellerPhone)
                .map(sellerQq).toPropertyWhenPresent("sellerQq", record::getSellerQq)
                .map(givenChannel).toPropertyWhenPresent("givenChannel", record::getGivenChannel)
                .map(givenName).toPropertyWhenPresent("givenName", record::getGivenName)
                .map(givenWorkerId).toPropertyWhenPresent("givenWorkerId", record::getGivenWorkerId)
                .map(givenProject).toPropertyWhenPresent("givenProject", record::getGivenProject)
                .map(givenCjNumber).toPropertyWhenPresent("givenCjNumber", record::getGivenCjNumber)
                .map(givenProjectId).toPropertyWhenPresent("givenProjectId", record::getGivenProjectId)
                .map(sortNum).toPropertyWhenPresent("sortNum", record::getSortNum)
                .map(channelHousingResources).toPropertyWhenPresent("channelHousingResources", record::getChannelHousingResources)
                .map(channelHappyOffice).toPropertyWhenPresent("channelHappyOffice", record::getChannelHappyOffice)
                .map(exchangeCondition).toPropertyWhenPresent("exchangeCondition", record::getExchangeCondition)
                .map(exchangeThirdLink).toPropertyWhenPresent("exchangeThirdLink", record::getExchangeThirdLink)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodity>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, title, categoryId, shortName, photoUrl, count, standard, modelNo, color, size, payMethod, auctionDate, priceStart, priceJump, marketPrice, price, deliverDate, deliverType, sellType, status, integral, isVerify, createDate, auctionEndDate, staffId, staffName, deptId, deptName, isDown, isManualDown, isCommission, commissionCmNo, commissionCmName, contact, checkRemarks, priceMax, isWorkerPay, sellerName, sellerWorkerId, sellerPhone, sellerQq, givenChannel, givenName, givenWorkerId, givenProject, givenCjNumber, givenProjectId, sortNum, channelHousingResources, channelHappyOffice, exchangeCondition, exchangeThirdLink)
                .from(jhsCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, title, categoryId, shortName, photoUrl, count, standard, modelNo, color, size, payMethod, auctionDate, priceStart, priceJump, marketPrice, price, deliverDate, deliverType, sellType, status, integral, isVerify, createDate, auctionEndDate, staffId, staffName, deptId, deptName, isDown, isManualDown, isCommission, commissionCmNo, commissionCmName, contact, checkRemarks, priceMax, isWorkerPay, sellerName, sellerWorkerId, sellerPhone, sellerQq, givenChannel, givenName, givenWorkerId, givenProject, givenCjNumber, givenProjectId, sortNum, channelHousingResources, channelHappyOffice, exchangeCondition, exchangeThirdLink)
                .from(jhsCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodity>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, title, categoryId, shortName, photoUrl, count, standard, modelNo, color, size, payMethod, auctionDate, priceStart, priceJump, marketPrice, price, deliverDate, deliverType, sellType, status, integral, isVerify, createDate, auctionEndDate, staffId, staffName, deptId, deptName, isDown, isManualDown, isCommission, commissionCmNo, commissionCmName, contact, checkRemarks, priceMax, isWorkerPay, sellerName, sellerWorkerId, sellerPhone, sellerQq, givenChannel, givenName, givenWorkerId, givenProject, givenCjNumber, givenProjectId, sortNum, channelHousingResources, channelHappyOffice, exchangeCondition, exchangeThirdLink)
                .from(jhsCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsCommodity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, title, categoryId, shortName, photoUrl, count, standard, modelNo, color, size, payMethod, auctionDate, priceStart, priceJump, marketPrice, price, deliverDate, deliverType, sellType, status, integral, isVerify, createDate, auctionEndDate, staffId, staffName, deptId, deptName, isDown, isManualDown, isCommission, commissionCmNo, commissionCmName, contact, checkRemarks, priceMax, isWorkerPay, sellerName, sellerWorkerId, sellerPhone, sellerQq, givenChannel, givenName, givenWorkerId, givenProject, givenCjNumber, givenProjectId, sortNum, channelHousingResources, channelHappyOffice, exchangeCondition, exchangeThirdLink)
                .from(jhsCommodity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default JhsCommodity selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, title, categoryId, shortName, photoUrl, count, standard, modelNo, color, size, payMethod, auctionDate, priceStart, priceJump, marketPrice, price, deliverDate, deliverType, sellType, status, integral, isVerify, createDate, auctionEndDate, staffId, staffName, deptId, deptName, isDown, isManualDown, isCommission, commissionCmNo, commissionCmName, contact, checkRemarks, priceMax, isWorkerPay, sellerName, sellerWorkerId, sellerPhone, sellerQq, givenChannel, givenName, givenWorkerId, givenProject, givenCjNumber, givenProjectId, sortNum, channelHousingResources, channelHappyOffice, exchangeCondition, exchangeThirdLink)
                .from(jhsCommodity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodity)
                .set(title).equalTo(record::getTitle)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(shortName).equalTo(record::getShortName)
                .set(photoUrl).equalTo(record::getPhotoUrl)
                .set(count).equalTo(record::getCount)
                .set(standard).equalTo(record::getStandard)
                .set(modelNo).equalTo(record::getModelNo)
                .set(color).equalTo(record::getColor)
                .set(size).equalTo(record::getSize)
                .set(payMethod).equalTo(record::getPayMethod)
                .set(auctionDate).equalTo(record::getAuctionDate)
                .set(priceStart).equalTo(record::getPriceStart)
                .set(priceJump).equalTo(record::getPriceJump)
                .set(marketPrice).equalTo(record::getMarketPrice)
                .set(price).equalTo(record::getPrice)
                .set(deliverDate).equalTo(record::getDeliverDate)
                .set(deliverType).equalTo(record::getDeliverType)
                .set(sellType).equalTo(record::getSellType)
                .set(status).equalTo(record::getStatus)
                .set(integral).equalTo(record::getIntegral)
                .set(isVerify).equalTo(record::getIsVerify)
                .set(createDate).equalTo(record::getCreateDate)
                .set(auctionEndDate).equalTo(record::getAuctionEndDate)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(deptId).equalTo(record::getDeptId)
                .set(deptName).equalTo(record::getDeptName)
                .set(isDown).equalTo(record::getIsDown)
                .set(isManualDown).equalTo(record::getIsManualDown)
                .set(isCommission).equalTo(record::getIsCommission)
                .set(commissionCmNo).equalTo(record::getCommissionCmNo)
                .set(commissionCmName).equalTo(record::getCommissionCmName)
                .set(contact).equalTo(record::getContact)
                .set(checkRemarks).equalTo(record::getCheckRemarks)
                .set(priceMax).equalTo(record::getPriceMax)
                .set(isWorkerPay).equalTo(record::getIsWorkerPay)
                .set(sellerName).equalTo(record::getSellerName)
                .set(sellerWorkerId).equalTo(record::getSellerWorkerId)
                .set(sellerPhone).equalTo(record::getSellerPhone)
                .set(sellerQq).equalTo(record::getSellerQq)
                .set(givenChannel).equalTo(record::getGivenChannel)
                .set(givenName).equalTo(record::getGivenName)
                .set(givenWorkerId).equalTo(record::getGivenWorkerId)
                .set(givenProject).equalTo(record::getGivenProject)
                .set(givenCjNumber).equalTo(record::getGivenCjNumber)
                .set(givenProjectId).equalTo(record::getGivenProjectId)
                .set(sortNum).equalTo(record::getSortNum)
                .set(channelHousingResources).equalTo(record::getChannelHousingResources)
                .set(channelHappyOffice).equalTo(record::getChannelHappyOffice)
                .set(exchangeCondition).equalTo(record::getExchangeCondition)
                .set(exchangeThirdLink).equalTo(record::getExchangeThirdLink);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodity)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(shortName).equalToWhenPresent(record::getShortName)
                .set(photoUrl).equalToWhenPresent(record::getPhotoUrl)
                .set(count).equalToWhenPresent(record::getCount)
                .set(standard).equalToWhenPresent(record::getStandard)
                .set(modelNo).equalToWhenPresent(record::getModelNo)
                .set(color).equalToWhenPresent(record::getColor)
                .set(size).equalToWhenPresent(record::getSize)
                .set(payMethod).equalToWhenPresent(record::getPayMethod)
                .set(auctionDate).equalToWhenPresent(record::getAuctionDate)
                .set(priceStart).equalToWhenPresent(record::getPriceStart)
                .set(priceJump).equalToWhenPresent(record::getPriceJump)
                .set(marketPrice).equalToWhenPresent(record::getMarketPrice)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(deliverDate).equalToWhenPresent(record::getDeliverDate)
                .set(deliverType).equalToWhenPresent(record::getDeliverType)
                .set(sellType).equalToWhenPresent(record::getSellType)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(integral).equalToWhenPresent(record::getIntegral)
                .set(isVerify).equalToWhenPresent(record::getIsVerify)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(auctionEndDate).equalToWhenPresent(record::getAuctionEndDate)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(deptId).equalToWhenPresent(record::getDeptId)
                .set(deptName).equalToWhenPresent(record::getDeptName)
                .set(isDown).equalToWhenPresent(record::getIsDown)
                .set(isManualDown).equalToWhenPresent(record::getIsManualDown)
                .set(isCommission).equalToWhenPresent(record::getIsCommission)
                .set(commissionCmNo).equalToWhenPresent(record::getCommissionCmNo)
                .set(commissionCmName).equalToWhenPresent(record::getCommissionCmName)
                .set(contact).equalToWhenPresent(record::getContact)
                .set(checkRemarks).equalToWhenPresent(record::getCheckRemarks)
                .set(priceMax).equalToWhenPresent(record::getPriceMax)
                .set(isWorkerPay).equalToWhenPresent(record::getIsWorkerPay)
                .set(sellerName).equalToWhenPresent(record::getSellerName)
                .set(sellerWorkerId).equalToWhenPresent(record::getSellerWorkerId)
                .set(sellerPhone).equalToWhenPresent(record::getSellerPhone)
                .set(sellerQq).equalToWhenPresent(record::getSellerQq)
                .set(givenChannel).equalToWhenPresent(record::getGivenChannel)
                .set(givenName).equalToWhenPresent(record::getGivenName)
                .set(givenWorkerId).equalToWhenPresent(record::getGivenWorkerId)
                .set(givenProject).equalToWhenPresent(record::getGivenProject)
                .set(givenCjNumber).equalToWhenPresent(record::getGivenCjNumber)
                .set(givenProjectId).equalToWhenPresent(record::getGivenProjectId)
                .set(sortNum).equalToWhenPresent(record::getSortNum)
                .set(channelHousingResources).equalToWhenPresent(record::getChannelHousingResources)
                .set(channelHappyOffice).equalToWhenPresent(record::getChannelHappyOffice)
                .set(exchangeCondition).equalToWhenPresent(record::getExchangeCondition)
                .set(exchangeThirdLink).equalToWhenPresent(record::getExchangeThirdLink);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default int updateByPrimaryKey(JhsCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodity)
                .set(title).equalTo(record::getTitle)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(shortName).equalTo(record::getShortName)
                .set(photoUrl).equalTo(record::getPhotoUrl)
                .set(count).equalTo(record::getCount)
                .set(standard).equalTo(record::getStandard)
                .set(modelNo).equalTo(record::getModelNo)
                .set(color).equalTo(record::getColor)
                .set(size).equalTo(record::getSize)
                .set(payMethod).equalTo(record::getPayMethod)
                .set(auctionDate).equalTo(record::getAuctionDate)
                .set(priceStart).equalTo(record::getPriceStart)
                .set(priceJump).equalTo(record::getPriceJump)
                .set(marketPrice).equalTo(record::getMarketPrice)
                .set(price).equalTo(record::getPrice)
                .set(deliverDate).equalTo(record::getDeliverDate)
                .set(deliverType).equalTo(record::getDeliverType)
                .set(sellType).equalTo(record::getSellType)
                .set(status).equalTo(record::getStatus)
                .set(integral).equalTo(record::getIntegral)
                .set(isVerify).equalTo(record::getIsVerify)
                .set(createDate).equalTo(record::getCreateDate)
                .set(auctionEndDate).equalTo(record::getAuctionEndDate)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(deptId).equalTo(record::getDeptId)
                .set(deptName).equalTo(record::getDeptName)
                .set(isDown).equalTo(record::getIsDown)
                .set(isManualDown).equalTo(record::getIsManualDown)
                .set(isCommission).equalTo(record::getIsCommission)
                .set(commissionCmNo).equalTo(record::getCommissionCmNo)
                .set(commissionCmName).equalTo(record::getCommissionCmName)
                .set(contact).equalTo(record::getContact)
                .set(checkRemarks).equalTo(record::getCheckRemarks)
                .set(priceMax).equalTo(record::getPriceMax)
                .set(isWorkerPay).equalTo(record::getIsWorkerPay)
                .set(sellerName).equalTo(record::getSellerName)
                .set(sellerWorkerId).equalTo(record::getSellerWorkerId)
                .set(sellerPhone).equalTo(record::getSellerPhone)
                .set(sellerQq).equalTo(record::getSellerQq)
                .set(givenChannel).equalTo(record::getGivenChannel)
                .set(givenName).equalTo(record::getGivenName)
                .set(givenWorkerId).equalTo(record::getGivenWorkerId)
                .set(givenProject).equalTo(record::getGivenProject)
                .set(givenCjNumber).equalTo(record::getGivenCjNumber)
                .set(givenProjectId).equalTo(record::getGivenProjectId)
                .set(sortNum).equalTo(record::getSortNum)
                .set(channelHousingResources).equalTo(record::getChannelHousingResources)
                .set(channelHappyOffice).equalTo(record::getChannelHappyOffice)
                .set(exchangeCondition).equalTo(record::getExchangeCondition)
                .set(exchangeThirdLink).equalTo(record::getExchangeThirdLink)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    default int updateByPrimaryKeySelective(JhsCommodity record) {
        return UpdateDSL.updateWithMapper(this::update, jhsCommodity)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(shortName).equalToWhenPresent(record::getShortName)
                .set(photoUrl).equalToWhenPresent(record::getPhotoUrl)
                .set(count).equalToWhenPresent(record::getCount)
                .set(standard).equalToWhenPresent(record::getStandard)
                .set(modelNo).equalToWhenPresent(record::getModelNo)
                .set(color).equalToWhenPresent(record::getColor)
                .set(size).equalToWhenPresent(record::getSize)
                .set(payMethod).equalToWhenPresent(record::getPayMethod)
                .set(auctionDate).equalToWhenPresent(record::getAuctionDate)
                .set(priceStart).equalToWhenPresent(record::getPriceStart)
                .set(priceJump).equalToWhenPresent(record::getPriceJump)
                .set(marketPrice).equalToWhenPresent(record::getMarketPrice)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(deliverDate).equalToWhenPresent(record::getDeliverDate)
                .set(deliverType).equalToWhenPresent(record::getDeliverType)
                .set(sellType).equalToWhenPresent(record::getSellType)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(integral).equalToWhenPresent(record::getIntegral)
                .set(isVerify).equalToWhenPresent(record::getIsVerify)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(auctionEndDate).equalToWhenPresent(record::getAuctionEndDate)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(deptId).equalToWhenPresent(record::getDeptId)
                .set(deptName).equalToWhenPresent(record::getDeptName)
                .set(isDown).equalToWhenPresent(record::getIsDown)
                .set(isManualDown).equalToWhenPresent(record::getIsManualDown)
                .set(isCommission).equalToWhenPresent(record::getIsCommission)
                .set(commissionCmNo).equalToWhenPresent(record::getCommissionCmNo)
                .set(commissionCmName).equalToWhenPresent(record::getCommissionCmName)
                .set(contact).equalToWhenPresent(record::getContact)
                .set(checkRemarks).equalToWhenPresent(record::getCheckRemarks)
                .set(priceMax).equalToWhenPresent(record::getPriceMax)
                .set(isWorkerPay).equalToWhenPresent(record::getIsWorkerPay)
                .set(sellerName).equalToWhenPresent(record::getSellerName)
                .set(sellerWorkerId).equalToWhenPresent(record::getSellerWorkerId)
                .set(sellerPhone).equalToWhenPresent(record::getSellerPhone)
                .set(sellerQq).equalToWhenPresent(record::getSellerQq)
                .set(givenChannel).equalToWhenPresent(record::getGivenChannel)
                .set(givenName).equalToWhenPresent(record::getGivenName)
                .set(givenWorkerId).equalToWhenPresent(record::getGivenWorkerId)
                .set(givenProject).equalToWhenPresent(record::getGivenProject)
                .set(givenCjNumber).equalToWhenPresent(record::getGivenCjNumber)
                .set(givenProjectId).equalToWhenPresent(record::getGivenProjectId)
                .set(sortNum).equalToWhenPresent(record::getSortNum)
                .set(channelHousingResources).equalToWhenPresent(record::getChannelHousingResources)
                .set(channelHappyOffice).equalToWhenPresent(record::getChannelHappyOffice)
                .set(exchangeCondition).equalToWhenPresent(record::getExchangeCondition)
                .set(exchangeThirdLink).equalToWhenPresent(record::getExchangeThirdLink)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}