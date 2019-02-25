package com.myjava.demo.intergrate.tyc.model;

import java.io.Serializable;
import java.util.List;

/**
 * 公司信息
 *
 * @author lhw
 * @date 2019/2/25
 */
public class Company implements Serializable {
  private static final long serialVersionUID = -2691653499148089197L;
  /**
   * 更新时间
   */
  private Long updatetime;
  /**
   * 经营开始时间
   */
  private Long fromTime;
  /**
   * 法人类型，1 人 2 公司
   */
  private Integer type;
  /**
   * 行业分数
   */
  private Long categoryScore;
  /**
   * 公司id
   */
  private Long id;
  /**
   * 注册号
   */
  private String regNumber;
  /**
   * 企业评分
   */
  private Long percentileScore;
  /**
   * 注册资金
   */
  private String regCapital;
  /**
   * 登记机关
   */
  private String regInstitute;
  /**
   * 公司名
   */
  private String name;
  /**
   * 注册地址
   */
  private String regLocation;
  /**
   * 行业
   */
  private String industry;
  /**
   * 核准时间
   */
  private Long approvedTime;
  /**
   * 公司logo
   */
  private String logo;
  /**
   * 核准机构
   */
  private String orgApprovedInstitute;
  /**
   * 纳税人识别号
   */
  private String taxNumber;
  /**
   * 经营范围
   */
  private String businessScope;
  /**
   * 纳税人识别号（弃用）
   */
  private String property4;
  /**
   * 英文名
   */
  private String property3;
  /**
   * 组织机构代码
   */
  private String orgNumber;
  /**
   * 经营状态
   */
  private String regStatus;
  /**
   * 成立日期
   */
  private Long estiblishTime;
  /**
   * 法人
   */
  private String legalPersonName;
  /**
   * 经营结束时间
   */
  private Long toTime;
  /**
   * 法人id
   */
  private Long legalPersonId;
  /**
   * 来源
   */
  private String sourceFlag;
  private String actualCapital;
  /**
   * 0-显示 1-不显示（弃用）
   */
  private Integer flag;
  /**
   * 新公司名id
   */
  private String correctCompanyId;
  /**
   * 公司类型
   */
  private String companyOrgType;
  /**
   * 省份简称
   */
  private String base;
  /**
   * 更新时间
   */
  private Long updateTimes;
  private Integer companyType;
  /**
   * 社会统一信用代码
   */
  private String creditCode;
  /**
   * 表对应id
   */
  private Long companyId;
  /**
   * 股东列表
   */
  private List<Holder> holderlist;

  public Long getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Long updatetime) {
    this.updatetime = updatetime;
  }

  public Long getFromTime() {
    return fromTime;
  }

  public void setFromTime(Long fromTime) {
    this.fromTime = fromTime;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Long getCategoryScore() {
    return categoryScore;
  }

  public void setCategoryScore(Long categoryScore) {
    this.categoryScore = categoryScore;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  public Long getPercentileScore() {
    return percentileScore;
  }

  public void setPercentileScore(Long percentileScore) {
    this.percentileScore = percentileScore;
  }

  public String getRegCapital() {
    return regCapital;
  }

  public void setRegCapital(String regCapital) {
    this.regCapital = regCapital;
  }

  public String getRegInstitute() {
    return regInstitute;
  }

  public void setRegInstitute(String regInstitute) {
    this.regInstitute = regInstitute;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegLocation() {
    return regLocation;
  }

  public void setRegLocation(String regLocation) {
    this.regLocation = regLocation;
  }

  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public Long getApprovedTime() {
    return approvedTime;
  }

  public void setApprovedTime(Long approvedTime) {
    this.approvedTime = approvedTime;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getOrgApprovedInstitute() {
    return orgApprovedInstitute;
  }

  public void setOrgApprovedInstitute(String orgApprovedInstitute) {
    this.orgApprovedInstitute = orgApprovedInstitute;
  }

  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public String getBusinessScope() {
    return businessScope;
  }

  public void setBusinessScope(String businessScope) {
    this.businessScope = businessScope;
  }

  public String getProperty4() {
    return property4;
  }

  public void setProperty4(String property4) {
    this.property4 = property4;
  }

  public String getProperty3() {
    return property3;
  }

  public void setProperty3(String property3) {
    this.property3 = property3;
  }

  public String getOrgNumber() {
    return orgNumber;
  }

  public void setOrgNumber(String orgNumber) {
    this.orgNumber = orgNumber;
  }

  public String getRegStatus() {
    return regStatus;
  }

  public void setRegStatus(String regStatus) {
    this.regStatus = regStatus;
  }

  public Long getEstiblishTime() {
    return estiblishTime;
  }

  public void setEstiblishTime(Long estiblishTime) {
    this.estiblishTime = estiblishTime;
  }

  public String getLegalPersonName() {
    return legalPersonName;
  }

  public void setLegalPersonName(String legalPersonName) {
    this.legalPersonName = legalPersonName;
  }

  public Long getToTime() {
    return toTime;
  }

  public void setToTime(Long toTime) {
    this.toTime = toTime;
  }

  public Long getLegalPersonId() {
    return legalPersonId;
  }

  public void setLegalPersonId(Long legalPersonId) {
    this.legalPersonId = legalPersonId;
  }

  public String getSourceFlag() {
    return sourceFlag;
  }

  public void setSourceFlag(String sourceFlag) {
    this.sourceFlag = sourceFlag;
  }

  public String getActualCapital() {
    return actualCapital;
  }

  public void setActualCapital(String actualCapital) {
    this.actualCapital = actualCapital;
  }

  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public String getCorrectCompanyId() {
    return correctCompanyId;
  }

  public void setCorrectCompanyId(String correctCompanyId) {
    this.correctCompanyId = correctCompanyId;
  }

  public String getCompanyOrgType() {
    return companyOrgType;
  }

  public void setCompanyOrgType(String companyOrgType) {
    this.companyOrgType = companyOrgType;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public Long getUpdateTimes() {
    return updateTimes;
  }

  public void setUpdateTimes(Long updateTimes) {
    this.updateTimes = updateTimes;
  }

  public Integer getCompanyType() {
    return companyType;
  }

  public void setCompanyType(Integer companyType) {
    this.companyType = companyType;
  }

  public String getCreditCode() {
    return creditCode;
  }

  public void setCreditCode(String creditCode) {
    this.creditCode = creditCode;
  }

  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }

  public List<Holder> getHolderlist() {
    return holderlist;
  }

  public void setHolderlist(List<Holder> holderlist) {
    this.holderlist = holderlist;
  }
}
