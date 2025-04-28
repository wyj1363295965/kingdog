package com.wyj.kingdog.entity;


import lombok.Data;

import java.io.Serializable;


@Data
public class SystemException extends RuntimeException implements Serializable {

    private int code;

    private Object args;

    /**
     * @param message 如果需要国际化支持，需要将message作为key配置到资源文件中
     */
    public SystemException(String message) {
        super(message);
        this.code = HttpStatus.ILLEGAL_VERIFY_PARAM;//校验异常
    }

    public SystemException(String message, Object args) {
        super(message);
        this.code = HttpStatus.ILLEGAL_VERIFY_PARAM;
        this.args = args;
    }

    public SystemException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(int code, String message, Object args) {
        super(message);
        this.code = code;
        this.args = args;
    }


}
