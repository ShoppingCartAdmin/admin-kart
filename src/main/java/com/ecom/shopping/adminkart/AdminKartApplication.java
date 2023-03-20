package com.ecom.shopping.adminkart;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.dto.ProductDto;
import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.dto.ProductDto;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import com.ecom.shopping.adminkart.controller.ProductCategoryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(value = {ProductCategoryDto.class, ProductDto.class})
@MappedTypes({ProductCategoryController.class})
@MapperScan("com.ecom.shopping.adminKart.mapper")
@MappedTypes(value = {ProductCategoryDto.class})
@MapperScan("com.ecom.shopping.adminkart.mapper")
@MappedTypes({ProductCategoryController.class})
@MappedTypes(value = {ProductCategoryController.class, ProductDto.class})
@MapperScan("com.ecom.shopping.adminKart.mapper")
@MapperScan("com.ecom.shopping.adminKart.mapper")
@MappedTypes(value = {ProductCategoryDto.class})
@MappedTypes(value={ProductCategoryDto.class, ProductDto.class})
@MapperScan("com.ecom.shopping.adminkart.mapper")

@SpringBootApplication
public class AdminKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminKartApplication.class, args);
	}

}
