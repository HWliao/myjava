package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsGfgzSizeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    public static final JhsGfgzSize jhsGfgzSize = new JhsGfgzSize();

    /**
     * Database Column Remarks:
     *   ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.ID")
    public static final SqlColumn<Integer> id = jhsGfgzSize.id;

    /**
     * Database Column Remarks:
     *   公费工装类别
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.SUB_ID")
    public static final SqlColumn<Integer> subId = jhsGfgzSize.subId;

    /**
     * Database Column Remarks:
     *   公费工装类别名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.SUB_NAME")
    public static final SqlColumn<String> subName = jhsGfgzSize.subName;

    /**
     * Database Column Remarks:
     *   类别 1.男上衣，2.男裤，3.领带，4.女上衣，5.女裤，6.女裙
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.TYPE")
    public static final SqlColumn<Integer> type = jhsGfgzSize.type;

    /**
     * Database Column Remarks:
     *   类别名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.TYPE_NAME")
    public static final SqlColumn<String> typeName = jhsGfgzSize.typeName;

    /**
     * Database Column Remarks:
     *   尺码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.SIZE")
    public static final SqlColumn<String> size = jhsGfgzSize.size;

    /**
     * Database Column Remarks:
     *   数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_GFGZ_SIZE.TOTAL")
    public static final SqlColumn<Integer> total = jhsGfgzSize.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_GFGZ_SIZE")
    public static final class JhsGfgzSize extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> subId = column("SUB_ID", JDBCType.INTEGER);

        public final SqlColumn<String> subName = column("SUB_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("TYPE", JDBCType.INTEGER);

        public final SqlColumn<String> typeName = column("TYPE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> size = column("SIZE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> total = column("TOTAL", JDBCType.INTEGER);

        public JhsGfgzSize() {
            super("JHS_GFGZ_SIZE");
        }
    }
}