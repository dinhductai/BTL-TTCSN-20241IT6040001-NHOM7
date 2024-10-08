package com.example.ProjectLaptopStore.Service.Impl;

import com.example.ProjectLaptopStore.Convert.ProductAndSupplierDTOConverter;
import com.example.ProjectLaptopStore.Convert.ProductDTOConverter;
import com.example.ProjectLaptopStore.Convert.ProductSearchBuilderConverter;
import com.example.ProjectLaptopStore.DTO.ProductAndSupplierDTO;
import com.example.ProjectLaptopStore.DTO.ProductDTO;
import com.example.ProjectLaptopStore.DTO.Product_FindTopPurchasedProductsDTO;
import com.example.ProjectLaptopStore.Entity.ProductsEntity;
import com.example.ProjectLaptopStore.Repository.IProductRepository;
import com.example.ProjectLaptopStore.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private ProductDTOConverter productDTOConverter;

    @Autowired
    private ProductSearchBuilderConverter productSearchBuilderConverter;
    @Autowired
    private ProductAndSupplierDTOConverter productAndSupplierDTOConverter;

    @Override
    public List<ProductDTO> findAllProducts() {
//        ProductSearchBuilder productSearchBuilder = productSearchBuilderConverter.toProductSearchBuilder(params);
        List<ProductsEntity> productsEntities = productRepository.findAll();
        List<ProductDTO> result = new ArrayList<>();
        for (ProductsEntity productsEntity : productsEntities) {
            ProductDTO productDTO = productDTOConverter.toProductDTO(productsEntity);
            result.add(productDTO);
        }
        return result;
    }

    @Override
    public List<ProductDTO> findByNameContainingAndBrandContainingAtService(String productName, String brand) {
        List<ProductsEntity> productsEntities = productRepository.findByProductNameContainingAndBrandContaining(productName, brand);
        List<ProductDTO> result = new ArrayList<>();
        for (ProductsEntity productsEntity : productsEntities) {
            ProductDTO productDTO = productDTOConverter.toProductDTO(productsEntity);
            result.add(productDTO);
        }
        return result;
    }

    @Override
    public List<ProductAndSupplierDTO> findByProductNameAndSupplier_SupplierNameAtService(String productName, String supplierName) {
        List<ProductsEntity> productsEntities = productRepository.findByProductNameContainingAndSupplier_SupplierNameContaining(productName, supplierName);
        List<ProductAndSupplierDTO> result = new ArrayList<>();
        for (ProductsEntity productsEntity : productsEntities) {
            ProductAndSupplierDTO productAndSupplierDTO = productAndSupplierDTOConverter.toProductAndSupplierDTO(productsEntity);
            result.add(productAndSupplierDTO);
        }
        return result;
    }

    @Override
    public List<Product_FindTopPurchasedProductsDTO> findTopPurchasedProductAtService() {
        List<Product_FindTopPurchasedProductsDTO> result = productRepository.findAllProductsWithTotalQuantityOrdered();
        return result;
    }


}
