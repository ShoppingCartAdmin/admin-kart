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

    public void setId(long id) {
        this.id = id;
    public ProductDto setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    public ProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    public ProductDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    public ProductDto setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(long discountId) {
        this.discountId = discountId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
    public ProductDto setCategoryId(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
}
