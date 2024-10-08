package com.example.ProjectLaptopStore.Convert;

import com.example.ProjectLaptopStore.DTO.ProductAndSupplierDTO;
import com.example.ProjectLaptopStore.DTO.ProductDTO;
import com.example.ProjectLaptopStore.Entity.ProductsEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductAndSupplierDTOConverter {
    @Autowired
    private ModelMapper modelMapper;
    public ProductAndSupplierDTO toProductAndSupplierDTO(ProductsEntity productsEntity) {
        ProductAndSupplierDTO productAndSupplierDTO = modelMapper.map(productsEntity, ProductAndSupplierDTO.class);
        productAndSupplierDTO.setProductName(productsEntity.getProductName());
        productAndSupplierDTO.setBrand(productsEntity.getBrand());
        productAndSupplierDTO.setModel(productAndSupplierDTO.getModel());
        productAndSupplierDTO.setPrice(productAndSupplierDTO.getPrice());
        productAndSupplierDTO.setDescription(productAndSupplierDTO.getDescription());
        productAndSupplierDTO.setImageURL(productsEntity.getImageURL());
        return productAndSupplierDTO;
    }
}
