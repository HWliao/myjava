package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsSubjectDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    public static final JhsSubject jhsSubject = new JhsSubject();

    /**
     * Database Column Remarks:
     *   ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.ID")
    public static final SqlColumn<Integer> id = jhsSubject.id;

    /**
     * Database Column Remarks:
     *   类别名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_NAME")
    public static final SqlColumn<String> subName = jhsSubject.subName;

    /**
     * Database Column Remarks:
     *   类别父ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_PARENTID")
    public static final SqlColumn<Integer> subParentid = jhsSubject.subParentid;

    /**
     * Database Column Remarks:
     *   类别根ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_ROOTID")
    public static final SqlColumn<Integer> subRootid = jhsSubject.subRootid;

    /**
     * Database Column Remarks:
     *   关联树状
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_PATH")
    public static final SqlColumn<String> subPath = jhsSubject.subPath;

    /**
     * Database Column Remarks:
     *   简写
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_SPELL")
    public static final SqlColumn<String> subSpell = jhsSubject.subSpell;

    /**
     * Database Column Remarks:
     *   深度
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_DEPTH")
    public static final SqlColumn<Byte> subDepth = jhsSubject.subDepth;

    /**
     * Database Column Remarks:
     *   子节点个数
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_LEAF_NUM")
    public static final SqlColumn<Byte> subLeafNum = jhsSubject.subLeafNum;

    /**
     * Database Column Remarks:
     *   排序
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_ORDERING")
    public static final SqlColumn<Integer> subOrdering = jhsSubject.subOrdering;

    /**
     * Database Column Remarks:
     *   状态
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUB_STATE")
    public static final SqlColumn<String> subState = jhsSubject.subState;

    /**
     * Database Column Remarks:
     *   对应的供应商ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUPPLIER_ID")
    public static final SqlColumn<Integer> supplierId = jhsSubject.supplierId;

    /**
     * Database Column Remarks:
     *   供应商联系人
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUPPLIER_CONTACT")
    public static final SqlColumn<String> supplierContact = jhsSubject.supplierContact;

    /**
     * Database Column Remarks:
     *   供应商名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_SUBJECT.SUPPLIER_NAME")
    public static final SqlColumn<String> supplierName = jhsSubject.supplierName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    public static final class JhsSubject extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> subName = column("SUB_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> subParentid = column("SUB_PARENTID", JDBCType.INTEGER);

        public final SqlColumn<Integer> subRootid = column("SUB_ROOTID", JDBCType.INTEGER);

        public final SqlColumn<String> subPath = column("SUB_PATH", JDBCType.VARCHAR);

        public final SqlColumn<String> subSpell = column("SUB_SPELL", JDBCType.VARCHAR);

        public final SqlColumn<Byte> subDepth = column("SUB_DEPTH", JDBCType.TINYINT);

        public final SqlColumn<Byte> subLeafNum = column("SUB_LEAF_NUM", JDBCType.TINYINT);

        public final SqlColumn<Integer> subOrdering = column("SUB_ORDERING", JDBCType.INTEGER);

        public final SqlColumn<String> subState = column("SUB_STATE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> supplierId = column("SUPPLIER_ID", JDBCType.INTEGER);

        public final SqlColumn<String> supplierContact = column("SUPPLIER_CONTACT", JDBCType.VARCHAR);

        public final SqlColumn<String> supplierName = column("SUPPLIER_NAME", JDBCType.VARCHAR);

        public JhsSubject() {
            super("JHS_SUBJECT");
        }
    }
}