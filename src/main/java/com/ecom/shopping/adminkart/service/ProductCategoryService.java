package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.mapper.ProductCategoryMapper;
import com.ecom.shopping.adminkart.util.DateUtil;
import com.ecom.shopping.adminkart.util.IdGenerationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
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
    public ProductCategoryMapper productCategoryMapper;
    public void addCategory(ProductCategoryDto productCategoryDto) {
        productCategoryDto.setId(generateId());
        productCategoryDto.setCreatedDate(getDateTime());
        productCategoryMapper.insert(productCategoryDto);
    }
    private String generateId() {
       return LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddHHmmssSSS"));
        //System.out.println(idNo);
        //return idNo;
    }
   private String getDateTime() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

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
