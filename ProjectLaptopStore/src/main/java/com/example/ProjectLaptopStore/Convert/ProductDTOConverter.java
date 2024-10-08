package com.example.ProjectLaptopStore.Convert;

import com.example.ProjectLaptopStore.DTO.ProductDTO;
import com.example.ProjectLaptopStore.Entity.ProductsEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOConverter {
    @Autowired
    private ModelMapper modelMapper;
    public ProductDTO toProductDTO(ProductsEntity productsEntity) {
        ProductDTO productDTO = modelMapper.map(productsEntity, ProductDTO.class);
        productDTO.setProductName(productsEntity.getProductName());
        productDTO.setBrand(productsEntity.getBrand());
        productDTO.setPrice(productsEntity.getPrice());
        productDTO.setStockQuantity(productsEntity.getStockQuantity());
        productDTO.setDescription(productsEntity.getDescription());
        productDTO.setReleaseDate(productsEntity.getReleaseDate());
        productDTO.setWarrantyPeriod(productsEntity.getWarrantyPeriod());
        productDTO.setImageURL(productsEntity.getImageURL());
        return productDTO;
    }
}
