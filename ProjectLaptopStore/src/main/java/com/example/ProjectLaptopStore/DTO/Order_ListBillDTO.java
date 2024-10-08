package com.example.ProjectLaptopStore.DTO;

import java.math.BigDecimal;
import java.util.Date;

//lớp DTO lấy danh sách bill cho admin
public class Order_ListBillDTO {
    private Integer orderID;
    private BigDecimal totalAmount;
    private Date createDate;

    public Order_ListBillDTO(Integer orderID, BigDecimal totalAmount, Date createDate) {
        this.orderID = orderID;
        this.totalAmount = totalAmount;
        this.createDate = createDate;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
