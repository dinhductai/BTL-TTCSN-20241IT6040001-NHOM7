package com.example.ProjectLaptopStore.Entity;

import com.example.ProjectLaptopStore.Entity.Enum.OrderStatus_Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class OrdersEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderID;
    @Column(name = "OrderDate",nullable = false)
    private Date orderDate;
    @Column(name = "TotalAmount",precision = 10,scale = 2,nullable = false)
    private BigDecimal totalAmount;
    @Column(name = "ShippingFee",precision = 10,scale = 2)
    private BigDecimal shippingFee;
    @Column(name = "OrderStatus",nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus_Enum orderStatus;
    @Column(name = "ShippingAddress")
    private String shippingAddress;
    @Column(name = "City")
    private String city;
    @Column(name = "District")
    private String district;
    @Column(name = "Ward")
    private String ward;
    @Column(name = "StreetAddress")
    private String streetAddress;
    @Column(name = "EstimatedDeliveryDate")
    private Date estimatedDeliveryDate;
    @Column(name = "ActualDeliveryDate")
    private Date actualDeliveryDate;
    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY)
    private List<OrderDetailEntity> orderDetails = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "PaymentMethodID")
    private PayMentMethodsEntity payMentMethod;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private CustomerEntity customer;

}
