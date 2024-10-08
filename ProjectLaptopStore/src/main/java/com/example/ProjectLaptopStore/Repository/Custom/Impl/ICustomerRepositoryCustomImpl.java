package com.example.ProjectLaptopStore.Repository.Custom.Impl;

import com.example.ProjectLaptopStore.Builder.CustomerSearchBuilder;
import com.example.ProjectLaptopStore.DTO.Customer_FindTopCustomer;
import com.example.ProjectLaptopStore.Repository.Custom.ICustomerRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class ICustomerRepositoryCustomImpl implements ICustomerRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    // Hàm xây dựng câu truy vấn điều kiện
    public static void queryNomal(CustomerSearchBuilder customerSearchBuilder, StringBuilder where) {
        // Nếu có ngày bắt đầu
        if (customerSearchBuilder.getDateRegisterFrom() != null) {
            where.append(" and c.RegistrationDate >= :dateRegisterFrom ");
        }
        // Nếu có ngày kết thúc
        if (customerSearchBuilder.getDateRegisterTo() != null) {
            where.append(" and c.RegistrationDate <= :dateRegisterTo ");
        }
    }

    @Override
    public Integer countNewCustomer(CustomerSearchBuilder customerSearchBuilder) {
        StringBuilder sql = new StringBuilder("select count(distinct c.CustomerID) from customers c ");
        StringBuilder where = new StringBuilder(" where 1=1 ");
        queryNomal(customerSearchBuilder, where);
        sql.append(where);
        // Hiển thị câu lệnh trong console (nếu cần kiểm tra)
        System.out.println(sql.toString());

        Query query = entityManager.createNativeQuery(sql.toString());
        // Set các tham số cho câu truy vấn
        if (customerSearchBuilder.getDateRegisterFrom() != null) {
            query.setParameter("dateRegisterFrom", customerSearchBuilder.getDateRegisterFrom());
        }
        if (customerSearchBuilder.getDateRegisterTo() != null) {
            query.setParameter("dateRegisterTo", customerSearchBuilder.getDateRegisterTo());
        }
        // Trả về kết quả duy nhất
        try {
            return ((Number) query.getSingleResult()).intValue();
        } catch (NoResultException e) {
            return 0;
        }
    }

    @Override
    public List<Customer_FindTopCustomer> findTopCustomer() {
        String query = "SELECT " +
                "o.OrderDate, " +
                "u.FullName, " +
                "FROM Customers c " +
                "JOIN Users u ON u.UserID = c.UserID " +
                "JOIN Orders o ON o.CustomerID = c.CustomerID " +
                "ORDER BY o.OrderDate DESC";
    }
}
