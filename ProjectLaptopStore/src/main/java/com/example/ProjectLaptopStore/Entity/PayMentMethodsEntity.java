package com.example.ProjectLaptopStore.Entity;

import com.example.ProjectLaptopStore.Entity.Enum.PaymentType_Enum;
import com.example.ProjectLaptopStore.Entity.Enum.Status_Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "paymentmethods")
public class PayMentMethodsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PaymentMethodID;
    @Enumerated(EnumType.STRING)
    @Column(name = "PaymentType", nullable = false)
    private PaymentType_Enum paymentType;
    @Column(name = "BankBrandName")
    private String bankBrandName;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private Status_Enum status = Status_Enum.active;
    @Column(name = "CreatedDate",nullable = false)
    private Date createdDate;
    @OneToMany(mappedBy = "payMentMethod" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<OrdersEntity> ordersEntities = new ArrayList<>();
}
