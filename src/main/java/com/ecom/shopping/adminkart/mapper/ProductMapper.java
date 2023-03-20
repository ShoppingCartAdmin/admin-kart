package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductMapper {
    @Select("select * from product Where id=#{id}")
    ProductDto getProductDetailsById(long id);

}
