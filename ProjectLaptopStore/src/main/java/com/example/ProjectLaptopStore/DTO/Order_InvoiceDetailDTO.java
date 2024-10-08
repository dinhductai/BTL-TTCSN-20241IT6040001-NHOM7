package com.example.ProjectLaptopStore.DTO;

import com.example.ProjectLaptopStore.Entity.Enum.OrderStatus_Enum;

import java.math.BigDecimal;
import java.util.Date;

//chi tiết một hóa đơn
public class Order_InvoiceDetailDTO {
    private Date orderDate;
    private String fullName;
    private String shippingAddress;
    private String shippingCity;
    private String shippingDistrict;
    private String shippingWard;
    private String shippingStreet;
    private String productName;
    private String model;
    private String brand;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal lineTotal;
    private BigDecimal shippingFee;
    private BigDecimal totalAmount;
    private Date estimatedDeliveryDate;
    private OrderStatus_Enum orderStatus;

    public Order_InvoiceDetailDTO(Date orderDate, String fullName, String shippingAddress, String shippingCity, String shippingDistrict, String shippingWard, String shippingStreet, String productName, String model, String brand, BigDecimal price, Integer quantity, BigDecimal lineTotal, BigDecimal shippingFee, BigDecimal totalAmount, Date estimatedDeliveryDate, OrderStatus_Enum orderStatus) {
        this.orderDate = orderDate;
        this.fullName = fullName;
        this.shippingAddress = shippingAddress;
        this.shippingCity = shippingCity;
        this.shippingDistrict = shippingDistrict;
        this.shippingWard = shippingWard;
        this.shippingStreet = shippingStreet;
        this.productName = productName;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
        this.shippingFee = shippingFee;
        this.totalAmount = totalAmount;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingDistrict() {
        return shippingDistrict;
    }

    public void setShippingDistrict(String shippingDistrict) {
        this.shippingDistrict = shippingDistrict;
    }

    public String getShippingWard() {
        return shippingWard;
    }

    public void setShippingWard(String shippingWard) {
        this.shippingWard = shippingWard;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public OrderStatus_Enum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus_Enum orderStatus) {
        this.orderStatus = orderStatus;
    }
}
