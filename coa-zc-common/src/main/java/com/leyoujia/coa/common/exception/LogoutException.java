package com.leyoujia.coa.common.exception;

import com.leyoujia.coa.zc.client.exception.ComException;

/**
 * 登出异常
 *
 * @author lhw
 * @date 2019/7/20
 */
public class LogoutException extends ComException {
  private static final long serialVersionUID = -5672393736680777623L;

  public LogoutException() {
  }

  public LogoutException(String message) {
    super(message);
  }

  public LogoutException(String message, Throwable cause) {
    super(message, cause);
  }

  public LogoutException(Throwable cause) {
    super(cause);
  }

  public LogoutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
