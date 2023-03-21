package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.mapper.ProductCategoryMapper;
import com.ecom.shopping.adminkart.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private DateUtil dateUtil;

    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryMapper.findAllCategory();
    }

    public ProductCategoryDto updateCategoryById(ProductCategoryDto productCategoryDto) {
        Optional<ProductCategoryDto> existingUser = productCategoryMapper.getId(productCategoryDto.getId());
        ProductCategoryDto updatedUser = null;
        if (existingUser.isPresent()) {
            updatedUser = existingUser.get();
            updatedUser.setId(productCategoryDto.getId());
            updatedUser.setName(productCategoryDto.getName());
            updatedUser.setDescription(productCategoryDto.getDescription());
            updatedUser.setModifiedDate(dateUtil.getDateTime());
            productCategoryMapper.updateCategoryById(productCategoryDto.getId(), productCategoryDto.getName(), productCategoryDto.getDescription(), updatedUser.getModifiedDate());
        }
        return updatedUser;
    }
    public ProductCategoryDto getCategoryById(String id) {
        return productCategoryMapper.getCategoryById(id);
    }
}

