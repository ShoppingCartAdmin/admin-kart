package com.ecom.shopping.adminkart.service;

import com.ecom.shopping.adminkart.dto.ProductCategoryDto;
import com.ecom.shopping.adminkart.mapper.ProductCategoryMapper;
import com.ecom.shopping.adminkart.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private DateUtil dateUtil;

    public List<ProductCategoryDto> getAllCategory() {
        return productCategoryMapper.findAllCategory();
    }

    public ProductCategoryDto getCategoryById(String id) {
        return productCategoryMapper.getCategoryById(id);
    }
}
    public ProductCategoryDto updateCategoryById(ProductCategoryDto productCategoryDto) {
        ProductCategoryDto updatedUser = null;
        try {
            Optional<ProductCategoryDto> existingUser = productCategoryMapper.getId(productCategoryDto.getId());

            if (existingUser.isPresent()) {
                updatedUser = existingUser.get();
                updatedUser.setId(productCategoryDto.getId());
                updatedUser.setName(productCategoryDto.getName());
                updatedUser.setDescription(productCategoryDto.getDescription());
                updatedUser.setModifiedDate(dateUtil.getDateTime());
                int row = productCategoryMapper.updateCategoryById(productCategoryDto.getId(), productCategoryDto.getName(), productCategoryDto.getDescription(), updatedUser.getModifiedDate());
                if (row > 0) {
                    System.out.println("Sucessfully updated");

                } else {
                    throw new RuntimeException("Exception throw while updating the category");
                }
            } else {
                throw new RuntimeException("Exception throw while updating the category");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        return updatedUser;
    }
}

