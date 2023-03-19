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
    public ProductDto updateProductById(ProductDto productDto) {
        Optional<ProductDto> existingUser = productMapper.getId(productDto.getId());
        ProductDto updatedUser = null;
        if (existingUser.isPresent()) {
            updatedUser = existingUser.get();
            updatedUser.setId(productDto.getId());
            updatedUser.setName(productDto.getName());
            updatedUser.setDescription(productDto.getDescription());
            updatedUser.setModifiedDate(getDateTime());
            productMapper.updateProductById(productDto.getId(), productDto.getName(), productDto.getDescription(), updatedUser.getModifiedDate());
        }
        return updatedUser;
    }
    private String getDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss"));
    }

}

    public ProductDto getProductByCategoryId(long categoryId) {
        return productMapper.getCategoryById(categoryId);
    }

}

