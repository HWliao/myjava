package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsTradeOrderChildDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    public static final JhsTradeOrderChild jhsTradeOrderChild = new JhsTradeOrderChild();

    /**
     * Database Column Remarks:
     *   主键ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.ID")
    public static final SqlColumn<Integer> id = jhsTradeOrderChild.id;

    /**
     * Database Column Remarks:
     *   父订单ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PARENT_ID")
    public static final SqlColumn<Integer> parentId = jhsTradeOrderChild.parentId;

    /**
     * Database Column Remarks:
     *   订单号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.ORDER_NO")
    public static final SqlColumn<String> orderNo = jhsTradeOrderChild.orderNo;

    /**
     * Database Column Remarks:
     *   类型[1一般交易,2拍卖,3工资代扣,4公费,5离职代扣]
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.TYPE")
    public static final SqlColumn<Integer> type = jhsTradeOrderChild.type;

    /**
     * Database Column Remarks:
     *   商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.COMMODITY_ID")
    public static final SqlColumn<Integer> commodityId = jhsTradeOrderChild.commodityId;

    /**
     * Database Column Remarks:
     *   商品名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.COMMODITY_NAME")
    public static final SqlColumn<String> commodityName = jhsTradeOrderChild.commodityName;

    /**
     * Database Column Remarks:
     *   单价
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PRICE")
    public static final SqlColumn<Double> price = jhsTradeOrderChild.price;

    /**
     * Database Column Remarks:
     *   数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.COUNT")
    public static final SqlColumn<Integer> count = jhsTradeOrderChild.count;

    /**
     * Database Column Remarks:
     *   总价
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.TOTAL")
    public static final SqlColumn<Double> total = jhsTradeOrderChild.total;

    /**
     * Database Column Remarks:
     *   来源 1 pc乐划算 2 乐办公 3 乐有家网
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.OFROM")
    public static final SqlColumn<Integer> ofrom = jhsTradeOrderChild.ofrom;

    /**
     * Database Column Remarks:
     *    -1已过期, 0等待付款, 1已取消, 2已付款, 3已发货, 4买家已收货, 5交易成功, 8已结款, 11待确认收款,  99交易关闭, 20工资代扣, 21公费, 30退款审批中、31退款审批不通过、32退款审批通过、33已退款
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.STATUS")
    public static final SqlColumn<Integer> status = jhsTradeOrderChild.status;

    /**
     * Database Column Remarks:
     *   员工ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.WORKER_ID")
    public static final SqlColumn<String> workerId = jhsTradeOrderChild.workerId;

    /**
     * Database Column Remarks:
     *   员工名字
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.WORKER_NAME")
    public static final SqlColumn<String> workerName = jhsTradeOrderChild.workerName;

    /**
     * Database Column Remarks:
     *   创建日期
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.CREATE_DATE")
    public static final SqlColumn<Date> createDate = jhsTradeOrderChild.createDate;

    /**
     * Database Column Remarks:
     *   卖家ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.SELLER_ID")
    public static final SqlColumn<String> sellerId = jhsTradeOrderChild.sellerId;

    /**
     * Database Column Remarks:
     *   卖家名字
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.SELLER_NAME")
    public static final SqlColumn<String> sellerName = jhsTradeOrderChild.sellerName;

    /**
     * Database Column Remarks:
     *   卖家部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.SELLER_DEPT_ID")
    public static final SqlColumn<String> sellerDeptId = jhsTradeOrderChild.sellerDeptId;

    /**
     * Database Column Remarks:
     *   卖家部门name
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.SELLER_DEPT_NAME")
    public static final SqlColumn<String> sellerDeptName = jhsTradeOrderChild.sellerDeptName;

    /**
     * Database Column Remarks:
     *   消费者部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.BUYER_DEPT_ID")
    public static final SqlColumn<String> buyerDeptId = jhsTradeOrderChild.buyerDeptId;

    /**
     * Database Column Remarks:
     *   消费者部门name
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.BUYER_DEPT_NAME")
    public static final SqlColumn<String> buyerDeptName = jhsTradeOrderChild.buyerDeptName;

    /**
     * Database Column Remarks:
     *   积分
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.INTEGRAL")
    public static final SqlColumn<Integer> integral = jhsTradeOrderChild.integral;

    /**
     * Database Column Remarks:
     *    规格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.STANDARD")
    public static final SqlColumn<String> standard = jhsTradeOrderChild.standard;

    /**
     * Database Column Remarks:
     *   收件人
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.RECIPIENTS")
    public static final SqlColumn<String> recipients = jhsTradeOrderChild.recipients;

    /**
     * Database Column Remarks:
     *   买家联系方式
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.BUYER_TEL")
    public static final SqlColumn<String> buyerTel = jhsTradeOrderChild.buyerTel;

    /**
     * Database Column Remarks:
     *   买家联系地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.BUYER_ADDRESS")
    public static final SqlColumn<String> buyerAddress = jhsTradeOrderChild.buyerAddress;

    /**
     * Database Column Remarks:
     *   备注说明
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.REMARKS")
    public static final SqlColumn<String> remarks = jhsTradeOrderChild.remarks;

    /**
     * Database Column Remarks:
     *   省
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PROVINCE")
    public static final SqlColumn<String> province = jhsTradeOrderChild.province;

    /**
     * Database Column Remarks:
     *   市
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.CITY")
    public static final SqlColumn<String> city = jhsTradeOrderChild.city;

    /**
     * Database Column Remarks:
     *   区
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.AREA")
    public static final SqlColumn<String> area = jhsTradeOrderChild.area;

    /**
     * Database Column Remarks:
     *   分行名/地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.SHOP_ADDR")
    public static final SqlColumn<String> shopAddr = jhsTradeOrderChild.shopAddr;

    /**
     * Database Column Remarks:
     *   快递公司
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.POST_COMPANY")
    public static final SqlColumn<String> postCompany = jhsTradeOrderChild.postCompany;

    /**
     * Database Column Remarks:
     *   快递单号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.POST_NO")
    public static final SqlColumn<String> postNo = jhsTradeOrderChild.postNo;

    /**
     * Database Column Remarks:
     *   付款时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PAY_DATE")
    public static final SqlColumn<Date> payDate = jhsTradeOrderChild.payDate;

    /**
     * Database Column Remarks:
     *   发货时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.DELIVER_DATE")
    public static final SqlColumn<Date> deliverDate = jhsTradeOrderChild.deliverDate;

    /**
     * Database Column Remarks:
     *   发货信息
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.DELIVER_MSG")
    public static final SqlColumn<String> deliverMsg = jhsTradeOrderChild.deliverMsg;

    /**
     * Database Column Remarks:
     *   确认收货时间/交易成功时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.RECEIPT_DATE")
    public static final SqlColumn<Date> receiptDate = jhsTradeOrderChild.receiptDate;

    /**
     * Database Column Remarks:
     *   收货方式：1快递，2自取
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.TAKE_TYPE")
    public static final SqlColumn<Integer> takeType = jhsTradeOrderChild.takeType;

    /**
     * Database Column Remarks:
     *   是否产生快乐基金记录 1是
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.IS_CREATE_HAPPY")
    public static final SqlColumn<String> isCreateHappy = jhsTradeOrderChild.isCreateHappy;

    /**
     * Database Column Remarks:
     *   支付方式(0现金1现金和积分 废除)2支付宝3储备奖4顺豆
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PAY_METHOD")
    public static final SqlColumn<String> payMethod = jhsTradeOrderChild.payMethod;

    /**
     * Database Column Remarks:
     *   所属分类
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.DICTTEXT")
    public static final SqlColumn<String> dicttext = jhsTradeOrderChild.dicttext;

    /**
     * Database Column Remarks:
     *   结款单打印时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PRINT_DATE")
    public static final SqlColumn<Date> printDate = jhsTradeOrderChild.printDate;

    /**
     * Database Column Remarks:
     *   结款时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.PAYMENT_DATE")
    public static final SqlColumn<Date> paymentDate = jhsTradeOrderChild.paymentDate;

    /**
     * Database Column Remarks:
     *   交易终止时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.STOP_TRADE_DATE")
    public static final SqlColumn<Date> stopTradeDate = jhsTradeOrderChild.stopTradeDate;

    /**
     * Database Column Remarks:
     *   数据版本 版本1 无供应商管理的订单数据(包含历史数据) 版本2添加了诸多订单明细字段,由资产作为供应商管理服装类数据 版本3 由外部供应商管理服装类数据
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.DATA_VERSION")
    public static final SqlColumn<Integer> dataVersion = jhsTradeOrderChild.dataVersion;

    /**
     * Database Column Remarks:
     *   报销单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.REIMBURSEMENT_ID")
    public static final SqlColumn<Integer> reimbursementId = jhsTradeOrderChild.reimbursementId;

    /**
     * Database Column Remarks:
     *   时间戳标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_TRADE_ORDER_CHILD.BI_DATE")
    public static final SqlColumn<Date> biDate = jhsTradeOrderChild.biDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_TRADE_ORDER_CHILD")
    public static final class JhsTradeOrderChild extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> parentId = column("PARENT_ID", JDBCType.INTEGER);

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

        public final SqlColumn<Date> biDate = column("BI_DATE", JDBCType.TIMESTAMP);

        public JhsTradeOrderChild() {
            super("JHS_TRADE_ORDER_CHILD");
        }
    }
}