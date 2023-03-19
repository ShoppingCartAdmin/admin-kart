package com.ecom.shopping.adminkart.controller;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/getAllCategory")
    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryService.getAllCategory();
    }

    @PutMapping("/updateCategoryBy/{id}")
    public ProductCategoryDto updateCategoryById(@RequestBody ProductCategoryDto productCategoryDto) {
        return productCategoryService.updateCategoryById(productCategoryDto);
    }
}
