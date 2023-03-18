package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductCategoryMapper {
    @Insert("insert into product_category(id,name,description,createdDate,modifiedDate,deletedDate) " + "VALUES (#{id},#{name},#{description},#{createdDate},#{modifiedDate},#{deletedDate})")
    int insert(ProductCategoryDto product_category);
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {
    @Select("select * from product_category")
    List<ProductCategoryDto> findAllCategory();
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {
    @Insert("insert into product_category(id,name,description,createdDate,modifiedDate,deletedDate) " + "VALUES (#{id},#{name},#{description},#{createdDate},#{modifiedDate},#{deletedDate})")
    int insert(ProductCategoryDto product_category);

    @Select("select * from product_category")
    List<ProductCategoryDto> findAllCategory();

}
