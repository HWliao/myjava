package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsExchangeSizeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    public static final JhsExchangeSize jhsExchangeSize = new JhsExchangeSize();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.ID")
    public static final SqlColumn<Integer> id = jhsExchangeSize.id;

    /**
     * Database Column Remarks:
     *   订单类型 1为普通订单 2为子订单
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.ORDER_TYPE")
    public static final SqlColumn<Integer> orderType = jhsExchangeSize.orderType;

    /**
     * Database Column Remarks:
     *   订单ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.ORDER_ID")
    public static final SqlColumn<Integer> orderId = jhsExchangeSize.orderId;

    /**
     * Database Column Remarks:
     *   商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.COMMODITY_ID")
    public static final SqlColumn<Integer> commodityId = jhsExchangeSize.commodityId;

    /**
     * Database Column Remarks:
     *   商品名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.COMMODITY_NAME")
    public static final SqlColumn<String> commodityName = jhsExchangeSize.commodityName;

    /**
     * Database Column Remarks:
     *   旧尺码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.OLD_SIZE")
    public static final SqlColumn<String> oldSize = jhsExchangeSize.oldSize;

    /**
     * Database Column Remarks:
     *   新尺码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.NEW_SIZE")
    public static final SqlColumn<String> newSize = jhsExchangeSize.newSize;

    /**
     * Database Column Remarks:
     *   置换数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.COUNT")
    public static final SqlColumn<Integer> count = jhsExchangeSize.count;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.CREATE_DATE")
    public static final SqlColumn<Date> createDate = jhsExchangeSize.createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_EXCHANGE_SIZE.UPDATE_DATE")
    public static final SqlColumn<Date> updateDate = jhsExchangeSize.updateDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_EXCHANGE_SIZE")
    public static final class JhsExchangeSize extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderType = column("ORDER_TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderId = column("ORDER_ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityId = column("COMMODITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> commodityName = column("COMMODITY_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> oldSize = column("OLD_SIZE", JDBCType.VARCHAR);

        public final SqlColumn<String> newSize = column("NEW_SIZE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> count = column("COUNT", JDBCType.INTEGER);

        public final SqlColumn<Date> createDate = column("CREATE_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateDate = column("UPDATE_DATE", JDBCType.TIMESTAMP);

        public JhsExchangeSize() {
            super("JHS_EXCHANGE_SIZE");
        }
    }
}