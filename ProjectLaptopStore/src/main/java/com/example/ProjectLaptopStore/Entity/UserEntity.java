package com.example.ProjectLaptopStore.Entity;

import com.example.ProjectLaptopStore.Entity.Enum.User_Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
    @Column(name = "FullName", nullable = false)
    private String fullName;
    @Column(name = "Email",nullable = false)
    private String email;
    @Column(name = "Password",nullable = false)
    private String password;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "UserType",nullable = false)
    private User_Enum userType;
    @Column(name = "RegistrationDate",nullable = false)
    private Date registrationDate;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<AdminEntity> adminEntities = new ArrayList<>();
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CustomerEntity> customerEntities = new ArrayList<>();
}
