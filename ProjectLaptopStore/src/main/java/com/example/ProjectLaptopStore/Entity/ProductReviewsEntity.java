package com.example.ProjectLaptopStore.Entity;

import com.example.ProjectLaptopStore.Entity.Enum.ProductReviews_Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "productreviews")
public class ProductReviewsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ReviewID;
    @Column(name = "Rating")
    private Integer rating;
    @Column(name = "ReviewContent")
    private String reviewContent;
    @Column(name = "ReviewDate")
    private Date reviewDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private ProductReviews_Enum status = ProductReviews_Enum.pending;
    @ManyToOne
    @JoinColumn(name = "ProductID")
    private ProductsEntity product;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private CustomerEntity customer;



}
