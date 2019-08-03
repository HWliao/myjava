package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsTradeOrderChildDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsTradeOrderChild;
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
public interface IJhsTradeOrderChildAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsTradeOrderChild> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsTradeOrderChildResult")
    JhsTradeOrderChild selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsTradeOrderChildResult")
    List<JhsTradeOrderChild> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default Function<SelectStatementProvider, List<JhsTradeOrderChild>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsTradeOrderChildResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="ORDER_NO", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_ID", property="commodityId", jdbcType=JdbcType.INTEGER),
        @Result(column="COMMODITY_NAME", property="commodityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="TOTAL", property="total", jdbcType=JdbcType.DOUBLE),
        @Result(column="OFROM", property="ofrom", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="WORKER_ID", property="workerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="WORKER_NAME", property="workerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SELLER_ID", property="sellerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SELLER_NAME", property="sellerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SELLER_DEPT_ID", property="sellerDeptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SELLER_DEPT_NAME", property="sellerDeptName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUYER_DEPT_ID", property="buyerDeptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUYER_DEPT_NAME", property="buyerDeptName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTEGRAL", property="integral", jdbcType=JdbcType.INTEGER),
        @Result(column="STANDARD", property="standard", jdbcType=JdbcType.VARCHAR),
        @Result(column="RECIPIENTS", property="recipients", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUYER_TEL", property="buyerTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUYER_ADDRESS", property="buyerAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARKS", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="CITY", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="AREA", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="SHOP_ADDR", property="shopAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="POST_COMPANY", property="postCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="POST_NO", property="postNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAY_DATE", property="payDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELIVER_DATE", property="deliverDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELIVER_MSG", property="deliverMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="RECEIPT_DATE", property="receiptDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TAKE_TYPE", property="takeType", jdbcType=JdbcType.INTEGER),
        @Result(column="IS_CREATE_HAPPY", property="isCreateHappy", jdbcType=JdbcType.CHAR),
        @Result(column="PAY_METHOD", property="payMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICTTEXT", property="dicttext", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRINT_DATE", property="printDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PAYMENT_DATE", property="paymentDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STOP_TRADE_DATE", property="stopTradeDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="REIMBURSEMENT_ID", property="reimbursementId", jdbcType=JdbcType.INTEGER),
        @Result(column="BI_DATE", property="biDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<JhsTradeOrderChild> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsTradeOrderChild);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsTradeOrderChild);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsTradeOrderChild)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default int insert(JhsTradeOrderChild record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsTradeOrderChild)
                .map(parentId).toProperty("parentId")
                .map(orderNo).toProperty("orderNo")
                .map(type).toProperty("type")
                .map(commodityId).toProperty("commodityId")
                .map(commodityName).toProperty("commodityName")
                .map(price).toProperty("price")
                .map(count).toProperty("count")
                .map(total).toProperty("total")
                .map(ofrom).toProperty("ofrom")
                .map(status).toProperty("status")
                .map(workerId).toProperty("workerId")
                .map(workerName).toProperty("workerName")
                .map(createDate).toProperty("createDate")
                .map(sellerId).toProperty("sellerId")
                .map(sellerName).toProperty("sellerName")
                .map(sellerDeptId).toProperty("sellerDeptId")
                .map(sellerDeptName).toProperty("sellerDeptName")
                .map(buyerDeptId).toProperty("buyerDeptId")
                .map(buyerDeptName).toProperty("buyerDeptName")
                .map(integral).toProperty("integral")
                .map(standard).toProperty("standard")
                .map(recipients).toProperty("recipients")
                .map(buyerTel).toProperty("buyerTel")
                .map(buyerAddress).toProperty("buyerAddress")
                .map(remarks).toProperty("remarks")
                .map(province).toProperty("province")
                .map(city).toProperty("city")
                .map(area).toProperty("area")
                .map(shopAddr).toProperty("shopAddr")
                .map(postCompany).toProperty("postCompany")
                .map(postNo).toProperty("postNo")
                .map(payDate).toProperty("payDate")
                .map(deliverDate).toProperty("deliverDate")
                .map(deliverMsg).toProperty("deliverMsg")
                .map(receiptDate).toProperty("receiptDate")
                .map(takeType).toProperty("takeType")
                .map(isCreateHappy).toProperty("isCreateHappy")
                .map(payMethod).toProperty("payMethod")
                .map(dicttext).toProperty("dicttext")
                .map(printDate).toProperty("printDate")
                .map(paymentDate).toProperty("paymentDate")
                .map(stopTradeDate).toProperty("stopTradeDate")
                .map(dataVersion).toProperty("dataVersion")
                .map(reimbursementId).toProperty("reimbursementId")
                .map(biDate).toProperty("biDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default int insertSelective(JhsTradeOrderChild record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsTradeOrderChild)
                .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
                .map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(commodityId).toPropertyWhenPresent("commodityId", record::getCommodityId)
                .map(commodityName).toPropertyWhenPresent("commodityName", record::getCommodityName)
                .map(price).toPropertyWhenPresent("price", record::getPrice)
                .map(count).toPropertyWhenPresent("count", record::getCount)
                .map(total).toPropertyWhenPresent("total", record::getTotal)
                .map(ofrom).toPropertyWhenPresent("ofrom", record::getOfrom)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(workerId).toPropertyWhenPresent("workerId", record::getWorkerId)
                .map(workerName).toPropertyWhenPresent("workerName", record::getWorkerName)
                .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
                .map(sellerId).toPropertyWhenPresent("sellerId", record::getSellerId)
                .map(sellerName).toPropertyWhenPresent("sellerName", record::getSellerName)
                .map(sellerDeptId).toPropertyWhenPresent("sellerDeptId", record::getSellerDeptId)
                .map(sellerDeptName).toPropertyWhenPresent("sellerDeptName", record::getSellerDeptName)
                .map(buyerDeptId).toPropertyWhenPresent("buyerDeptId", record::getBuyerDeptId)
                .map(buyerDeptName).toPropertyWhenPresent("buyerDeptName", record::getBuyerDeptName)
                .map(integral).toPropertyWhenPresent("integral", record::getIntegral)
                .map(standard).toPropertyWhenPresent("standard", record::getStandard)
                .map(recipients).toPropertyWhenPresent("recipients", record::getRecipients)
                .map(buyerTel).toPropertyWhenPresent("buyerTel", record::getBuyerTel)
                .map(buyerAddress).toPropertyWhenPresent("buyerAddress", record::getBuyerAddress)
                .map(remarks).toPropertyWhenPresent("remarks", record::getRemarks)
                .map(province).toPropertyWhenPresent("province", record::getProvince)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(area).toPropertyWhenPresent("area", record::getArea)
                .map(shopAddr).toPropertyWhenPresent("shopAddr", record::getShopAddr)
                .map(postCompany).toPropertyWhenPresent("postCompany", record::getPostCompany)
                .map(postNo).toPropertyWhenPresent("postNo", record::getPostNo)
                .map(payDate).toPropertyWhenPresent("payDate", record::getPayDate)
                .map(deliverDate).toPropertyWhenPresent("deliverDate", record::getDeliverDate)
                .map(deliverMsg).toPropertyWhenPresent("deliverMsg", record::getDeliverMsg)
                .map(receiptDate).toPropertyWhenPresent("receiptDate", record::getReceiptDate)
                .map(takeType).toPropertyWhenPresent("takeType", record::getTakeType)
                .map(isCreateHappy).toPropertyWhenPresent("isCreateHappy", record::getIsCreateHappy)
                .map(payMethod).toPropertyWhenPresent("payMethod", record::getPayMethod)
                .map(dicttext).toPropertyWhenPresent("dicttext", record::getDicttext)
                .map(printDate).toPropertyWhenPresent("printDate", record::getPrintDate)
                .map(paymentDate).toPropertyWhenPresent("paymentDate", record::getPaymentDate)
                .map(stopTradeDate).toPropertyWhenPresent("stopTradeDate", record::getStopTradeDate)
                .map(dataVersion).toPropertyWhenPresent("dataVersion", record::getDataVersion)
                .map(reimbursementId).toPropertyWhenPresent("reimbursementId", record::getReimbursementId)
                .map(biDate).toPropertyWhenPresent("biDate", record::getBiDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsTradeOrderChild>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, parentId, orderNo, type, commodityId, commodityName, price, count, total, ofrom, status, workerId, workerName, createDate, sellerId, sellerName, sellerDeptId, sellerDeptName, buyerDeptId, buyerDeptName, integral, standard, recipients, buyerTel, buyerAddress, remarks, province, city, area, shopAddr, postCompany, postNo, payDate, deliverDate, deliverMsg, receiptDate, takeType, isCreateHappy, payMethod, dicttext, printDate, paymentDate, stopTradeDate, dataVersion, reimbursementId, biDate)
                .from(jhsTradeOrderChild);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsTradeOrderChild>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, parentId, orderNo, type, commodityId, commodityName, price, count, total, ofrom, status, workerId, workerName, createDate, sellerId, sellerName, sellerDeptId, sellerDeptName, buyerDeptId, buyerDeptName, integral, standard, recipients, buyerTel, buyerAddress, remarks, province, city, area, shopAddr, postCompany, postNo, payDate, deliverDate, deliverMsg, receiptDate, takeType, isCreateHappy, payMethod, dicttext, printDate, paymentDate, stopTradeDate, dataVersion, reimbursementId, biDate)
                .from(jhsTradeOrderChild);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsTradeOrderChild>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, parentId, orderNo, type, commodityId, commodityName, price, count, total, ofrom, status, workerId, workerName, createDate, sellerId, sellerName, sellerDeptId, sellerDeptName, buyerDeptId, buyerDeptName, integral, standard, recipients, buyerTel, buyerAddress, remarks, province, city, area, shopAddr, postCompany, postNo, payDate, deliverDate, deliverMsg, receiptDate, takeType, isCreateHappy, payMethod, dicttext, printDate, paymentDate, stopTradeDate, dataVersion, reimbursementId, biDate)
                .from(jhsTradeOrderChild);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsTradeOrderChild>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, parentId, orderNo, type, commodityId, commodityName, price, count, total, ofrom, status, workerId, workerName, createDate, sellerId, sellerName, sellerDeptId, sellerDeptName, buyerDeptId, buyerDeptName, integral, standard, recipients, buyerTel, buyerAddress, remarks, province, city, area, shopAddr, postCompany, postNo, payDate, deliverDate, deliverMsg, receiptDate, takeType, isCreateHappy, payMethod, dicttext, printDate, paymentDate, stopTradeDate, dataVersion, reimbursementId, biDate)
                .from(jhsTradeOrderChild);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default JhsTradeOrderChild selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, parentId, orderNo, type, commodityId, commodityName, price, count, total, ofrom, status, workerId, workerName, createDate, sellerId, sellerName, sellerDeptId, sellerDeptName, buyerDeptId, buyerDeptName, integral, standard, recipients, buyerTel, buyerAddress, remarks, province, city, area, shopAddr, postCompany, postNo, payDate, deliverDate, deliverMsg, receiptDate, takeType, isCreateHappy, payMethod, dicttext, printDate, paymentDate, stopTradeDate, dataVersion, reimbursementId, biDate)
                .from(jhsTradeOrderChild)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsTradeOrderChild record) {
        return UpdateDSL.updateWithMapper(this::update, jhsTradeOrderChild)
                .set(parentId).equalTo(record::getParentId)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(type).equalTo(record::getType)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityName).equalTo(record::getCommodityName)
                .set(price).equalTo(record::getPrice)
                .set(count).equalTo(record::getCount)
                .set(total).equalTo(record::getTotal)
                .set(ofrom).equalTo(record::getOfrom)
                .set(status).equalTo(record::getStatus)
                .set(workerId).equalTo(record::getWorkerId)
                .set(workerName).equalTo(record::getWorkerName)
                .set(createDate).equalTo(record::getCreateDate)
                .set(sellerId).equalTo(record::getSellerId)
                .set(sellerName).equalTo(record::getSellerName)
                .set(sellerDeptId).equalTo(record::getSellerDeptId)
                .set(sellerDeptName).equalTo(record::getSellerDeptName)
                .set(buyerDeptId).equalTo(record::getBuyerDeptId)
                .set(buyerDeptName).equalTo(record::getBuyerDeptName)
                .set(integral).equalTo(record::getIntegral)
                .set(standard).equalTo(record::getStandard)
                .set(recipients).equalTo(record::getRecipients)
                .set(buyerTel).equalTo(record::getBuyerTel)
                .set(buyerAddress).equalTo(record::getBuyerAddress)
                .set(remarks).equalTo(record::getRemarks)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(area).equalTo(record::getArea)
                .set(shopAddr).equalTo(record::getShopAddr)
                .set(postCompany).equalTo(record::getPostCompany)
                .set(postNo).equalTo(record::getPostNo)
                .set(payDate).equalTo(record::getPayDate)
                .set(deliverDate).equalTo(record::getDeliverDate)
                .set(deliverMsg).equalTo(record::getDeliverMsg)
                .set(receiptDate).equalTo(record::getReceiptDate)
                .set(takeType).equalTo(record::getTakeType)
                .set(isCreateHappy).equalTo(record::getIsCreateHappy)
                .set(payMethod).equalTo(record::getPayMethod)
                .set(dicttext).equalTo(record::getDicttext)
                .set(printDate).equalTo(record::getPrintDate)
                .set(paymentDate).equalTo(record::getPaymentDate)
                .set(stopTradeDate).equalTo(record::getStopTradeDate)
                .set(dataVersion).equalTo(record::getDataVersion)
                .set(reimbursementId).equalTo(record::getReimbursementId)
                .set(biDate).equalTo(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsTradeOrderChild record) {
        return UpdateDSL.updateWithMapper(this::update, jhsTradeOrderChild)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(type).equalToWhenPresent(record::getType)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityName).equalToWhenPresent(record::getCommodityName)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(count).equalToWhenPresent(record::getCount)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(ofrom).equalToWhenPresent(record::getOfrom)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(workerId).equalToWhenPresent(record::getWorkerId)
                .set(workerName).equalToWhenPresent(record::getWorkerName)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(sellerId).equalToWhenPresent(record::getSellerId)
                .set(sellerName).equalToWhenPresent(record::getSellerName)
                .set(sellerDeptId).equalToWhenPresent(record::getSellerDeptId)
                .set(sellerDeptName).equalToWhenPresent(record::getSellerDeptName)
                .set(buyerDeptId).equalToWhenPresent(record::getBuyerDeptId)
                .set(buyerDeptName).equalToWhenPresent(record::getBuyerDeptName)
                .set(integral).equalToWhenPresent(record::getIntegral)
                .set(standard).equalToWhenPresent(record::getStandard)
                .set(recipients).equalToWhenPresent(record::getRecipients)
                .set(buyerTel).equalToWhenPresent(record::getBuyerTel)
                .set(buyerAddress).equalToWhenPresent(record::getBuyerAddress)
                .set(remarks).equalToWhenPresent(record::getRemarks)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(area).equalToWhenPresent(record::getArea)
                .set(shopAddr).equalToWhenPresent(record::getShopAddr)
                .set(postCompany).equalToWhenPresent(record::getPostCompany)
                .set(postNo).equalToWhenPresent(record::getPostNo)
                .set(payDate).equalToWhenPresent(record::getPayDate)
                .set(deliverDate).equalToWhenPresent(record::getDeliverDate)
                .set(deliverMsg).equalToWhenPresent(record::getDeliverMsg)
                .set(receiptDate).equalToWhenPresent(record::getReceiptDate)
                .set(takeType).equalToWhenPresent(record::getTakeType)
                .set(isCreateHappy).equalToWhenPresent(record::getIsCreateHappy)
                .set(payMethod).equalToWhenPresent(record::getPayMethod)
                .set(dicttext).equalToWhenPresent(record::getDicttext)
                .set(printDate).equalToWhenPresent(record::getPrintDate)
                .set(paymentDate).equalToWhenPresent(record::getPaymentDate)
                .set(stopTradeDate).equalToWhenPresent(record::getStopTradeDate)
                .set(dataVersion).equalToWhenPresent(record::getDataVersion)
                .set(reimbursementId).equalToWhenPresent(record::getReimbursementId)
                .set(biDate).equalToWhenPresent(record::getBiDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default int updateByPrimaryKey(JhsTradeOrderChild record) {
        return UpdateDSL.updateWithMapper(this::update, jhsTradeOrderChild)
                .set(parentId).equalTo(record::getParentId)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(type).equalTo(record::getType)
                .set(commodityId).equalTo(record::getCommodityId)
                .set(commodityName).equalTo(record::getCommodityName)
                .set(price).equalTo(record::getPrice)
                .set(count).equalTo(record::getCount)
                .set(total).equalTo(record::getTotal)
                .set(ofrom).equalTo(record::getOfrom)
                .set(status).equalTo(record::getStatus)
                .set(workerId).equalTo(record::getWorkerId)
                .set(workerName).equalTo(record::getWorkerName)
                .set(createDate).equalTo(record::getCreateDate)
                .set(sellerId).equalTo(record::getSellerId)
                .set(sellerName).equalTo(record::getSellerName)
                .set(sellerDeptId).equalTo(record::getSellerDeptId)
                .set(sellerDeptName).equalTo(record::getSellerDeptName)
                .set(buyerDeptId).equalTo(record::getBuyerDeptId)
                .set(buyerDeptName).equalTo(record::getBuyerDeptName)
                .set(integral).equalTo(record::getIntegral)
                .set(standard).equalTo(record::getStandard)
                .set(recipients).equalTo(record::getRecipients)
                .set(buyerTel).equalTo(record::getBuyerTel)
                .set(buyerAddress).equalTo(record::getBuyerAddress)
                .set(remarks).equalTo(record::getRemarks)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(area).equalTo(record::getArea)
                .set(shopAddr).equalTo(record::getShopAddr)
                .set(postCompany).equalTo(record::getPostCompany)
                .set(postNo).equalTo(record::getPostNo)
                .set(payDate).equalTo(record::getPayDate)
                .set(deliverDate).equalTo(record::getDeliverDate)
                .set(deliverMsg).equalTo(record::getDeliverMsg)
                .set(receiptDate).equalTo(record::getReceiptDate)
                .set(takeType).equalTo(record::getTakeType)
                .set(isCreateHappy).equalTo(record::getIsCreateHappy)
                .set(payMethod).equalTo(record::getPayMethod)
                .set(dicttext).equalTo(record::getDicttext)
                .set(printDate).equalTo(record::getPrintDate)
                .set(paymentDate).equalTo(record::getPaymentDate)
                .set(stopTradeDate).equalTo(record::getStopTradeDate)
                .set(dataVersion).equalTo(record::getDataVersion)
                .set(reimbursementId).equalTo(record::getReimbursementId)
                .set(biDate).equalTo(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    default int updateByPrimaryKeySelective(JhsTradeOrderChild record) {
        return UpdateDSL.updateWithMapper(this::update, jhsTradeOrderChild)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(type).equalToWhenPresent(record::getType)
                .set(commodityId).equalToWhenPresent(record::getCommodityId)
                .set(commodityName).equalToWhenPresent(record::getCommodityName)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(count).equalToWhenPresent(record::getCount)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(ofrom).equalToWhenPresent(record::getOfrom)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(workerId).equalToWhenPresent(record::getWorkerId)
                .set(workerName).equalToWhenPresent(record::getWorkerName)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(sellerId).equalToWhenPresent(record::getSellerId)
                .set(sellerName).equalToWhenPresent(record::getSellerName)
                .set(sellerDeptId).equalToWhenPresent(record::getSellerDeptId)
                .set(sellerDeptName).equalToWhenPresent(record::getSellerDeptName)
                .set(buyerDeptId).equalToWhenPresent(record::getBuyerDeptId)
                .set(buyerDeptName).equalToWhenPresent(record::getBuyerDeptName)
                .set(integral).equalToWhenPresent(record::getIntegral)
                .set(standard).equalToWhenPresent(record::getStandard)
                .set(recipients).equalToWhenPresent(record::getRecipients)
                .set(buyerTel).equalToWhenPresent(record::getBuyerTel)
                .set(buyerAddress).equalToWhenPresent(record::getBuyerAddress)
                .set(remarks).equalToWhenPresent(record::getRemarks)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(area).equalToWhenPresent(record::getArea)
                .set(shopAddr).equalToWhenPresent(record::getShopAddr)
                .set(postCompany).equalToWhenPresent(record::getPostCompany)
                .set(postNo).equalToWhenPresent(record::getPostNo)
                .set(payDate).equalToWhenPresent(record::getPayDate)
                .set(deliverDate).equalToWhenPresent(record::getDeliverDate)
                .set(deliverMsg).equalToWhenPresent(record::getDeliverMsg)
                .set(receiptDate).equalToWhenPresent(record::getReceiptDate)
                .set(takeType).equalToWhenPresent(record::getTakeType)
                .set(isCreateHappy).equalToWhenPresent(record::getIsCreateHappy)
                .set(payMethod).equalToWhenPresent(record::getPayMethod)
                .set(dicttext).equalToWhenPresent(record::getDicttext)
                .set(printDate).equalToWhenPresent(record::getPrintDate)
                .set(paymentDate).equalToWhenPresent(record::getPaymentDate)
                .set(stopTradeDate).equalToWhenPresent(record::getStopTradeDate)
                .set(dataVersion).equalToWhenPresent(record::getDataVersion)
                .set(reimbursementId).equalToWhenPresent(record::getReimbursementId)
                .set(biDate).equalToWhenPresent(record::getBiDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}