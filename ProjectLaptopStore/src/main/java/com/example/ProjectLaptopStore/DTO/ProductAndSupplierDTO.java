package com.example.ProjectLaptopStore.DTO;

import java.util.Date;
//lớp DTO hiện thị thông tin product kết hợp supplier
public class ProductAndSupplierDTO {
    private String productName;
    private String brand;
    private String model;
    private Float price;
//    private Integer stockQuantity;
    private String description;
//    private Date releaseDate;
//    private Integer warrantyPeriod;
    private String imageURL;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


}
