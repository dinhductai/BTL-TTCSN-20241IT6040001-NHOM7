package com.example.ProjectLaptopStore.Service;

import com.example.ProjectLaptopStore.DTO.Order_InvoiceDetailDTO;
import com.example.ProjectLaptopStore.DTO.Order_ListBillDTO;
import com.example.ProjectLaptopStore.DTO.Order_TotalAmountInMonthDTO;

import java.util.List;

public interface IOrderService {
    Order_TotalAmountInMonthDTO getTotalAmountInMountAtService();
    Integer TotalCustomerInMonthAtService();
    List<Order_ListBillDTO> ListBillAtService();
    List<Order_InvoiceDetailDTO> ListInvoiceDetailAtService();
}
