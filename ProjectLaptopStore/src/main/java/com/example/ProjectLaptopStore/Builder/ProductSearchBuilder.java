package com.example.ProjectLaptopStore.Builder;

import java.util.Date;
//class đối tượng bth nhưng giảm thiểu phức tạp
//triển khai builder pattern thủ công
public class ProductSearchBuilder {
//    private Integer suppierId; không cần thiết vì không tìm kiếm sản phẩm theo nv hỗ trợ
    private String productName;
    private String brand;
    private String model;
    private Float price;
    private Integer stockQuantity;
    private String description;
    private Date releaseDate;
    private Integer warrantyPeriod;
    private String imageURL;

    public ProductSearchBuilder(Builder builder) {
        this.productName = builder.productName;
        this.brand = builder.brand;
        this.model = builder.model;
        this.price = builder.price;
        this.stockQuantity = builder.stockQuantity;
        this.description = builder.description;
        this.releaseDate = builder.releaseDate;
        this.warrantyPeriod = builder.warrantyPeriod;
        this.imageURL = builder.imageURL;

    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Integer getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public String getImageURL() {
        return imageURL;
    }
    //giúp tạo đối tượng linh hoạt,dễ bảo trì,an toàn
    public static class Builder{
        private String productName;
        private String brand;
        private String model;
        private Float price;
        private Integer stockQuantity;
        private String description;
        private Date releaseDate;
        private Integer warrantyPeriod;
        private String imageURL;

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;

        }

        public Builder setModel(String model) {
            this.model = model;
            return this;

        }

        public Builder setPrice(Float price) {
            this.price = price;
            return this;

        }

        public Builder setStockQuantity(Integer stockQuantity) {
            this.stockQuantity = stockQuantity;
            return this;

        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;

        }

        public Builder setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;

        }

        public Builder setWarrantyPeriod(Integer warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
            return this;

        }

        public Builder setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;

        }

        public ProductSearchBuilder build(){
            return new ProductSearchBuilder(this);
        }
    }
}
