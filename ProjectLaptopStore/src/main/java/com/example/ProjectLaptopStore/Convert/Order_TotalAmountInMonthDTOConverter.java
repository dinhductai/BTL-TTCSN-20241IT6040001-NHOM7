package com.example.ProjectLaptopStore.Convert;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class Order_TotalAmountInMonthDTOConverter {
    public BigDecimal TotalAmount(List<BigDecimal> totalAmountInMountDTOS){
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal item : totalAmountInMountDTOS) {
            result=result.add(item);
        }
        return result;
    }
}
