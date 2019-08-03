package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsBranchCostLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    public static final JhsBranchCostLog jhsBranchCostLog = new JhsBranchCostLog();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.ID")
    public static final SqlColumn<Integer> id = jhsBranchCostLog.id;

    /**
     * Database Column Remarks:
     *   订单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.ORDER_ID")
    public static final SqlColumn<Integer> orderId = jhsBranchCostLog.orderId;

    /**
     * Database Column Remarks:
     *   操作记录
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.OPERTATION_LOG")
    public static final SqlColumn<String> opertationLog = jhsBranchCostLog.opertationLog;

    /**
     * Database Column Remarks:
     *   状态 -1 无效 0 未进行处理 1 已经生成分行成本数据 2 进行了离职代扣以及分行成本扣减 3 购买人在职满三个月了不用再出来了
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.STATUS")
    public static final SqlColumn<String> status = jhsBranchCostLog.status;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.CREATE_DATE")
    public static final SqlColumn<Date> createDate = jhsBranchCostLog.createDate;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.UPDATE_DATE")
    public static final SqlColumn<Date> updateDate = jhsBranchCostLog.updateDate;

    /**
     * Database Column Remarks:
     *   时间戳标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_BRANCH_COST_LOG.BI_DATE")
    public static final SqlColumn<Date> biDate = jhsBranchCostLog.biDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_BRANCH_COST_LOG")
    public static final class JhsBranchCostLog extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderId = column("ORDER_ID", JDBCType.INTEGER);

        public final SqlColumn<String> opertationLog = column("OPERTATION_LOG", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("STATUS", JDBCType.CHAR);

        public final SqlColumn<Date> createDate = column("CREATE_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateDate = column("UPDATE_DATE", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> biDate = column("BI_DATE", JDBCType.TIMESTAMP);

        public JhsBranchCostLog() {
            super("JHS_BRANCH_COST_LOG");
        }
    }
}