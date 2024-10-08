package com.example.ProjectLaptopStore.Service;

import com.example.ProjectLaptopStore.DTO.ProductAndSupplierDTO;
import com.example.ProjectLaptopStore.DTO.ProductDTO;
import com.example.ProjectLaptopStore.DTO.Product_FindTopPurchasedProductsDTO;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Map;
public interface IProductService {
    List<ProductDTO> findAllProducts();
    List<ProductDTO> findByNameContainingAndBrandContainingAtService(String productName,String brand);
    List<ProductAndSupplierDTO> findByProductNameAndSupplier_SupplierNameAtService(String productName, String supplierName);
    List<Product_FindTopPurchasedProductsDTO> findTopPurchasedProductAtService();
}
