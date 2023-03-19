package com.ecom.shopping.adminkart;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ecom.shopping.adminkart.mapper")
@MappedTypes({ProductCategoryDto.class})
@SpringBootApplication
public class AdminKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminKartApplication.class, args);
	}

}
