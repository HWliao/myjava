package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsTradeOrderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER")
    public static final JhsTradeOrder jhsTradeOrder = new JhsTradeOrder();

    /**
     * Database Column Remarks:
     *   主键ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.ID")
    public static final SqlColumn<Integer> id = jhsTradeOrder.id;

    /**
     * Database Column Remarks:
     *   订单号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.ORDER_NO")
    public static final SqlColumn<String> orderNo = jhsTradeOrder.orderNo;

    /**
     * Database Column Remarks:
     *   类型[1一般交易,2拍卖,3工资代扣,4公费,5离职代扣]
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.TYPE")
    public static final SqlColumn<Integer> type = jhsTradeOrder.type;

    /**
     * Database Column Remarks:
     *   商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.COMMODITY_ID")
    public static final SqlColumn<Integer> commodityId = jhsTradeOrder.commodityId;

    /**
     * Database Column Remarks:
     *   商品名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.COMMODITY_NAME")
    public static final SqlColumn<String> commodityName = jhsTradeOrder.commodityName;

    /**
     * Database Column Remarks:
     *   单价
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.PRICE")
    public static final SqlColumn<Double> price = jhsTradeOrder.price;

    /**
     * Database Column Remarks:
     *   数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.COUNT")
    public static final SqlColumn<Integer> count = jhsTradeOrder.count;

    /**
     * Database Column Remarks:
     *   总价
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.TOTAL")
    public static final SqlColumn<Double> total = jhsTradeOrder.total;

    /**
     * Database Column Remarks:
     *   来源 1 pc乐划算 2 乐办公 3 乐有家网
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.OFROM")
    public static final SqlColumn<Integer> ofrom = jhsTradeOrder.ofrom;

    /**
     * Database Column Remarks:
     *    -1已过期, 0等待付款, 1已取消, 2已付款, 3已发货, 4买家已收货, 5交易成功, 8已结款, 11待确认收款,  99交易关闭, 20工资代扣, 21公费, 30退款审批中、31退款审批不通过、32退款审批通过、33已退款、40报销审批中、41报销审批不通过、42报销审批通过
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.STATUS")
    public static final SqlColumn<Integer> status = jhsTradeOrder.status;

    /**
     * Database Column Remarks:
     *   员工ID/用户标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.WORKER_ID")
    public static final SqlColumn<String> workerId = jhsTradeOrder.workerId;

    /**
     * Database Column Remarks:
     *   员工名字
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.WORKER_NAME")
    public static final SqlColumn<String> workerName = jhsTradeOrder.workerName;

    /**
     * Database Column Remarks:
     *   创建日期
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.CREATE_DATE")
    public static final SqlColumn<Date> createDate = jhsTradeOrder.createDate;

    /**
     * Database Column Remarks:
     *   卖家ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.SELLER_ID")
    public static final SqlColumn<String> sellerId = jhsTradeOrder.sellerId;

    /**
     * Database Column Remarks:
     *   卖家名字
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.SELLER_NAME")
    public static final SqlColumn<String> sellerName = jhsTradeOrder.sellerName;

    /**
     * Database Column Remarks:
     *   卖家部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.SELLER_DEPT_ID")
    public static final SqlColumn<String> sellerDeptId = jhsTradeOrder.sellerDeptId;

    /**
     * Database Column Remarks:
     *   卖家部门name
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.SELLER_DEPT_NAME")
    public static final SqlColumn<String> sellerDeptName = jhsTradeOrder.sellerDeptName;

    /**
     * Database Column Remarks:
     *   消费者部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.BUYER_DEPT_ID")
    public static final SqlColumn<String> buyerDeptId = jhsTradeOrder.buyerDeptId;

    /**
     * Database Column Remarks:
     *   消费者部门name
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.BUYER_DEPT_NAME")
    public static final SqlColumn<String> buyerDeptName = jhsTradeOrder.buyerDeptName;

    /**
     * Database Column Remarks:
     *   积分
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.INTEGRAL")
    public static final SqlColumn<Integer> integral = jhsTradeOrder.integral;

    /**
     * Database Column Remarks:
     *    规格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.STANDARD")
    public static final SqlColumn<String> standard = jhsTradeOrder.standard;

    /**
     * Database Column Remarks:
     *   收件人
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.RECIPIENTS")
    public static final SqlColumn<String> recipients = jhsTradeOrder.recipients;

    /**
     * Database Column Remarks:
     *   买家联系方式
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.BUYER_TEL")
    public static final SqlColumn<String> buyerTel = jhsTradeOrder.buyerTel;

    /**
     * Database Column Remarks:
     *   买家联系地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.BUYER_ADDRESS")
    public static final SqlColumn<String> buyerAddress = jhsTradeOrder.buyerAddress;

    /**
     * Database Column Remarks:
     *   备注说明
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.REMARKS")
    public static final SqlColumn<String> remarks = jhsTradeOrder.remarks;

    /**
     * Database Column Remarks:
     *   省
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.PROVINCE")
    public static final SqlColumn<String> province = jhsTradeOrder.province;

    /**
     * Database Column Remarks:
     *   市
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.CITY")
    public static final SqlColumn<String> city = jhsTradeOrder.city;

    /**
     * Database Column Remarks:
     *   区
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.AREA")
    public static final SqlColumn<String> area = jhsTradeOrder.area;

    /**
     * Database Column Remarks:
     *   分行名/地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.SHOP_ADDR")
    public static final SqlColumn<String> shopAddr = jhsTradeOrder.shopAddr;

    /**
     * Database Column Remarks:
     *   快递公司
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.POST_COMPANY")
    public static final SqlColumn<String> postCompany = jhsTradeOrder.postCompany;

    /**
     * Database Column Remarks:
     *   快递单号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.POST_NO")
    public static final SqlColumn<String> postNo = jhsTradeOrder.postNo;

    /**
     * Database Column Remarks:
     *   付款时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.PAY_DATE")
    public static final SqlColumn<Date> payDate = jhsTradeOrder.payDate;

    /**
     * Database Column Remarks:
     *   发货时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.DELIVER_DATE")
    public static final SqlColumn<Date> deliverDate = jhsTradeOrder.deliverDate;

    /**
     * Database Column Remarks:
     *   发货信息
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.DELIVER_MSG")
    public static final SqlColumn<String> deliverMsg = jhsTradeOrder.deliverMsg;

    /**
     * Database Column Remarks:
     *   确认收货时间/交易成功时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.RECEIPT_DATE")
    public static final SqlColumn<Date> receiptDate = jhsTradeOrder.receiptDate;

    /**
     * Database Column Remarks:
     *   收货方式：1快递，2自取
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.TAKE_TYPE")
    public static final SqlColumn<Integer> takeType = jhsTradeOrder.takeType;

    /**
     * Database Column Remarks:
     *   是否产生快乐基金记录 1是
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.IS_CREATE_HAPPY")
    public static final SqlColumn<String> isCreateHappy = jhsTradeOrder.isCreateHappy;

    /**
     * Database Column Remarks:
     *   支付方式(0现金1现金和积分 废除)2支付宝3储备奖4顺豆
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.PAY_METHOD")
    public static final SqlColumn<String> payMethod = jhsTradeOrder.payMethod;

    /**
     * Database Column Remarks:
     *   所属分类
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.DICTTEXT")
    public static final SqlColumn<String> dicttext = jhsTradeOrder.dicttext;

    /**
     * Database Column Remarks:
     *   结款单打印时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.PRINT_DATE")
    public static final SqlColumn<Date> printDate = jhsTradeOrder.printDate;

    /**
     * Database Column Remarks:
     *   结款时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.PAYMENT_DATE")
    public static final SqlColumn<Date> paymentDate = jhsTradeOrder.paymentDate;

    /**
     * Database Column Remarks:
     *   交易终止时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.STOP_TRADE_DATE")
    public static final SqlColumn<Date> stopTradeDate = jhsTradeOrder.stopTradeDate;

    /**
     * Database Column Remarks:
     *   数据版本 版本1 无供应商管理的订单数据(包含历史数据) 版本2添加了诸多订单明细字段,由资产作为供应商管理服装类数据 版本3 由外部供应商管理服装类数据
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.DATA_VERSION")
    public static final SqlColumn<Integer> dataVersion = jhsTradeOrder.dataVersion;

    /**
     * Database Column Remarks:
     *   订单对应报销单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.REIMBURSEMENT_ID")
    public static final SqlColumn<Integer> reimbursementId = jhsTradeOrder.reimbursementId;

    /**
     * Database Column Remarks:
     *   退款原因
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.REFUND_REASON")
    public static final SqlColumn<String> refundReason = jhsTradeOrder.refundReason;

    /**
     * Database Column Remarks:
     *   退款报销单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.REFUND_REIMBURSEMENT_ID")
    public static final SqlColumn<Integer> refundReimbursementId = jhsTradeOrder.refundReimbursementId;

    /**
     * Database Column Remarks:
     *   兑换方式 1 兑换码 2 兑换链接
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.EXCHANGE_METHOD")
    public static final SqlColumn<Integer> exchangeMethod = jhsTradeOrder.exchangeMethod;

    /**
     * Database Column Remarks:
     *   兑换链接
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.EXCHANGE_LINK")
    public static final SqlColumn<String> exchangeLink = jhsTradeOrder.exchangeLink;

    /**
     * Database Column Remarks:
     *   兑换码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.EXCHANGE_CODE")
    public static final SqlColumn<String> exchangeCode = jhsTradeOrder.exchangeCode;

    /**
     * Database Column Remarks:
     *   时间戳标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER.BI_DATE")
    public static final SqlColumn<Date> biDate = jhsTradeOrder.biDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER")
    public static final class JhsTradeOrder extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> orderNo = column("ORDER_NO", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityId = column("COMMODITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> commodityName = column("COMMODITY_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Double> price = column("PRICE", JDBCType.DOUBLE);

        public final SqlColumn<Integer> count = column("COUNT", JDBCType.INTEGER);

        public final SqlColumn<Double> total = column("TOTAL", JDBCType.DOUBLE);

        public final SqlColumn<Integer> ofrom = column("OFROM", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("STATUS", JDBCType.INTEGER);

        public final SqlColumn<String> workerId = column("WORKER_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> workerName = column("WORKER_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Date> createDate = column("CREATE_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sellerId = column("SELLER_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> sellerName = column("SELLER_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> sellerDeptId = column("SELLER_DEPT_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> sellerDeptName = column("SELLER_DEPT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> buyerDeptId = column("BUYER_DEPT_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> buyerDeptName = column("BUYER_DEPT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> integral = column("INTEGRAL", JDBCType.INTEGER);

        public final SqlColumn<String> standard = column("STANDARD", JDBCType.VARCHAR);

        public final SqlColumn<String> recipients = column("RECIPIENTS", JDBCType.VARCHAR);

        public final SqlColumn<String> buyerTel = column("BUYER_TEL", JDBCType.VARCHAR);

        public final SqlColumn<String> buyerAddress = column("BUYER_ADDRESS", JDBCType.VARCHAR);

        public final SqlColumn<String> remarks = column("REMARKS", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("PROVINCE", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("CITY", JDBCType.VARCHAR);

        public final SqlColumn<String> area = column("AREA", JDBCType.VARCHAR);

        public final SqlColumn<String> shopAddr = column("SHOP_ADDR", JDBCType.VARCHAR);

        public final SqlColumn<String> postCompany = column("POST_COMPANY", JDBCType.VARCHAR);

        public final SqlColumn<String> postNo = column("POST_NO", JDBCType.VARCHAR);

        public final SqlColumn<Date> payDate = column("PAY_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> deliverDate = column("DELIVER_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<String> deliverMsg = column("DELIVER_MSG", JDBCType.VARCHAR);

        public final SqlColumn<Date> receiptDate = column("RECEIPT_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> takeType = column("TAKE_TYPE", JDBCType.INTEGER);

        public final SqlColumn<String> isCreateHappy = column("IS_CREATE_HAPPY", JDBCType.CHAR);

        public final SqlColumn<String> payMethod = column("PAY_METHOD", JDBCType.VARCHAR);

        public final SqlColumn<String> dicttext = column("DICTTEXT", JDBCType.VARCHAR);

        public final SqlColumn<Date> printDate = column("PRINT_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> paymentDate = column("PAYMENT_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> stopTradeDate = column("STOP_TRADE_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> dataVersion = column("DATA_VERSION", JDBCType.INTEGER);

        public final SqlColumn<Integer> reimbursementId = column("REIMBURSEMENT_ID", JDBCType.INTEGER);

        public final SqlColumn<String> refundReason = column("REFUND_REASON", JDBCType.VARCHAR);

        public final SqlColumn<Integer> refundReimbursementId = column("REFUND_REIMBURSEMENT_ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> exchangeMethod = column("EXCHANGE_METHOD", JDBCType.INTEGER);

        public final SqlColumn<String> exchangeLink = column("EXCHANGE_LINK", JDBCType.VARCHAR);

        public final SqlColumn<String> exchangeCode = column("EXCHANGE_CODE", JDBCType.VARCHAR);

        public final SqlColumn<Date> biDate = column("BI_DATE", JDBCType.TIMESTAMP);

        public JhsTradeOrder() {
            super("JHS_TRADE_ORDER");
        }
    }
}