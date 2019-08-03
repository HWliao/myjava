package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsUnitedCommodityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    public static final JhsUnitedCommodity jhsUnitedCommodity = new JhsUnitedCommodity();

    /**
     * Database Column Remarks:
     *   主键ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.ID")
    public static final SqlColumn<Integer> id = jhsUnitedCommodity.id;

    /**
     * Database Column Remarks:
     *   父商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.COMMODITY_PID")
    public static final SqlColumn<Integer> commodityPid = jhsUnitedCommodity.commodityPid;

    /**
     * Database Column Remarks:
     *   子商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.COMMODITY_SID")
    public static final SqlColumn<Integer> commoditySid = jhsUnitedCommodity.commoditySid;

    /**
     * Database Column Remarks:
     *   公费自费类别 0 公费自费 1 仅公费 2 仅自费
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.TYPE")
    public static final SqlColumn<String> type = jhsUnitedCommodity.type;

    /**
     * Database Column Remarks:
     *   唯一性标识,具有相同标识子商品只能购买一个,空或者空字符串不做判断
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.ONLY_ONE")
    public static final SqlColumn<String> onlyOne = jhsUnitedCommodity.onlyOne;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.CREATE_TIME")
    public static final SqlColumn<Date> createTime = jhsUnitedCommodity.createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_UNITED_COMMODITY.UPDATE_TIME")
    public static final SqlColumn<Date> updateTime = jhsUnitedCommodity.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_UNITED_COMMODITY")
    public static final class JhsUnitedCommodity extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityPid = column("COMMODITY_PID", JDBCType.INTEGER);

        public final SqlColumn<Integer> commoditySid = column("COMMODITY_SID", JDBCType.INTEGER);

        public final SqlColumn<String> type = column("TYPE", JDBCType.CHAR);

        public final SqlColumn<String> onlyOne = column("ONLY_ONE", JDBCType.CHAR);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("UPDATE_TIME", JDBCType.TIMESTAMP);

        public JhsUnitedCommodity() {
            super("JHS_UNITED_COMMODITY");
        }
    }
}