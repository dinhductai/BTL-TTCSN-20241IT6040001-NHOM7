package com.example.ProjectLaptopStore.Repository;

import com.example.ProjectLaptopStore.Entity.SuppliersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ISuppliersRepository extends JpaRepository<SuppliersEntity,Integer> {
    List<SuppliersEntity> findAll();
}
