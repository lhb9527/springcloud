package com.example.product.service;

import com.example.product.object.ProductInfo;

import java.util.List;

/**
 * Created by lhb
 * 2019/1/12
 */
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

}
