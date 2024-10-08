package com.example.ProjectLaptopStore.Repository;

import com.example.ProjectLaptopStore.Repository.Custom.IOrderRepositoryCustom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import com.example.ProjectLaptopStore.Entity.OrdersEntity;

@Repository
public interface IOrderRepository extends JpaRepository<OrdersEntity, Integer> , IOrderRepositoryCustom {
    //lấy tổng tiền từ các hóa đơn từ cột TotalAmount từ bảng Order ,được thanh toán trong
    //tháng hiện tại bằng CreatedDate(ngày thanh toán) từ bảng Paymentmethod
    @Query(value = "SELECT SUM(o.TotalAmount) " +
        "FROM Orders o " +
        "JOIN PaymentMethods pm ON o.PaymentMethodID = pm.PaymentMethodID " +
        "WHERE pm.CreatedDate >= DATE_FORMAT(CURDATE(), '%Y-%m-01') " +
        "AND pm.CreatedDate <= CURDATE()", nativeQuery = true)
    BigDecimal findTotalAmount();

    @Query(value = "SELECT COUNT(DISTINCT o.CustomerID) " +
            "FROM Orders o " +
            "JOIN PaymentMethods pm ON o.PaymentMethodID = pm.PaymentMethodID " +
            "WHERE pm.CreatedDate >= DATE_FORMAT(CURDATE(), '%Y-%m-01') " +
            "AND pm.CreatedDate <= CURDATE()", nativeQuery = true )
    Integer countCustomersForCurrentMonth();
}
