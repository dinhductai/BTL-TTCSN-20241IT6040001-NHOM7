package com.example.ProjectLaptopStore.DTO;

public class Product_FindTopPurchasedProductsDTO {
    private String productName;
    private String brand;
    private String model;
    private Float price;
    private Integer stockQuantity;
    private String description;
    private Integer warrantyPeriod;
    private String imageURL;
    private Long quantityOrdered;

    public Product_FindTopPurchasedProductsDTO(String productName, String brand, String model, Float price, Integer stockQuantity, String description, Integer warrantyPeriod, String imageURL, Long quantityOrdered) {
        this.productName = productName;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.description = description;
        this.warrantyPeriod = warrantyPeriod;
        this.imageURL = imageURL;
        this.quantityOrdered = quantityOrdered;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(Integer warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Long quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
}
