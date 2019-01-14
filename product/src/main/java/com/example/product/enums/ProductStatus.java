package com.example.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 * Created by lhb
 * 2019/1/12
 */
@Getter
public enum ProductStatus {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
