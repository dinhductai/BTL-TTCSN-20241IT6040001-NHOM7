package com.example.ProjectLaptopStore.Entity;

import com.example.ProjectLaptopStore.Entity.Enum.Status_Enum;
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
@Table(name = "cart")
public class CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CartID;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private Status_Enum status = Status_Enum.active;
    @Column(name = "CreatedDate", nullable = false)
    private Date createdDate;
    @Column(name = "TotalPrice",precision = 10,scale = 2)
    private BigDecimal totalPrice;
    @OneToMany(mappedBy = "cart",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CartDetailsEntity> cartDetails = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private CustomerEntity customer;


}
