package com.example.ProjectLaptopStore.Repository;

import com.example.ProjectLaptopStore.Entity.CustomerEntity;
import com.example.ProjectLaptopStore.Repository.Custom.ICustomerRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface ICustomerRepository extends JpaRepository<CustomerEntity,Integer>, ICustomerRepositoryCustom {

}
