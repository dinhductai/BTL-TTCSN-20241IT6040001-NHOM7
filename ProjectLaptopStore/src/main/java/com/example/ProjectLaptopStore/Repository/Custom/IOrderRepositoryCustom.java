package com.example.ProjectLaptopStore.Repository.Custom;

import com.example.ProjectLaptopStore.DTO.Order_InvoiceDetailDTO;
import com.example.ProjectLaptopStore.DTO.Order_ListBillDTO;

import java.util.List;

public interface IOrderRepositoryCustom {
    List<Order_ListBillDTO> listBill();
    List<Order_InvoiceDetailDTO> listInvoiceDetail();
}
