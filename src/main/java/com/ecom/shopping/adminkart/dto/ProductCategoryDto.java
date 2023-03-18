package com.ecom.shopping.adminkart.dto;

import java.time.LocalDateTime;

public class ProductCategoryDto {
    private String id;
    private String name;
    private String description;
    private String createdDate;
    private String modifiedDate;
    private String deletedDate;

    public String getModifiedDate() {
        return modifiedDate;
    }

    public ProductCategoryDto setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public String getDeletedDate() {
        return deletedDate;
    }

    public ProductCategoryDto setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

    public String getId() {
        return id;
    }

    public ProductCategoryDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductCategoryDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductCategoryDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public ProductCategoryDto setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }
}
