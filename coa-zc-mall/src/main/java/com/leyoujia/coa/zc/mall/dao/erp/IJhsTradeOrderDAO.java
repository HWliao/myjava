package com.leyoujia.coa.zc.mall.dao.erp;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsTradeOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;

import java.util.List;

/**
 * JhsTradeOrder订单mapper层接口
 *
 * @author l
 * @since 2019/7/29
 */
public interface IJhsTradeOrderDAO {
  /**
   * 根据WhereClauseProvider分页查询订单
   *
   * @param whereClause 查询条件
   * @param limit       条数限制
   * @param offset      偏移位置
   * @return 订单列表
   * @Results可重用 例：@ResultMap("order")
   */
  @Select({
    "select *",
    "from JHS_TRADE_ORDER",
    "${whereClauseProvider.whereClause}",
    "LIMIT #{limit,jdbcType=INTEGER} OFFSET #{offset,jdbcType=INTEGER}"
  })
  @Results(id = "order", value = {
    @Result(property = "id", column = "id", id = true),
    @Result(property = "orderNo", column = "ORDER_NO"),
    @Result(property = "commodityId", column = "COMMODITY_ID"),
    @Result(property = "commodityName", column = "COMMODITY_NAME"),
    @Result(property = "workerId", column = "WORKER_ID"),
    @Result(property = "workerName", column = "WORKER_NAME"),
    @Result(property = "createDate", column = "CREATE_DATE"),
    @Result(property = "sellerId", column = "SELLER_ID"),
    @Result(property = "sellerName", column = "SELLER_NAME"),
    @Result(property = "sellerDeptId", column = "SELLER_DEPT_ID"),
    @Result(property = "sellerDeptName", column = "SELLER_DEPT_NAME"),
    @Result(property = "buyerDeptId", column = "BUYER_DEPT_ID"),
    @Result(property = "buyerDeptName", column = "BUYER_DEPT_NAME"),
    @Result(property = "buyerTel", column = "BUYER_TEL"),
    @Result(property = "buyerAddress", column = "BUYER_ADDRESS"),
    @Result(property = "shopAddr", column = "SHOP_ADDR"),
    @Result(property = "postCompany", column = "POST_COMPANY"),
    @Result(property = "postNo", column = "POST_NO"),
    @Result(property = "payDate", column = "PAY_DATE"),
    @Result(property = "deliverDate", column = "DELIVER_DATE"),
    @Result(property = "deliverMsg", column = "DELIVER_MSG"),
    @Result(property = "receiptDate", column = "RECEIPT_DATE"),
    @Result(property = "takeType", column = "TAKE_TYPE"),
    @Result(property = "isCreateHappy", column = "IS_CREATE_HAPPY"),
    @Result(property = "payMethod", column = "PAY_METHOD"),
    @Result(property = "printDate", column = "PRINT_DATE"),
    @Result(property = "paymentDate", column = "PAYMENT_DATE"),
    @Result(property = "stopTradeDate", column = "STOP_TRADE_DATE"),
    @Result(property = "dataVersion", column = "DATA_VERSION"),
    @Result(property = "reimbursementId", column = "REIMBURSEMENT_ID"),
    @Result(property = "refundReason", column = "REFUND_REASON"),
    @Result(property = "refundReimbursementId", column = "REFUND_REIMBURSEMENT_ID"),
    @Result(property = "exchangeMethod", column = "EXCHANGE_METHOD"),
    @Result(property = "exchangeLink", column = "EXCHANGE_LINK"),
    @Result(property = "exchangeCode", column = "EXCHANGE_CODE"),
    @Result(property = "biDate", column = "BI_DATE")
  })
  List<JhsTradeOrder> selectByExample(@Param("whereClauseProvider") WhereClauseProvider whereClause, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * 根据WhereClauseProvider查询订单数量
   *
   * @param whereClause 查询条件
   * @return 订单总数
   */
  @Select({
    "select count(*)",
    "from JHS_TRADE_ORDER",
    "${whereClauseProvider.whereClause}"
  })
  Long countByExample(@Param("whereClauseProvider") WhereClauseProvider whereClause);

  /**
   * 买家是否在一年内购买过公费订单
   *
   * @param buyerId     买家
   * @param date        期限
   * @param categroyIds 状态
   * @return count
   */
  Integer countAlreadyPurchasedGf(@Param("buyerId") String buyerId, @Param("date") String date, @Param("categroyIds") List<Integer> categroyIds);

  /**
   * 统计为付款订单商品数量
   *
   * @param commodityId 商品id
   * @param dictText    分类字典
   * @param statuses    状态
   * @param version     数据版本
   * @return 数量
   */
  Long countPendingOrderByCommodityId(
    @Param("commodityId") Integer commodityId,
    @Param("dictText") String dictText,
    @Param("statuses") List<Integer> statuses,
    @Param("version") Integer version
  );
}
