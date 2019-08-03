package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityStockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    public static final JhsCommodityStock jhsCommodityStock = new JhsCommodityStock();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.ID")
    public static final SqlColumn<Integer> id = jhsCommodityStock.id;

    /**
     * Database Column Remarks:
     *   商品id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_ID")
    public static final SqlColumn<Integer> commodityId = jhsCommodityStock.commodityId;

    /**
     * Database Column Remarks:
     *   商品规格 对应 商品的分类数据
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_STANDARD")
    public static final SqlColumn<String> commodityStandard = jhsCommodityStock.commodityStandard;

    /**
     * Database Column Remarks:
     *   库存数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.NUM")
    public static final SqlColumn<BigDecimal> num = jhsCommodityStock.num;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.CREATE_TIME")
    public static final SqlColumn<Date> createTime = jhsCommodityStock.createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.UPDATE_TIME")
    public static final SqlColumn<Date> updateTime = jhsCommodityStock.updateTime;

    /**
     * Database Column Remarks:
     *   最后一次入库时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.LAST_STORAGE_TIME")
    public static final SqlColumn<Date> lastStorageTime = jhsCommodityStock.lastStorageTime;

    /**
     * Database Column Remarks:
     *   数据状态 0 无效 1 有效
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.STATUS")
    public static final SqlColumn<String> status = jhsCommodityStock.status;

    /**
     * Database Column Remarks:
     *   数据版本 版本1 资产供应商产生的数据 版本2 外部供应商产生的数据
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.DATA_VERSION")
    public static final SqlColumn<Integer> dataVersion = jhsCommodityStock.dataVersion;

    /**
     * Database Column Remarks:
     *   增量时间标示
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.BI_DATE")
    public static final SqlColumn<Date> biDate = jhsCommodityStock.biDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    public static final class JhsCommodityStock extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityId = column("COMMODITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> commodityStandard = column("COMMODITY_STANDARD", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> num = column("NUM", JDBCType.DECIMAL);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("UPDATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastStorageTime = column("LAST_STORAGE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<String> status = column("STATUS", JDBCType.CHAR);

        public final SqlColumn<Integer> dataVersion = column("DATA_VERSION", JDBCType.INTEGER);

        public final SqlColumn<Date> biDate = column("BI_DATE", JDBCType.TIMESTAMP);

        public JhsCommodityStock() {
            super("JHS_COMMODITY_STOCK");
        }
    }
}