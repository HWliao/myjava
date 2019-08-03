package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityStockLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    public static final JhsCommodityStockLog jhsCommodityStockLog = new JhsCommodityStockLog();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.ID")
    public static final SqlColumn<Integer> id = jhsCommodityStockLog.id;

    /**
     * Database Column Remarks:
     *   库存商品id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.STOCK_ID")
    public static final SqlColumn<Integer> stockId = jhsCommodityStockLog.stockId;

    /**
     * Database Column Remarks:
     *   操作类型 0 无效操作类型 1 入库 2 发货 3 换码 4 报损
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.TYPE")
    public static final SqlColumn<String> type = jhsCommodityStockLog.type;

    /**
     * Database Column Remarks:
     *   库存操作子类型:报损操作包含1 报损,2 其他 两种类型
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.SUB_TYPE")
    public static final SqlColumn<String> subType = jhsCommodityStockLog.subType;

    /**
     * Database Column Remarks:
     *   操作数量 负数扣库存 正数加库存
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.NUM")
    public static final SqlColumn<BigDecimal> num = jhsCommodityStockLog.num;

    /**
     * Database Column Remarks:
     *   备注/操作描述
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.DESCR")
    public static final SqlColumn<String> descr = jhsCommodityStockLog.descr;

    /**
     * Database Column Remarks:
     *   状态 0 无效 1 有效
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.STATUS")
    public static final SqlColumn<String> status = jhsCommodityStockLog.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.CREATE_TIME")
    public static final SqlColumn<Date> createTime = jhsCommodityStockLog.createTime;

    /**
     * Database Column Remarks:
     *   增量标示
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK_LOG.BI_DATE")
    public static final SqlColumn<Date> biDate = jhsCommodityStockLog.biDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK_LOG")
    public static final class JhsCommodityStockLog extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> stockId = column("STOCK_ID", JDBCType.INTEGER);

        public final SqlColumn<String> type = column("TYPE", JDBCType.CHAR);

        public final SqlColumn<String> subType = column("SUB_TYPE", JDBCType.CHAR);

        public final SqlColumn<BigDecimal> num = column("NUM", JDBCType.DECIMAL);

        public final SqlColumn<String> descr = column("DESCR", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("STATUS", JDBCType.CHAR);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> biDate = column("BI_DATE", JDBCType.TIMESTAMP);

        public JhsCommodityStockLog() {
            super("JHS_COMMODITY_STOCK_LOG");
        }
    }
}