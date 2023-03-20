package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductDto;
import com.ecom.shopping.adminkart.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public ProductDto getProductByCategoryId(long categoryId) {
        return productMapper.getCategoryById(categoryId);
    }

}

