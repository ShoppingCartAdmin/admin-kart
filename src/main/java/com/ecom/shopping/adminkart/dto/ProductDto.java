package com.ecom.shopping.adminkart.dto;

import java.math.BigDecimal;

public class ProductDto {
    private long id;
    private String name;
    private String description;
    private String sku;
    private long categoryId;
    private long inventoryId;
    private BigDecimal price;
    private long discountId;
    private String createdDate;
    private String modifiedDate;
    private String deletedDate;

    public String getDeletedDate() {
        return deletedDate;
    }

    public ProductDto setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

    public long getId() {
        return id;
    }

    public ProductDto setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public ProductDto setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public ProductDto setCategoryId(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public long getInventoryId() {
        return inventoryId;
    }

    public ProductDto setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductDto setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public long getDiscountId() {
        return discountId;
    }

    public ProductDto setDiscountId(long discountId) {
        this.discountId = discountId;
        return this;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public ProductDto setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public ProductDto setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }
}