package com.example.ProjectLaptopStore.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "cartdetails")
public class CartDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CartDetailsID;
    @Column(name = "Quantity", nullable = false)
    private Integer quantity;
    @Column(name = "Price",precision = 10,scale = 2,nullable = false)
    private BigDecimal price;
    @Column(name = "LineTotal",precision = 10,scale = 2)
    private BigDecimal lineTotal;
    @ManyToOne
    @JoinColumn(name = "ProductID")
    private ProductsEntity product;
    @ManyToOne
    @JoinColumn(name = "CartID")
    private CartEntity cart;

}
