package com.ecom.shopping.adminkart;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({ProductCategoryDto.class})
@MapperScan("com.ecom.shopping.adminKart.mapper")

@SpringBootApplication
public class AdminKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminKartApplication.class, args);
	}

}
