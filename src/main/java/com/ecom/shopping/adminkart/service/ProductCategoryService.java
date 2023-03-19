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
import java.util.Optional;

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
    public ProductCategoryDto updateCategoryById(ProductCategoryDto productCategoryDto) {
        Optional<ProductCategoryDto> existingUser = productCategoryMapper.getId(productCategoryDto.getId());
        ProductCategoryDto updatedUser = null;
        if (existingUser.isPresent()) {
            updatedUser = existingUser.get();
            updatedUser.setId(productCategoryDto.getId());
            updatedUser.setName(productCategoryDto.getName());
            updatedUser.setDescription(productCategoryDto.getDescription());
            updatedUser.setModifiedDate(getDateTime());
            productCategoryMapper.updateCategoryById(productCategoryDto.getId(), productCategoryDto.getName(), productCategoryDto.getDescription(), updatedUser.getModifiedDate());
        }
        return updatedUser;
    }

    private String getDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss"));
    }


}

