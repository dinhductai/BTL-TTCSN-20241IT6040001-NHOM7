package com.example.ProjectLaptopStore.Repository.Custom.Impl;

import com.example.ProjectLaptopStore.DTO.Order_InvoiceDetailDTO;
import com.example.ProjectLaptopStore.DTO.Order_ListBillDTO;
import com.example.ProjectLaptopStore.Entity.Enum.OrderStatus_Enum;
import com.example.ProjectLaptopStore.Repository.Custom.IOrderRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Repository
public class IOrderRepositoryCustomImpl implements IOrderRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Order_ListBillDTO> listBill() {
        String query = "Select o.OrderID, o.TotalAmount, p.CreatedDate "+
                "from Orders o "+
                "join PaymentMethods p on p.PaymentMethodID = o.PaymentMethodID "+
                "order by p.CreatedDate desc ";
        Query nativeQuery = entityManager.createNativeQuery(query);
        List<Object[]> result = nativeQuery.getResultList();
        //set thủ công
        List<Order_ListBillDTO> listBillDTO = new ArrayList<>();
        for (Object[] item : result) {
            Order_ListBillDTO dto = new Order_ListBillDTO(
                    (Integer) item[0],
                    (BigDecimal) item[1],
                    (Date) item[2]
            );
            listBillDTO.add(dto);
        }
        return listBillDTO;

    }

    @Override
    public List<Order_InvoiceDetailDTO> listInvoiceDetail() {
        String query = "SELECT " +
                "o.OrderDate, " +
                "u.FullName, " +
                "o.ShippingAddress, " +
                "o.City, " +
                "o.District, " +
                "o.Ward, " +
                "o.StreetAddress, " +
                "p.ProductName, " +
                "p.Model, " +
                "p.Brand, " +
                "od.Price, " +
                "od.Quantity, " +
                "od.LineTotal, " +
                "o.ShippingFee, " +
                "o.TotalAmount, " +
                "o.EstimatedDeliveryDate, " +
                "o.OrderStatus " +
                "FROM Orders o " +
                "JOIN Customers c ON o.CustomerID = c.CustomerID " +
                "JOIN OrderDetails od ON o.OrderID = od.OrderID " +
                "JOIN Products p ON od.ProductID = p.ProductID " +
                "JOIN Users u ON c.UserID = u.UserID " +
                "ORDER BY o.OrderDate DESC";

        Query nativeQuery = entityManager.createNativeQuery(query);
        List<Object[]> result = nativeQuery.getResultList();

        // Chuyển đổi kết quả thành DTO
        List<Order_InvoiceDetailDTO> listInvoiceDTO = new ArrayList<>();
        for (Object[] item : result) {
            Order_InvoiceDetailDTO dto = new Order_InvoiceDetailDTO(
                    (Date) item[0],                // orderDate
                    (String) item[1],              // nameCustomer
                    (String) item[2],              // shippingAddress
                    (String) item[3],              // shippingCity
                    (String) item[4],              // shippingDistrict
                    (String) item[5],              // shippingWard
                    (String) item[6],              // shippingStreet
                    (String) item[7],              // productName
                    (String) item[8],              // model
                    (String) item[9],              // brand
                    (BigDecimal) item[10],         // price
                    (Integer) item[11],            // quantity
                    (BigDecimal) item[12],         // lineTotal
                    (BigDecimal) item[13],         // shippingFee
                    (BigDecimal) item[14],         // totalAmount
                    (Date) item[15],               // estimatedDeliveryDate
                    OrderStatus_Enum.valueOf((String) item[16]) // orderStatus
            );
        }

        return listInvoiceDTO;
    }
}
