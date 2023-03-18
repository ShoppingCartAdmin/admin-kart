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
    public ProductCategoryMapper productCategoryMapper;
    public void addCategory(ProductCategoryDto productCategoryDto) {
        productCategoryDto.setId(generateId());
        productCategoryDto.setCreatedDate(getDateTime());
        productCategoryMapper.insert(productCategoryDto);
    }
    private String generateId() {
       return LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddHHmmssSSS"));
    }
   private String getDateTime() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }
    public ProductCategoryDto getCategoryById(String id) {
        return productCategoryMapper.getCategoryById(id);
    }
}
