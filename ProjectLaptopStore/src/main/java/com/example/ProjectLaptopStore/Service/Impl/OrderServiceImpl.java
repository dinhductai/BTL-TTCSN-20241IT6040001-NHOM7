package com.example.ProjectLaptopStore.Service.Impl;

import com.example.ProjectLaptopStore.Convert.Order_TotalAmountInMonthDTOConverter;
import com.example.ProjectLaptopStore.DTO.Order_InvoiceDetailDTO;
import com.example.ProjectLaptopStore.DTO.Order_ListBillDTO;
import com.example.ProjectLaptopStore.DTO.Order_TotalAmountInMonthDTO;
import com.example.ProjectLaptopStore.Repository.IOrderRepository;
import com.example.ProjectLaptopStore.Service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private Order_TotalAmountInMonthDTOConverter order_TotalAmountInMonthDTOConverter;
    @Override
    public Order_TotalAmountInMonthDTO getTotalAmountInMountAtService() {
        BigDecimal totalAmountInMountDTOS = orderRepository.findTotalAmount();
//        BigDecimal totalAmount = order_TotalAmountInMonthDTOConverter.TotalAmount(totalAmountInMountDTOS);
        Order_TotalAmountInMonthDTO res = new Order_TotalAmountInMonthDTO();
        res.setTotalAmount(totalAmountInMountDTOS);
        return res;
    }

    @Override
    public Integer TotalCustomerInMonthAtService() {
        Integer totalCustomer = orderRepository.countCustomersForCurrentMonth();
        return totalCustomer;
    }

    @Override
    public List<Order_ListBillDTO> ListBillAtService() {
        List<Order_ListBillDTO> result = orderRepository.listBill();
        return result;
    }

    @Override
    public List<Order_InvoiceDetailDTO> ListInvoiceDetailAtService() {
        List<Order_InvoiceDetailDTO> result = orderRepository.listInvoiceDetail();
        return result;
    }
}
