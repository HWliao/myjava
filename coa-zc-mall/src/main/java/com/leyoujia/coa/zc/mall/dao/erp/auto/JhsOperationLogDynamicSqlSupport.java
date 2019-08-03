package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsOperationLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    public static final JhsOperationLog jhsOperationLog = new JhsOperationLog();

    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.ID")
    public static final SqlColumn<Integer> id = jhsOperationLog.id;

    /**
     * Database Column Remarks:
     *   业务类型 1 商城订单
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.BUS_TYPE")
    public static final SqlColumn<Integer> busType = jhsOperationLog.busType;

    /**
     * Database Column Remarks:
     *   业务id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.BUS_ID")
    public static final SqlColumn<Integer> busId = jhsOperationLog.busId;

    /**
     * Database Column Remarks:
     *   操作类型
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.OP_TYPE")
    public static final SqlColumn<String> opType = jhsOperationLog.opType;

    /**
     * Database Column Remarks:
     *   操作内容
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.OP_CONTENT")
    public static final SqlColumn<String> opContent = jhsOperationLog.opContent;

    /**
     * Database Column Remarks:
     *   操作人id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.OP_WORKER_ID")
    public static final SqlColumn<String> opWorkerId = jhsOperationLog.opWorkerId;

    /**
     * Database Column Remarks:
     *   操作人名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.OP_WORKER_NAME")
    public static final SqlColumn<String> opWorkerName = jhsOperationLog.opWorkerName;

    /**
     * Database Column Remarks:
     *   状态 0 无效 1 有效
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.STATUS")
    public static final SqlColumn<Integer> status = jhsOperationLog.status;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.CREATE_TIME")
    public static final SqlColumn<Date> createTime = jhsOperationLog.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.EXTRA1")
    public static final SqlColumn<String> extra1 = jhsOperationLog.extra1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_OPERATION_LOG.EXTRA2")
    public static final SqlColumn<String> extra2 = jhsOperationLog.extra2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_OPERATION_LOG")
    public static final class JhsOperationLog extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> busType = column("BUS_TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> busId = column("BUS_ID", JDBCType.INTEGER);

        public final SqlColumn<String> opType = column("OP_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> opContent = column("OP_CONTENT", JDBCType.VARCHAR);

        public final SqlColumn<String> opWorkerId = column("OP_WORKER_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> opWorkerName = column("OP_WORKER_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("STATUS", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<String> extra1 = column("EXTRA1", JDBCType.VARCHAR);

        public final SqlColumn<String> extra2 = column("EXTRA2", JDBCType.VARCHAR);

        public JhsOperationLog() {
            super("JHS_OPERATION_LOG");
        }
    }
}