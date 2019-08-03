package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsAuctionTipLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    public static final JhsAuctionTipLog jhsAuctionTipLog = new JhsAuctionTipLog();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_TIP_LOG.ID")
    public static final SqlColumn<Integer> id = jhsAuctionTipLog.id;

    /**
     * Database Column Remarks:
     *   订单号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_TIP_LOG.ORDER_NO")
    public static final SqlColumn<String> orderNo = jhsAuctionTipLog.orderNo;

    /**
     * Database Column Remarks:
     *   状态 0 无效 1 有效
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_TIP_LOG.STATUS")
    public static final SqlColumn<Integer> status = jhsAuctionTipLog.status;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_AUCTION_TIP_LOG.CREATE_TIME")
    public static final SqlColumn<Date> createTime = jhsAuctionTipLog.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_AUCTION_TIP_LOG")
    public static final class JhsAuctionTipLog extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> orderNo = column("ORDER_NO", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("STATUS", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public JhsAuctionTipLog() {
            super("JHS_AUCTION_TIP_LOG");
        }
    }
}