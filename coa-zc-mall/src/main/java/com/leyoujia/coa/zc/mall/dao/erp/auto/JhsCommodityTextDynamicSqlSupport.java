package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsCommodityTextDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    public static final JhsCommodityText jhsCommodityText = new JhsCommodityText();

    /**
     * Database Column Remarks:
     *   id.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_TEXT.ID")
    public static final SqlColumn<Integer> id = jhsCommodityText.id;

    /**
     * Database Column Remarks:
     *   类型.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_TEXT.TYPE")
    public static final SqlColumn<Integer> type = jhsCommodityText.type;

    /**
     * Database Column Remarks:
     *   关联数据id.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_TEXT.ATTACH_ID")
    public static final SqlColumn<Integer> attachId = jhsCommodityText.attachId;

    /**
     * Database Column Remarks:
     *   正文内容.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_TEXT.CONTENT")
    public static final SqlColumn<String> content = jhsCommodityText.content;

    /**
     * Database Column Remarks:
     *   扩展字段.
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_TEXT.EXT")
    public static final SqlColumn<String> ext = jhsCommodityText.ext;

    /**
     * Database Column Remarks:
     *   使用说明
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_TEXT.MANUAL")
    public static final SqlColumn<String> manual = jhsCommodityText.manual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_TEXT")
    public static final class JhsCommodityText extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> attachId = column("ATTACH_ID", JDBCType.INTEGER);

        public final SqlColumn<String> content = column("CONTENT", JDBCType.VARCHAR);

        public final SqlColumn<String> ext = column("EXT", JDBCType.VARCHAR);

        public final SqlColumn<String> manual = column("MANUAL", JDBCType.VARCHAR);

        public JhsCommodityText() {
            super("JHS_COMMODITY_TEXT");
        }
    }
}