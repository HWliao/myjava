package com.leyoujia.coa.zc.client.exception;

/**
 * 常规异常
 *
 * @author lhw
 * @date 2019/7/20
 */
public class ComException extends RuntimeException {
  private static final long serialVersionUID = 3355696185720076629L;

  public ComException() {
  }

  public ComException(String message) {
    super(message);
  }

  public ComException(String message, Throwable cause) {
    super(message, cause);
  }

  public ComException(Throwable cause) {
    super(cause);
  }

  public ComException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
