package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {
    @Select("select * from product_category")
    List<ProductCategoryDto> findAllCategory();
}
