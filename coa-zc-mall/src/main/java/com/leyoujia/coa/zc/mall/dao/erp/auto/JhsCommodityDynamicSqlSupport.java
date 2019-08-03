package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    public static final JhsCommodity jhsCommodity = new JhsCommodity();

    /**
     * Database Column Remarks:
     *   ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.ID")
    public static final SqlColumn<Integer> id = jhsCommodity.id;

    /**
     * Database Column Remarks:
     *   名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.TITLE")
    public static final SqlColumn<String> title = jhsCommodity.title;

    /**
     * Database Column Remarks:
     *   类别id, 对应表JHS_SUBJECT
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.CATEGORY_ID")
    public static final SqlColumn<Integer> categoryId = jhsCommodity.categoryId;

    /**
     * Database Column Remarks:
     *   简称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SHORT_NAME")
    public static final SqlColumn<String> shortName = jhsCommodity.shortName;

    /**
     * Database Column Remarks:
     *   图片地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.PHOTO_URL")
    public static final SqlColumn<String> photoUrl = jhsCommodity.photoUrl;

    /**
     * Database Column Remarks:
     *   数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.COUNT")
    public static final SqlColumn<Integer> count = jhsCommodity.count;

    /**
     * Database Column Remarks:
     *   规格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.STANDARD")
    public static final SqlColumn<String> standard = jhsCommodity.standard;

    /**
     * Database Column Remarks:
     *   型号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.MODEL_NO")
    public static final SqlColumn<String> modelNo = jhsCommodity.modelNo;

    /**
     * Database Column Remarks:
     *   颜色
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.COLOR")
    public static final SqlColumn<String> color = jhsCommodity.color;

    /**
     * Database Column Remarks:
     *   尺寸
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SIZE")
    public static final SqlColumn<String> size = jhsCommodity.size;

    /**
     * Database Column Remarks:
     *   支付方式(0现金1现金和积分 废除)2支付宝3储备奖4顺豆
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.PAY_METHOD")
    public static final SqlColumn<String> payMethod = jhsCommodity.payMethod;

    /**
     * Database Column Remarks:
     *   竞拍时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.AUCTION_DATE")
    public static final SqlColumn<Date> auctionDate = jhsCommodity.auctionDate;

    /**
     * Database Column Remarks:
     *   起拍价格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.PRICE_START")
    public static final SqlColumn<Double> priceStart = jhsCommodity.priceStart;

    /**
     * Database Column Remarks:
     *   跳拍价格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.PRICE_JUMP")
    public static final SqlColumn<Double> priceJump = jhsCommodity.priceJump;

    /**
     * Database Column Remarks:
     *   市场价格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.MARKET_PRICE")
    public static final SqlColumn<Double> marketPrice = jhsCommodity.marketPrice;

    /**
     * Database Column Remarks:
     *   定价
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.PRICE")
    public static final SqlColumn<Double> price = jhsCommodity.price;

    /**
     * Database Column Remarks:
     *   发货时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.DELIVER_DATE")
    public static final SqlColumn<Date> deliverDate = jhsCommodity.deliverDate;

    /**
     * Database Column Remarks:
     *   发货方式
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.DELIVER_TYPE")
    public static final SqlColumn<Integer> deliverType = jhsCommodity.deliverType;

    /**
     * Database Column Remarks:
     *   出售类型
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SELL_TYPE")
    public static final SqlColumn<Integer> sellType = jhsCommodity.sellType;

    /**
     * Database Column Remarks:
     *   状态: 0待审核 1已审核 2未通过
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.STATUS")
    public static final SqlColumn<Integer> status = jhsCommodity.status;

    /**
     * Database Column Remarks:
     *   积分
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.INTEGRAL")
    public static final SqlColumn<Integer> integral = jhsCommodity.integral;

    /**
     * Database Column Remarks:
     *   是否审核0-未 1-已审核通过
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.IS_VERIFY")
    public static final SqlColumn<Integer> isVerify = jhsCommodity.isVerify;

    /**
     * Database Column Remarks:
     *   发布日期
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.CREATE_DATE")
    public static final SqlColumn<Date> createDate = jhsCommodity.createDate;

    /**
     * Database Column Remarks:
     *   拍卖结束时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.AUCTION_END_DATE")
    public static final SqlColumn<Date> auctionEndDate = jhsCommodity.auctionEndDate;

    /**
     * Database Column Remarks:
     *   员工id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.STAFF_ID")
    public static final SqlColumn<String> staffId = jhsCommodity.staffId;

    /**
     * Database Column Remarks:
     *   员工名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.STAFF_NAME")
    public static final SqlColumn<String> staffName = jhsCommodity.staffName;

    /**
     * Database Column Remarks:
     *   部门id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.DEPT_ID")
    public static final SqlColumn<String> deptId = jhsCommodity.deptId;

    /**
     * Database Column Remarks:
     *   部门名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.DEPT_NAME")
    public static final SqlColumn<String> deptName = jhsCommodity.deptName;

    /**
     * Database Column Remarks:
     *   是否下架，默认0，即上架
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.IS_DOWN")
    public static final SqlColumn<Integer> isDown = jhsCommodity.isDown;

    /**
     * Database Column Remarks:
     *   是否手动下架 , 1是  2 否
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.IS_MANUAL_DOWN")
    public static final SqlColumn<Integer> isManualDown = jhsCommodity.isManualDown;

    /**
     * Database Column Remarks:
     *   是否作为公司佣金,1-是|0-否
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.IS_COMMISSION")
    public static final SqlColumn<Integer> isCommission = jhsCommodity.isCommission;

    /**
     * Database Column Remarks:
     *   佣金公司编号，选择作为公司佣金则记录此项
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.COMMISSION_CM_NO")
    public static final SqlColumn<String> commissionCmNo = jhsCommodity.commissionCmNo;

    /**
     * Database Column Remarks:
     *   佣金公司名称，选择作为公司佣金则记录此项
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.COMMISSION_CM_NAME")
    public static final SqlColumn<String> commissionCmName = jhsCommodity.commissionCmName;

    /**
     * Database Column Remarks:
     *   联系方式
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.CONTACT")
    public static final SqlColumn<String> contact = jhsCommodity.contact;

    /**
     * Database Column Remarks:
     *   审核备注
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.CHECK_REMARKS")
    public static final SqlColumn<String> checkRemarks = jhsCommodity.checkRemarks;

    /**
     * Database Column Remarks:
     *   拍卖封顶价格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.PRICE_MAX")
    public static final SqlColumn<Double> priceMax = jhsCommodity.priceMax;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.IS_WORKER_PAY")
    public static final SqlColumn<Byte> isWorkerPay = jhsCommodity.isWorkerPay;

    /**
     * Database Column Remarks:
     *   卖家姓名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SELLER_NAME")
    public static final SqlColumn<String> sellerName = jhsCommodity.sellerName;

    /**
     * Database Column Remarks:
     *   卖家员工编号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SELLER_WORKER_ID")
    public static final SqlColumn<String> sellerWorkerId = jhsCommodity.sellerWorkerId;

    /**
     * Database Column Remarks:
     *   卖家手机
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SELLER_PHONE")
    public static final SqlColumn<String> sellerPhone = jhsCommodity.sellerPhone;

    /**
     * Database Column Remarks:
     *   卖家QQ
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SELLER_QQ")
    public static final SqlColumn<String> sellerQq = jhsCommodity.sellerQq;

    /**
     * Database Column Remarks:
     *   获赠渠道 1开发商奖励 2其它
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.GIVEN_CHANNEL")
    public static final SqlColumn<Byte> givenChannel = jhsCommodity.givenChannel;

    /**
     * Database Column Remarks:
     *   获赠人员姓名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.GIVEN_NAME")
    public static final SqlColumn<String> givenName = jhsCommodity.givenName;

    /**
     * Database Column Remarks:
     *   获赠人员员工编号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.GIVEN_WORKER_ID")
    public static final SqlColumn<String> givenWorkerId = jhsCommodity.givenWorkerId;

    /**
     * Database Column Remarks:
     *   获赠项目名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.GIVEN_PROJECT")
    public static final SqlColumn<String> givenProject = jhsCommodity.givenProject;

    /**
     * Database Column Remarks:
     *   获赠成交单号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.GIVEN_CJ_NUMBER")
    public static final SqlColumn<String> givenCjNumber = jhsCommodity.givenCjNumber;

    /**
     * Database Column Remarks:
     *   获赠项目id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.GIVEN_PROJECT_ID")
    public static final SqlColumn<Integer> givenProjectId = jhsCommodity.givenProjectId;

    /**
     * Database Column Remarks:
     *   排序字段
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.SORT_NUM")
    public static final SqlColumn<Integer> sortNum = jhsCommodity.sortNum;

    /**
     * Database Column Remarks:
     *   房源网渠道
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.CHANNEL_HOUSING_RESOURCES")
    public static final SqlColumn<Integer> channelHousingResources = jhsCommodity.channelHousingResources;

    /**
     * Database Column Remarks:
     *   乐办公渠道
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.CHANNEL_HAPPY_OFFICE")
    public static final SqlColumn<Integer> channelHappyOffice = jhsCommodity.channelHappyOffice;

    /**
     * Database Column Remarks:
     *   兑换条件 1：单次，2：多次
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.EXCHANGE_CONDITION")
    public static final SqlColumn<Integer> exchangeCondition = jhsCommodity.exchangeCondition;

    /**
     * Database Column Remarks:
     *   第三方兑换链接
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY.EXCHANGE_THIRD_LINK")
    public static final SqlColumn<String> exchangeThirdLink = jhsCommodity.exchangeThirdLink;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY")
    public static final class JhsCommodity extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> categoryId = column("CATEGORY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> shortName = column("SHORT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> photoUrl = column("PHOTO_URL", JDBCType.VARCHAR);

        public final SqlColumn<Integer> count = column("COUNT", JDBCType.INTEGER);

        public final SqlColumn<String> standard = column("STANDARD", JDBCType.VARCHAR);

        public final SqlColumn<String> modelNo = column("MODEL_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> color = column("COLOR", JDBCType.VARCHAR);

        public final SqlColumn<String> size = column("SIZE", JDBCType.VARCHAR);

        public final SqlColumn<String> payMethod = column("PAY_METHOD", JDBCType.VARCHAR);

        public final SqlColumn<Date> auctionDate = column("AUCTION_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Double> priceStart = column("PRICE_START", JDBCType.DOUBLE);

        public final SqlColumn<Double> priceJump = column("PRICE_JUMP", JDBCType.DOUBLE);

        public final SqlColumn<Double> marketPrice = column("MARKET_PRICE", JDBCType.DOUBLE);

        public final SqlColumn<Double> price = column("PRICE", JDBCType.DOUBLE);

        public final SqlColumn<Date> deliverDate = column("DELIVER_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> deliverType = column("DELIVER_TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> sellType = column("SELL_TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("STATUS", JDBCType.INTEGER);

        public final SqlColumn<Integer> integral = column("INTEGRAL", JDBCType.INTEGER);

        public final SqlColumn<Integer> isVerify = column("IS_VERIFY", JDBCType.INTEGER);

        public final SqlColumn<Date> createDate = column("CREATE_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> auctionEndDate = column("AUCTION_END_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<String> staffId = column("STAFF_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> staffName = column("STAFF_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> deptId = column("DEPT_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> deptName = column("DEPT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isDown = column("IS_DOWN", JDBCType.INTEGER);

        public final SqlColumn<Integer> isManualDown = column("IS_MANUAL_DOWN", JDBCType.INTEGER);

        public final SqlColumn<Integer> isCommission = column("IS_COMMISSION", JDBCType.INTEGER);

        public final SqlColumn<String> commissionCmNo = column("COMMISSION_CM_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> commissionCmName = column("COMMISSION_CM_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> contact = column("CONTACT", JDBCType.VARCHAR);

        public final SqlColumn<String> checkRemarks = column("CHECK_REMARKS", JDBCType.VARCHAR);

        public final SqlColumn<Double> priceMax = column("PRICE_MAX", JDBCType.DOUBLE);

        public final SqlColumn<Byte> isWorkerPay = column("IS_WORKER_PAY", JDBCType.TINYINT);

        public final SqlColumn<String> sellerName = column("SELLER_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> sellerWorkerId = column("SELLER_WORKER_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> sellerPhone = column("SELLER_PHONE", JDBCType.VARCHAR);

        public final SqlColumn<String> sellerQq = column("SELLER_QQ", JDBCType.VARCHAR);

        public final SqlColumn<Byte> givenChannel = column("GIVEN_CHANNEL", JDBCType.TINYINT);

        public final SqlColumn<String> givenName = column("GIVEN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> givenWorkerId = column("GIVEN_WORKER_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> givenProject = column("GIVEN_PROJECT", JDBCType.VARCHAR);

        public final SqlColumn<String> givenCjNumber = column("GIVEN_CJ_NUMBER", JDBCType.VARCHAR);

        public final SqlColumn<Integer> givenProjectId = column("GIVEN_PROJECT_ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> sortNum = column("SORT_NUM", JDBCType.INTEGER);

        public final SqlColumn<Integer> channelHousingResources = column("CHANNEL_HOUSING_RESOURCES", JDBCType.TINYINT);

        public final SqlColumn<Integer> channelHappyOffice = column("CHANNEL_HAPPY_OFFICE", JDBCType.TINYINT);

        public final SqlColumn<Integer> exchangeCondition = column("EXCHANGE_CONDITION", JDBCType.INTEGER);

        public final SqlColumn<String> exchangeThirdLink = column("EXCHANGE_THIRD_LINK", JDBCType.VARCHAR);

        public JhsCommodity() {
            super("JHS_COMMODITY");
        }
    }
}