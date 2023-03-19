package com.ecom.shopping.adminkart.controller;

import com.ecom.shopping.adminkart.dto.ProductDto;
import com.ecom.shopping.adminkart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getProductBasedOnCategoryId/{categoryId}")
    public ResponseEntity<ProductDto> getProductByCategoryId(@PathVariable long categoryId) {
        ProductDto category=productService.getProductByCategoryId(categoryId);
        return ResponseEntity.ok(category);
    @PostMapping("/addProduct")
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        return productService.addProduct(productDto);
    }
}
