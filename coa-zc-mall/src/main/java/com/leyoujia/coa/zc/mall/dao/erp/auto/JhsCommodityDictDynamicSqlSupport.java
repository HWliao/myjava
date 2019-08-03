package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityDictDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    public static final JhsCommodityDict jhsCommodityDict = new JhsCommodityDict();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.ID")
    public static final SqlColumn<Integer> id = jhsCommodityDict.id;

    /**
     * Database Column Remarks:
     *   字典描述
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.DICTTEXT")
    public static final SqlColumn<String> dicttext = jhsCommodityDict.dicttext;

    /**
     * Database Column Remarks:
     *   商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COMMODITYID")
    public static final SqlColumn<Integer> commodityid = jhsCommodityDict.commodityid;

    /**
     * Database Column Remarks:
     *   数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COUNT")
    public static final SqlColumn<Integer> count = jhsCommodityDict.count;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.CREATETIME")
    public static final SqlColumn<Date> createtime = jhsCommodityDict.createtime;

    /**
     * Database Column Remarks:
     *   修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.UPDATETIME")
    public static final SqlColumn<Date> updatetime = jhsCommodityDict.updatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    public static final class JhsCommodityDict extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> dicttext = column("DICTTEXT", JDBCType.VARCHAR);

        public final SqlColumn<Integer> commodityid = column("COMMODITYID", JDBCType.INTEGER);

        public final SqlColumn<Integer> count = column("COUNT", JDBCType.INTEGER);

        public final SqlColumn<Date> createtime = column("CREATETIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatetime = column("UPDATETIME", JDBCType.TIMESTAMP);

        public JhsCommodityDict() {
            super("JHS_COMMODITY_DICT");
        }
    }
}