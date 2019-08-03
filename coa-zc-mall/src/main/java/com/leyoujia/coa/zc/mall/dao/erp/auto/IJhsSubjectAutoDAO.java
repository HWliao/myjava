package com.leyoujia.coa.zc.mall.dao.erp.auto;

import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsSubjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsSubject;
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
public interface IJhsSubjectAutoDAO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<JhsSubject> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsSubjectResult")
    JhsSubject selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("JhsSubjectResult")
    List<JhsSubject> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default Function<SelectStatementProvider, List<JhsSubject>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JhsSubjectResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SUB_NAME", property="subName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUB_PARENTID", property="subParentid", jdbcType=JdbcType.INTEGER),
        @Result(column="SUB_ROOTID", property="subRootid", jdbcType=JdbcType.INTEGER),
        @Result(column="SUB_PATH", property="subPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUB_SPELL", property="subSpell", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUB_DEPTH", property="subDepth", jdbcType=JdbcType.TINYINT),
        @Result(column="SUB_LEAF_NUM", property="subLeafNum", jdbcType=JdbcType.TINYINT),
        @Result(column="SUB_ORDERING", property="subOrdering", jdbcType=JdbcType.INTEGER),
        @Result(column="SUB_STATE", property="subState", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUPPLIER_ID", property="supplierId", jdbcType=JdbcType.INTEGER),
        @Result(column="SUPPLIER_CONTACT", property="supplierContact", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUPPLIER_NAME", property="supplierName", jdbcType=JdbcType.VARCHAR)
    })
    List<JhsSubject> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jhsSubject);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsSubject);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, jhsSubject)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default int insert(JhsSubject record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsSubject)
                .map(subName).toProperty("subName")
                .map(subParentid).toProperty("subParentid")
                .map(subRootid).toProperty("subRootid")
                .map(subPath).toProperty("subPath")
                .map(subSpell).toProperty("subSpell")
                .map(subDepth).toProperty("subDepth")
                .map(subLeafNum).toProperty("subLeafNum")
                .map(subOrdering).toProperty("subOrdering")
                .map(subState).toProperty("subState")
                .map(supplierId).toProperty("supplierId")
                .map(supplierContact).toProperty("supplierContact")
                .map(supplierName).toProperty("supplierName")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default int insertSelective(JhsSubject record) {
        return insert(SqlBuilder.insert(record)
                .into(jhsSubject)
                .map(subName).toPropertyWhenPresent("subName", record::getSubName)
                .map(subParentid).toPropertyWhenPresent("subParentid", record::getSubParentid)
                .map(subRootid).toPropertyWhenPresent("subRootid", record::getSubRootid)
                .map(subPath).toPropertyWhenPresent("subPath", record::getSubPath)
                .map(subSpell).toPropertyWhenPresent("subSpell", record::getSubSpell)
                .map(subDepth).toPropertyWhenPresent("subDepth", record::getSubDepth)
                .map(subLeafNum).toPropertyWhenPresent("subLeafNum", record::getSubLeafNum)
                .map(subOrdering).toPropertyWhenPresent("subOrdering", record::getSubOrdering)
                .map(subState).toPropertyWhenPresent("subState", record::getSubState)
                .map(supplierId).toPropertyWhenPresent("supplierId", record::getSupplierId)
                .map(supplierContact).toPropertyWhenPresent("supplierContact", record::getSupplierContact)
                .map(supplierName).toPropertyWhenPresent("supplierName", record::getSupplierName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsSubject>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, subName, subParentid, subRootid, subPath, subSpell, subDepth, subLeafNum, subOrdering, subState, supplierId, supplierContact, supplierName)
                .from(jhsSubject);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsSubject>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, subName, subParentid, subRootid, subPath, subSpell, subDepth, subLeafNum, subOrdering, subState, supplierId, supplierContact, supplierName)
                .from(jhsSubject);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsSubject>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, subName, subParentid, subRootid, subPath, subSpell, subDepth, subLeafNum, subOrdering, subState, supplierId, supplierContact, supplierName)
                .from(jhsSubject);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<JhsSubject>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, subName, subParentid, subRootid, subPath, subSpell, subDepth, subLeafNum, subOrdering, subState, supplierId, supplierContact, supplierName)
                .from(jhsSubject);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default JhsSubject selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, subName, subParentid, subRootid, subPath, subSpell, subDepth, subLeafNum, subOrdering, subState, supplierId, supplierContact, supplierName)
                .from(jhsSubject)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(JhsSubject record) {
        return UpdateDSL.updateWithMapper(this::update, jhsSubject)
                .set(subName).equalTo(record::getSubName)
                .set(subParentid).equalTo(record::getSubParentid)
                .set(subRootid).equalTo(record::getSubRootid)
                .set(subPath).equalTo(record::getSubPath)
                .set(subSpell).equalTo(record::getSubSpell)
                .set(subDepth).equalTo(record::getSubDepth)
                .set(subLeafNum).equalTo(record::getSubLeafNum)
                .set(subOrdering).equalTo(record::getSubOrdering)
                .set(subState).equalTo(record::getSubState)
                .set(supplierId).equalTo(record::getSupplierId)
                .set(supplierContact).equalTo(record::getSupplierContact)
                .set(supplierName).equalTo(record::getSupplierName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(JhsSubject record) {
        return UpdateDSL.updateWithMapper(this::update, jhsSubject)
                .set(subName).equalToWhenPresent(record::getSubName)
                .set(subParentid).equalToWhenPresent(record::getSubParentid)
                .set(subRootid).equalToWhenPresent(record::getSubRootid)
                .set(subPath).equalToWhenPresent(record::getSubPath)
                .set(subSpell).equalToWhenPresent(record::getSubSpell)
                .set(subDepth).equalToWhenPresent(record::getSubDepth)
                .set(subLeafNum).equalToWhenPresent(record::getSubLeafNum)
                .set(subOrdering).equalToWhenPresent(record::getSubOrdering)
                .set(subState).equalToWhenPresent(record::getSubState)
                .set(supplierId).equalToWhenPresent(record::getSupplierId)
                .set(supplierContact).equalToWhenPresent(record::getSupplierContact)
                .set(supplierName).equalToWhenPresent(record::getSupplierName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default int updateByPrimaryKey(JhsSubject record) {
        return UpdateDSL.updateWithMapper(this::update, jhsSubject)
                .set(subName).equalTo(record::getSubName)
                .set(subParentid).equalTo(record::getSubParentid)
                .set(subRootid).equalTo(record::getSubRootid)
                .set(subPath).equalTo(record::getSubPath)
                .set(subSpell).equalTo(record::getSubSpell)
                .set(subDepth).equalTo(record::getSubDepth)
                .set(subLeafNum).equalTo(record::getSubLeafNum)
                .set(subOrdering).equalTo(record::getSubOrdering)
                .set(subState).equalTo(record::getSubState)
                .set(supplierId).equalTo(record::getSupplierId)
                .set(supplierContact).equalTo(record::getSupplierContact)
                .set(supplierName).equalTo(record::getSupplierName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_SUBJECT")
    default int updateByPrimaryKeySelective(JhsSubject record) {
        return UpdateDSL.updateWithMapper(this::update, jhsSubject)
                .set(subName).equalToWhenPresent(record::getSubName)
                .set(subParentid).equalToWhenPresent(record::getSubParentid)
                .set(subRootid).equalToWhenPresent(record::getSubRootid)
                .set(subPath).equalToWhenPresent(record::getSubPath)
                .set(subSpell).equalToWhenPresent(record::getSubSpell)
                .set(subDepth).equalToWhenPresent(record::getSubDepth)
                .set(subLeafNum).equalToWhenPresent(record::getSubLeafNum)
                .set(subOrdering).equalToWhenPresent(record::getSubOrdering)
                .set(subState).equalToWhenPresent(record::getSubState)
                .set(supplierId).equalToWhenPresent(record::getSupplierId)
                .set(supplierContact).equalToWhenPresent(record::getSupplierContact)
                .set(supplierName).equalToWhenPresent(record::getSupplierName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}