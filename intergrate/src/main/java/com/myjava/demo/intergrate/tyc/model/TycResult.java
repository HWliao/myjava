package com.myjava.demo.intergrate.tyc.model;

import java.io.Serializable;

/**
 * 天延长结果集
 *
 * @author lhw
 * @date 2019/2/25
 */
public class TycResult implements Serializable {
  private static final long serialVersionUID = 2438289833140954249L;

  /**
   * 错误码
   */
  private Long errorCode;
  /**
   * 错误原因
   */
  private String reason;
  /**
   * 结果
   */
  private Company result;

  public Long getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Company getResult() {
    return result;
  }

  public void setResult(Company result) {
    this.result = result;
  }
}
