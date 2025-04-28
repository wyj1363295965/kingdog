package com.wyj.kingdog.entity.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends Exception {
    private String code;
    private String msg;
    private Throwable cause;

    public BusinessException(String msg) {
        super(msg);
        this.setCode("500");
        this.setMsg(msg);
    }


}
