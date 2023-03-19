package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductCategoryMapper {
    @Select("select * from product_category")
    List<ProductCategoryDto> findAllCategory();
    @Select("SELECT * FROM product_category WHERE id = #{id}")
    ProductCategoryDto getCategoryById(String id);

    @Select("select * from product_category Where id=#{id}")
    Optional<ProductCategoryDto> getId(long id);

    @Update("UPDATE product_category SET name=#{name},description=#{description},modifiedDate=#{modifiedDate}  WHERE id=#{id}")
    void updateCategoryById(@Param("id") long id, @Param("name") String name, @Param("description") String description, @Param("modifiedDate") String modifiedDate);

}
