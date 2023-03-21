package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
    @Insert("insert into product(id,name,description,sku, categoryId,inventoryId,price,discountId,createdDate) values(#{id},#{name},#{description},#{sku},#{categoryId},#{inventoryId},#{price},#{discountId},#{createdDate})")
    int insert(ProductDto product);

    @Select("SELECT * FROM product WHERE categoryId = #{categoryId}")
    ProductDto getCategoryById(long categoryId);
}

