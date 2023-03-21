package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductDto;
import com.ecom.shopping.adminkart.mapper.ProductMapper;
import com.ecom.shopping.adminkart.util.DateUtil;
import com.ecom.shopping.adminkart.util.IdGenerationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private DateUtil dateUtil;
    @Autowired
    private IdGenerationUtil idGenerationUtil;

    public ProductDto getProductByCategoryId(long categoryId) {
        return productMapper.getCategoryById(categoryId);
    }


    public ProductDto addProduct(ProductDto productDto) {
        productDto.setId(idGenerationUtil.generateId());
        productDto.setCreatedDate(dateUtil.getDateTime());
        productMapper.insert(productDto);
        return productDto;
    }
}









