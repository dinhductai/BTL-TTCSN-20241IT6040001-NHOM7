package com.example.ProjectLaptopStore.Service.Impl;

import com.example.ProjectLaptopStore.Builder.CustomerSearchBuilder;
import com.example.ProjectLaptopStore.Convert.Customer_CountNewCustomerConverter;
import com.example.ProjectLaptopStore.Repository.ICustomerRepository;
import com.example.ProjectLaptopStore.Service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Autowired
    private Customer_CountNewCustomerConverter customerCountNewCustomerConverter;
    @Override
    public Integer countCustomers(Map<String, Object> params) {
        CustomerSearchBuilder customerSearchBuilder = customerCountNewCustomerConverter.toCustomerSearchBuilder(params);
        Integer result = customerRepository.countNewCustomer(customerSearchBuilder);
        return result;
    }
}
