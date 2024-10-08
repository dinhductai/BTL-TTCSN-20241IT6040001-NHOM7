package com.example.ProjectLaptopStore.Convert;

import com.example.ProjectLaptopStore.Builder.CustomerSearchBuilder;
import com.example.ProjectLaptopStore.Util.MapUtil;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

@Component
public class Customer_CountNewCustomerConverter {
    public CustomerSearchBuilder toCustomerSearchBuilder(Map<String, Object> params) {
        CustomerSearchBuilder customerSearchBuilder = new CustomerSearchBuilder.Builder()
                .setDateRegisterFrom(MapUtil.getObject(params,"dateRegisterFrom", Date.class))
                .setDateRegisterTo(MapUtil.getObject(params,"dateRegisterTo", Date.class))
                .build();
        return customerSearchBuilder;
    }
}
