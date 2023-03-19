package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ProductCategoryService {
    @Autowired
    public ProductCategoryMapper productCategoryMapper;
    public void addCategory(ProductCategoryDto productCategoryDto) {
        productCategoryDto.setId(generateId());
        productCategoryDto.setCreatedDate(getDateTime());
        productCategoryMapper.insert(productCategoryDto);
    }
        private long generateId() {
          return(long) Math.floor(Math.random() * 999999999) + 800;

        }

   private String getDateTime() {
       return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
   }

    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryMapper.findAllCategory();
    }


    private ProductCategoryMapper productCategoryMapper;

    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryMapper.findAllCategory();
    }

}
