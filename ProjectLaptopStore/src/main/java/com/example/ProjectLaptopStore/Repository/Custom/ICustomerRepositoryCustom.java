package com.example.ProjectLaptopStore.Repository.Custom;

import com.example.ProjectLaptopStore.Builder.CustomerSearchBuilder;
import com.example.ProjectLaptopStore.DTO.Customer_FindTopCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ICustomerRepositoryCustom {
    Integer countNewCustomer(CustomerSearchBuilder customerSearchBuilder); //đếm số người dùng mới
    List<Customer_FindTopCustomer> findTopCustomer(); //tìm danh sách khách mua nhiều nhất
}
