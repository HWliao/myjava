package com.leyoujia.coa.zc.client.exception;

/**
 * 业务异常 业务条件不满足时抛出的异常
 *
 * @author lhw
 * @date 2019/7/20
 */
public class BusinessException extends ComException {
  private static final long serialVersionUID = -627230169946547365L;

  public BusinessException() {
  }

  public BusinessException(String message) {
    super(message);
  }

  public BusinessException(String message, Throwable cause) {
    super(message, cause);
  }

  public BusinessException(Throwable cause) {
    super(cause);
  }

  public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
