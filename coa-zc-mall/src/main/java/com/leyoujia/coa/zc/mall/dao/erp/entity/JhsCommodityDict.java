package com.leyoujia.coa.zc.mall.dao.erp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

/**
 * Database Table Remarks:
 *   商品分类字典表, (商品属性表)
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table JHS_COMMODITY_DICT
 */
public class JhsCommodityDict implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.ID")
    private Integer id;

    /**
     * Database Column Remarks:
     *   字典描述
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.DICTTEXT")
    private String dicttext;

    /**
     * Database Column Remarks:
     *   商品ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COMMODITYID")
    private Integer commodityid;

    /**
     * Database Column Remarks:
     *   数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COUNT")
    private Integer count;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.CREATETIME")
    private Date createtime;

    /**
     * Database Column Remarks:
     *   修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.UPDATETIME")
    private Date updatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.DICTTEXT")
    public String getDicttext() {
        return dicttext;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.DICTTEXT")
    public void setDicttext(String dicttext) {
        this.dicttext = dicttext;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COMMODITYID")
    public Integer getCommodityid() {
        return commodityid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COMMODITYID")
    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COUNT")
    public Integer getCount() {
        return count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.COUNT")
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.CREATETIME")
    public Date getCreatetime() {
        return createtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.CREATETIME")
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.UPDATETIME")
    public Date getUpdatetime() {
        return updatetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: JHS_COMMODITY_DICT.UPDATETIME")
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dicttext=").append(dicttext);
        sb.append(", commodityid=").append(commodityid);
        sb.append(", count=").append(count);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
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
        JhsCommodityDict other = (JhsCommodityDict) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDicttext() == null ? other.getDicttext() == null : this.getDicttext().equals(other.getDicttext()))
            && (this.getCommodityid() == null ? other.getCommodityid() == null : this.getCommodityid().equals(other.getCommodityid()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: JHS_COMMODITY_DICT")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDicttext() == null) ? 0 : getDicttext().hashCode());
        result = prime * result + ((getCommodityid() == null) ? 0 : getCommodityid().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }
}