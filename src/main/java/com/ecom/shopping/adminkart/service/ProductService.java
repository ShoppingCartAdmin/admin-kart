package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductDto;
import com.ecom.shopping.adminkart.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public ProductDto getProductDetailsById(long id) {
        return productMapper.getProductDetailsById(id);

    }
}
