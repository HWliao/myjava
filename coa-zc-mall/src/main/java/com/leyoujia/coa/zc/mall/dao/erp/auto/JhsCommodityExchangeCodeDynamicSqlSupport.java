package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityExchangeCodeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    public static final JhsCommodityExchangeCode jhsCommodityExchangeCode = new JhsCommodityExchangeCode();

    /**
     * Database Column Remarks:
     *   自增id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_EXCHANGE_CODE.ID")
    public static final SqlColumn<Integer> id = jhsCommodityExchangeCode.id;

    /**
     * Database Column Remarks:
     *   商品id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_EXCHANGE_CODE.COMMODITY_ID")
    public static final SqlColumn<Integer> commodityId = jhsCommodityExchangeCode.commodityId;

    /**
     * Database Column Remarks:
     *   兑换码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_EXCHANGE_CODE.EXCHANGE_CODE")
    public static final SqlColumn<String> exchangeCode = jhsCommodityExchangeCode.exchangeCode;

    /**
     * Database Column Remarks:
     *   是否有效 1：有效，0：无效
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_EXCHANGE_CODE.VALID")
    public static final SqlColumn<Integer> valid = jhsCommodityExchangeCode.valid;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_EXCHANGE_CODE.CREATE_TIME")
    public static final SqlColumn<Date> createTime = jhsCommodityExchangeCode.createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_EXCHANGE_CODE.UPDATE_TIME")
    public static final SqlColumn<Date> updateTime = jhsCommodityExchangeCode.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_EXCHANGE_CODE")
    public static final class JhsCommodityExchangeCode extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityId = column("COMMODITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> exchangeCode = column("EXCHANGE_CODE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> valid = column("VALID", JDBCType.TINYINT);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("UPDATE_TIME", JDBCType.TIMESTAMP);

        public JhsCommodityExchangeCode() {
            super("JHS_COMMODITY_EXCHANGE_CODE");
        }
    }
}