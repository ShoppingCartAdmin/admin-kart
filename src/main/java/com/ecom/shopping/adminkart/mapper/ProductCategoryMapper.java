package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductCategoryMapper {
    @Insert("insert into product_category(id,name,description,createdDate,modifiedDate,deletedDate) " + "VALUES (#{id},#{name},#{description},#{createdDate},#{modifiedDate},#{deletedDate})")
    int insert(ProductCategoryDto product_category);

    ProductCategoryDto getCategory(ProductCategoryMapper productCategoryMapper);
    @Select("SELECT * FROM product_category WHERE id = #{id}")
    ProductCategoryDto getCategoryById(String id);
}
