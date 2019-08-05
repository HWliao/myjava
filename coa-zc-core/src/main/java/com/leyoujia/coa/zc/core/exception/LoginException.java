package com.leyoujia.coa.zc.core.exception;

/**
 * 登录鉴权异常
 *
 * @author lhw
 * @date 2019/8/5
 */
public class LoginException extends RuntimeException {
  private static final long serialVersionUID = 9085551069908708852L;

  public LoginException() {
  }

  public LoginException(String message) {
    super(message);
  }

  public LoginException(String message, Throwable cause) {
    super(message, cause);
  }

  public LoginException(Throwable cause) {
    super(cause);
  }

  public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}

