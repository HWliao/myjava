package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsMedicalExaminerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsMedicalExaminer;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface IJhsMedicalExaminerAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsMedicalExaminer> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsMedicalExaminerResult")
    JhsMedicalExaminer selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsMedicalExaminerResult")
    List<JhsMedicalExaminer> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default Function<SelectStatementProvider, List<JhsMedicalExaminer>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsMedicalExaminerResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="examiner_name", property="examinerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="examiner_IDCard", property="examinerIdcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_name", property="provinceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR)
    })
    List<JhsMedicalExaminer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsMedicalExaminer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsMedicalExaminer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsMedicalExaminer)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default int insert(JhsMedicalExaminer record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsMedicalExaminer)
                .map(orderId).toProperty("orderId")
                .map(examinerName).toProperty("examinerName")
                .map(examinerIdcard).toProperty("examinerIdcard")
                .map(phoneNumber).toProperty("phoneNumber")
                .map(provinceCode).toProperty("provinceCode")
                .map(provinceName).toProperty("provinceName")
                .map(cityCode).toProperty("cityCode")
                .map(cityName).toProperty("cityName")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default int insertSelective(JhsMedicalExaminer record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsMedicalExaminer)
                .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
                .map(examinerName).toPropertyWhenPresent("examinerName", record::getExaminerName)
                .map(examinerIdcard).toPropertyWhenPresent("examinerIdcard", record::getExaminerIdcard)
                .map(phoneNumber).toPropertyWhenPresent("phoneNumber", record::getPhoneNumber)
                .map(provinceCode).toPropertyWhenPresent("provinceCode", record::getProvinceCode)
                .map(provinceName).toPropertyWhenPresent("provinceName", record::getProvinceName)
                .map(cityCode).toPropertyWhenPresent("cityCode", record::getCityCode)
                .map(cityName).toPropertyWhenPresent("cityName", record::getCityName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsMedicalExaminer>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, orderId, examinerName, examinerIdcard, phoneNumber, provinceCode, provinceName, cityCode, cityName)
                .from(jhsMedicalExaminer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsMedicalExaminer>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderId, examinerName, examinerIdcard, phoneNumber, provinceCode, provinceName, cityCode, cityName)
                .from(jhsMedicalExaminer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsMedicalExaminer>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, orderId, examinerName, examinerIdcard, phoneNumber, provinceCode, provinceName, cityCode, cityName)
                .from(jhsMedicalExaminer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsMedicalExaminer>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderId, examinerName, examinerIdcard, phoneNumber, provinceCode, provinceName, cityCode, cityName)
                .from(jhsMedicalExaminer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default JhsMedicalExaminer selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, orderId, examinerName, examinerIdcard, phoneNumber, provinceCode, provinceName, cityCode, cityName)
                .from(jhsMedicalExaminer)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsMedicalExaminer record) {
        return UpdateDSL.updateWithMapper(this::update, jhsMedicalExaminer)
                .set(orderId).equalTo(record::getOrderId)
                .set(examinerName).equalTo(record::getExaminerName)
                .set(examinerIdcard).equalTo(record::getExaminerIdcard)
                .set(phoneNumber).equalTo(record::getPhoneNumber)
                .set(provinceCode).equalTo(record::getProvinceCode)
                .set(provinceName).equalTo(record::getProvinceName)
                .set(cityCode).equalTo(record::getCityCode)
                .set(cityName).equalTo(record::getCityName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsMedicalExaminer record) {
        return UpdateDSL.updateWithMapper(this::update, jhsMedicalExaminer)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(examinerName).equalToWhenPresent(record::getExaminerName)
                .set(examinerIdcard).equalToWhenPresent(record::getExaminerIdcard)
                .set(phoneNumber).equalToWhenPresent(record::getPhoneNumber)
                .set(provinceCode).equalToWhenPresent(record::getProvinceCode)
                .set(provinceName).equalToWhenPresent(record::getProvinceName)
                .set(cityCode).equalToWhenPresent(record::getCityCode)
                .set(cityName).equalToWhenPresent(record::getCityName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default int updateByPrimaryKey(JhsMedicalExaminer record) {
        return UpdateDSL.updateWithMapper(this::update, jhsMedicalExaminer)
                .set(orderId).equalTo(record::getOrderId)
                .set(examinerName).equalTo(record::getExaminerName)
                .set(examinerIdcard).equalTo(record::getExaminerIdcard)
                .set(phoneNumber).equalTo(record::getPhoneNumber)
                .set(provinceCode).equalTo(record::getProvinceCode)
                .set(provinceName).equalTo(record::getProvinceName)
                .set(cityCode).equalTo(record::getCityCode)
                .set(cityName).equalTo(record::getCityName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_MEDICAL_EXAMINER")
    default int updateByPrimaryKeySelective(JhsMedicalExaminer record) {
        return UpdateDSL.updateWithMapper(this::update, jhsMedicalExaminer)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(examinerName).equalToWhenPresent(record::getExaminerName)
                .set(examinerIdcard).equalToWhenPresent(record::getExaminerIdcard)
                .set(phoneNumber).equalToWhenPresent(record::getPhoneNumber)
                .set(provinceCode).equalToWhenPresent(record::getProvinceCode)
                .set(provinceName).equalToWhenPresent(record::getProvinceName)
                .set(cityCode).equalToWhenPresent(record::getCityCode)
                .set(cityName).equalToWhenPresent(record::getCityName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}