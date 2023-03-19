package com.ecom.shopping.adminkart.controller;

import com.ecom.shopping.adminkart.dto.ProductDto;
import com.ecom.shopping.adminkart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PutMapping("/updateProductBy/{id}")
    public ProductDto updateProductById(@RequestBody ProductDto productDto) {
        return productService.updateProductById(productDto);
    }
}
