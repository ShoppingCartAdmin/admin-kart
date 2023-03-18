package com.ecom.shopping.adminkart.controller;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;
    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> getCategoryById(@PathVariable String id) {
        ProductCategoryDto category=productCategoryService.getCategoryById(id);
        return ResponseEntity.ok(category);
    }
    @PostMapping("/addCategory")
    public void addCategory(@RequestBody ProductCategoryDto productCategoryDto) {
        productCategoryService.addCategory(productCategoryDto);
    }


    @GetMapping("/getAllCategory")
    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryService.getAllCategory();

    }
    @PostMapping("/addCategory")
    public void addCategory(@RequestBody ProductCategoryDto productCategoryDto) {
        productCategoryService.addCategory(productCategoryDto);
    }


    @GetMapping("/getAllCategory")
    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryService.getAllCategory();
    }


}
