package com.example.product.repository;

import com.example.product.object.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lhb
 * 2019/1/12
 */
public interface ProductRepository extends JpaRepository<ProductInfo,String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);


}
