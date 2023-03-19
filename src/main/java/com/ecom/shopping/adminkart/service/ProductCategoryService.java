package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryMapper.findAllCategory();
    }
    public ProductCategoryDto getCategoryById(String id) {
        return productCategoryMapper.getCategoryById(id);
    }
}
