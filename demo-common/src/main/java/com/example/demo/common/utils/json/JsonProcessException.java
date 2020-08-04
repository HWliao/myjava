package com.example.demo.common.utils.json;

import java.io.Serializable;

/**
 * Json处理异常,仅对应jackson异常封装
 *
 * @author HWliao
 */
public class JsonProcessException extends RuntimeException implements Serializable {
    final static long serialVersionUID = 123;

    public JsonProcessException() {
    }

    public JsonProcessException(String message) {
        super(message);
    }

    public JsonProcessException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonProcessException(Throwable cause) {
        super(cause);
    }

    public JsonProcessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
