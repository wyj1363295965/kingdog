package com.wyj.kingdog.entity.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class R<T> {

    private T data;

    private Long total;

    /**
     * 成功且带数据
     **/
    public static R ok() {

        return new R();
    }
}
