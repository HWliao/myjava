package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityAreaDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    public static final JhsCommodityArea jhsCommodityArea = new JhsCommodityArea();

    /**
     * Database Column Remarks:
     *   自增主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_AREA.id")
    public static final SqlColumn<Integer> id = jhsCommodityArea.id;

    /**
     * Database Column Remarks:
     *   商品id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_AREA.commodity_id")
    public static final SqlColumn<Integer> commodityId = jhsCommodityArea.commodityId;

    /**
     * Database Column Remarks:
     *   省份编码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_AREA.province_code")
    public static final SqlColumn<String> provinceCode = jhsCommodityArea.provinceCode;

    /**
     * Database Column Remarks:
     *   省份
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_AREA.province_name")
    public static final SqlColumn<String> provinceName = jhsCommodityArea.provinceName;

    /**
     * Database Column Remarks:
     *   城市编码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_AREA.city_code")
    public static final SqlColumn<String> cityCode = jhsCommodityArea.cityCode;

    /**
     * Database Column Remarks:
     *   城市
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_AREA.city_name")
    public static final SqlColumn<String> cityName = jhsCommodityArea.cityName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_AREA")
    public static final class JhsCommodityArea extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> commodityId = column("commodity_id", JDBCType.INTEGER);

        public final SqlColumn<String> provinceCode = column("province_code", JDBCType.VARCHAR);

        public final SqlColumn<String> provinceName = column("province_name", JDBCType.VARCHAR);

        public final SqlColumn<String> cityCode = column("city_code", JDBCType.VARCHAR);

        public final SqlColumn<String> cityName = column("city_name", JDBCType.VARCHAR);

        public JhsCommodityArea() {
            super("JHS_COMMODITY_AREA");
        }
    }
}