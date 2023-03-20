
package com.ecom.shopping.adminkart.mapper;

import com.ecom.shopping.adminkart.dto.ProductDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Optional;

public interface ProductMapper {
    @Select("select * from product Where id=#{id}")
    @Select("SELECT * FROM product WHERE categoryId = #{categoryId}")
    ProductDto getCategoryById(long categoryId);
}

    @Select("select * from product_category Where id=#{id}")
    Optional<ProductDto> getId(long id);
    @Update("UPDATE product SET name=#{name},description=#{description},modifiedDate=#{modifiedDate}  WHERE id=#{id}")
    int updateProductById(@Param("id") long id, @Param("name") String name, @Param("description") String description, @Param("modifiedDate") String modifiedDate);

}