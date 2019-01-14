package com.example.product.VO;

import lombok.Data;

/**
 * Created by lhb
 * 2019/1/12
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
