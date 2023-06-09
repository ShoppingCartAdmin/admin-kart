package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.mapper.ProductCategoryMapper;
import com.ecom.shopping.adminkart.util.DateUtil;
import com.ecom.shopping.adminkart.util.IdGenerationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private DateUtil dateUtil;
    @Autowired
    private IdGenerationUtil idGenerationUtil;
    public ProductCategoryDto addCategory(ProductCategoryDto productCategoryDto) {
        productCategoryDto.setId(idGenerationUtil.generateId());
        productCategoryDto.setCreatedDate(dateUtil.getDateTime());
        productCategoryMapper.insert(productCategoryDto);
        return productCategoryDto;
    }
    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryMapper.findAllCategory();
    }

    public ProductCategoryDto getCategoryById(String id) {
        return productCategoryMapper.getCategoryById(id);
    }
}
