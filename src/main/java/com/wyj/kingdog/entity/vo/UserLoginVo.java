package com.wyj.kingdog.entity.vo;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserLoginVo {

    private String token;
    private String message;
}
