package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsAuctionRecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    public static final JhsAuctionRecord jhsAuctionRecord = new JhsAuctionRecord();

    /**
     * Database Column Remarks:
     *   id.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.ID")
    public static final SqlColumn<Integer> id = jhsAuctionRecord.id;

    /**
     * Database Column Remarks:
     *   商品id.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.COMMODITY_ID")
    public static final SqlColumn<Integer> commodityId = jhsAuctionRecord.commodityId;

    /**
     * Database Column Remarks:
     *   商品标题.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.COMMODITY_TITLE")
    public static final SqlColumn<String> commodityTitle = jhsAuctionRecord.commodityTitle;

    /**
     * Database Column Remarks:
     *   竞拍人id.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.STAFF_ID")
    public static final SqlColumn<String> staffId = jhsAuctionRecord.staffId;

    /**
     * Database Column Remarks:
     *   竞拍人姓名.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.STAFF_NAME")
    public static final SqlColumn<String> staffName = jhsAuctionRecord.staffName;

    /**
     * Database Column Remarks:
     *   竞拍后价格.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.PRICE")
    public static final SqlColumn<Double> price = jhsAuctionRecord.price;

    /**
     * Database Column Remarks:
     *   竞拍前价格.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.PRE_PRICE")
    public static final SqlColumn<Double> prePrice = jhsAuctionRecord.prePrice;

    /**
     * Database Column Remarks:
     *   竞拍时间.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_RECORD.CREATE_DATE")
    public static final SqlColumn<Date> createDate = jhsAuctionRecord.createDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_RECORD")
    public static final class JhsAuctionRecord extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityId = column("COMMODITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> commodityTitle = column("COMMODITY_TITLE", JDBCType.VARCHAR);

        public final SqlColumn<String> staffId = column("STAFF_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> staffName = column("STAFF_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Double> price = column("PRICE", JDBCType.DOUBLE);

        public final SqlColumn<Double> prePrice = column("PRE_PRICE", JDBCType.DOUBLE);

        public final SqlColumn<Date> createDate = column("CREATE_DATE", JDBCType.TIMESTAMP);

        public JhsAuctionRecord() {
            super("JHS_AUCTION_RECORD");
        }
    }
}