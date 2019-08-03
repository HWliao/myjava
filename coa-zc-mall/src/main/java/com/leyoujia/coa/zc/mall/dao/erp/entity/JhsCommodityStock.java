package com.leyoujia.coa.zc.mall.dao.erp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

/**
 * Database Table Remarks:
 *   聚划算商品库存表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table JHS_COMMODITY_STOCK
 */
public class JhsCommodityStock implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.ID")
    private Integer id;

    /**
     * Database Column Remarks:
     *   商品id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_ID")
    private Integer commodityId;

    /**
     * Database Column Remarks:
     *   商品规格 对应 商品的分类数据
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_STANDARD")
    private String commodityStandard;

    /**
     * Database Column Remarks:
     *   库存数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.NUM")
    private BigDecimal num;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.CREATE_TIME")
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.UPDATE_TIME")
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   最后一次入库时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.LAST_STORAGE_TIME")
    private Date lastStorageTime;

    /**
     * Database Column Remarks:
     *   数据状态 0 无效 1 有效
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.STATUS")
    private String status;

    /**
     * Database Column Remarks:
     *   数据版本 版本1 资产供应商产生的数据 版本2 外部供应商产生的数据
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.DATA_VERSION")
    private Integer dataVersion;

    /**
     * Database Column Remarks:
     *   增量时间标示
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.BI_DATE")
    private Date biDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_ID")
    public Integer getCommodityId() {
        return commodityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_ID")
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_STANDARD")
    public String getCommodityStandard() {
        return commodityStandard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.COMMODITY_STANDARD")
    public void setCommodityStandard(String commodityStandard) {
        this.commodityStandard = commodityStandard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.NUM")
    public BigDecimal getNum() {
        return num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.NUM")
    public void setNum(BigDecimal num) {
        this.num = num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.CREATE_TIME")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.UPDATE_TIME")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.LAST_STORAGE_TIME")
    public Date getLastStorageTime() {
        return lastStorageTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.LAST_STORAGE_TIME")
    public void setLastStorageTime(Date lastStorageTime) {
        this.lastStorageTime = lastStorageTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.STATUS")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.STATUS")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.DATA_VERSION")
    public Integer getDataVersion() {
        return dataVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.DATA_VERSION")
    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.BI_DATE")
    public Date getBiDate() {
        return biDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_STOCK.BI_DATE")
    public void setBiDate(Date biDate) {
        this.biDate = biDate;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", commodityStandard=").append(commodityStandard);
        sb.append(", num=").append(num);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", lastStorageTime=").append(lastStorageTime);
        sb.append(", status=").append(status);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", biDate=").append(biDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        JhsCommodityStock other = (JhsCommodityStock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommodityId() == null ? other.getCommodityId() == null : this.getCommodityId().equals(other.getCommodityId()))
            && (this.getCommodityStandard() == null ? other.getCommodityStandard() == null : this.getCommodityStandard().equals(other.getCommodityStandard()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getLastStorageTime() == null ? other.getLastStorageTime() == null : this.getLastStorageTime().equals(other.getLastStorageTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDataVersion() == null ? other.getDataVersion() == null : this.getDataVersion().equals(other.getDataVersion()))
            && (this.getBiDate() == null ? other.getBiDate() == null : this.getBiDate().equals(other.getBiDate()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_STOCK")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommodityId() == null) ? 0 : getCommodityId().hashCode());
        result = prime * result + ((getCommodityStandard() == null) ? 0 : getCommodityStandard().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLastStorageTime() == null) ? 0 : getLastStorageTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDataVersion() == null) ? 0 : getDataVersion().hashCode());
        result = prime * result + ((getBiDate() == null) ? 0 : getBiDate().hashCode());
        return result;
    }
}