package com.ecom.shopping.adminkart;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import com.ecom.shopping.adminkart.controller.ProductCategoryController;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import com.ecom.shopping.adminkart.controller.ProductCategoryController;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(value = {ProductCategoryDto.class})
@MapperScan("com.ecom.shopping.adminkart.mapper")
@MappedTypes({ProductCategoryDto.class})
@MappedTypes({ProductCategoryController.class})
@MapperScan("com.ecom.shopping.adminKart.mapper")
@MappedTypes(value = {ProductCategoryDto.class})
@MapperScan("com.ecom.shopping.adminkart.mapper")
@MappedTypes({ProductCategoryController.class})
@MapperScan("com.ecom.shopping.adminKart.mapper")
@SpringBootApplication
public class AdminKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminKartApplication.class, args);
	}

}
