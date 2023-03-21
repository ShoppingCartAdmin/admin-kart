package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Optional;

public interface ProductMapper {
    @Select("SELECT * FROM product WHERE categoryId = #{categoryId}")
    ProductDto getCategoryById(long categoryId);
}

