package com.leyoujia.coa.zc.mall.dao.erp.auto;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JhsMedicalExaminerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    public static final JhsMedicalExaminer jhsMedicalExaminer = new JhsMedicalExaminer();

    /**
     * Database Column Remarks:
     *   自增主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.id")
    public static final SqlColumn<Integer> id = jhsMedicalExaminer.id;

    /**
     * Database Column Remarks:
     *   订单id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.order_id")
    public static final SqlColumn<Integer> orderId = jhsMedicalExaminer.orderId;

    /**
     * Database Column Remarks:
     *   体检人姓名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.examiner_name")
    public static final SqlColumn<String> examinerName = jhsMedicalExaminer.examinerName;

    /**
     * Database Column Remarks:
     *   体检人身份证号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.examiner_IDCard")
    public static final SqlColumn<String> examinerIdcard = jhsMedicalExaminer.examinerIdcard;

    /**
     * Database Column Remarks:
     *   电话号码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.phone_number")
    public static final SqlColumn<String> phoneNumber = jhsMedicalExaminer.phoneNumber;

    /**
     * Database Column Remarks:
     *   省份编号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.province_code")
    public static final SqlColumn<String> provinceCode = jhsMedicalExaminer.provinceCode;

    /**
     * Database Column Remarks:
     *   省份名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.province_name")
    public static final SqlColumn<String> provinceName = jhsMedicalExaminer.provinceName;

    /**
     * Database Column Remarks:
     *   城市编号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.city_code")
    public static final SqlColumn<String> cityCode = jhsMedicalExaminer.cityCode;

    /**
     * Database Column Remarks:
     *   城市名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_MEDICAL_EXAMINER.city_name")
    public static final SqlColumn<String> cityName = jhsMedicalExaminer.cityName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    public static final class JhsMedicalExaminer extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderId = column("order_id", JDBCType.INTEGER);

        public final SqlColumn<String> examinerName = column("examiner_name", JDBCType.VARCHAR);

        public final SqlColumn<String> examinerIdcard = column("examiner_IDCard", JDBCType.VARCHAR);

        public final SqlColumn<String> phoneNumber = column("phone_number", JDBCType.VARCHAR);

        public final SqlColumn<String> provinceCode = column("province_code", JDBCType.VARCHAR);

        public final SqlColumn<String> provinceName = column("province_name", JDBCType.VARCHAR);

        public final SqlColumn<String> cityCode = column("city_code", JDBCType.VARCHAR);

        public final SqlColumn<String> cityName = column("city_name", JDBCType.VARCHAR);

        public JhsMedicalExaminer() {
            super("JHS_MEDICAL_EXAMINER");
        }
    }
}