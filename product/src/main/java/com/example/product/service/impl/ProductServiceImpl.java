package com.example.product.service.impl;

import com.example.product.enums.ProductStatus;
import com.example.product.object.ProductInfo;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lhb
 * 2019/1/12
 */

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<ProductInfo> findUpAll() {
        return productRepository.findByProductStatus(ProductStatus.UP.getCode());
    }
}
