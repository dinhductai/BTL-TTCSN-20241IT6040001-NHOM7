package com.example.ProjectLaptopStore.DTO;

import java.math.BigDecimal;

public class Customer_FindTopCustomer {
    private String customerName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String district;
    private String ward;
    private String street;
    private String quantityOrder; // đếm orderid theo cusId
    private BigDecimal totalPrice;

    public Customer_FindTopCustomer(String customerName, String email, String phoneNumber, String address, String city, String district, String ward, String street, String quantityOrder, BigDecimal totalPrice) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.street = street;
        this.quantityOrder = quantityOrder;
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(String quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
