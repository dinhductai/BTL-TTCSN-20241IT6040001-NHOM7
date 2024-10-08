package com.example.ProjectLaptopStore.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orderdetails")
public class OrderDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderDetailsID;
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Price", precision = 10, scale = 2,nullable = false)
    private BigDecimal price;
    @Column(name = "LineTotal", precision = 10, scale = 2, insertable = false, updatable = false)
    private BigDecimal lineTotal;
    @ManyToOne
    @JoinColumn(name = "ProductID")
    private ProductsEntity product;
    @ManyToOne
    @JoinColumn(name = "OrderID")
    private OrdersEntity order;

    public OrdersEntity getOrder() {
        return order;
    }

    public void setOrder(OrdersEntity order) {
        this.order = order;
    }

    public Integer getOrderDetailsID() {
        return OrderDetailsID;
    }

    public void setOrderDetailsID(Integer orderDetailsID) {
        OrderDetailsID = orderDetailsID;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }
}
