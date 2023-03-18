package com.ecom.shopping.adminkart.controller;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;
    @PostMapping("/addCategory")
    public void addCategory(@RequestBody ProductCategoryDto productCategoryDto) {
        productCategoryService.addCategory(productCategoryDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> getCategoryById(@PathVariable String id) {
        ProductCategoryDto category=productCategoryService.getCategoryById(id);
        return ResponseEntity.ok(category);
    }

}
