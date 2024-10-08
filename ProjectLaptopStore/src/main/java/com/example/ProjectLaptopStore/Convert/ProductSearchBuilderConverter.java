package com.example.ProjectLaptopStore.Convert;

import com.example.ProjectLaptopStore.Builder.ProductSearchBuilder;
import com.example.ProjectLaptopStore.Util.MapUtil;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
@Component
public class ProductSearchBuilderConverter {
    public ProductSearchBuilder toProductSearchBuilder(Map<String, Object> params){
        ProductSearchBuilder productSearchBuilder = new ProductSearchBuilder.Builder()
                .setProductName(MapUtil.getObject(params,"productName", String.class))
                .setBrand(MapUtil.getObject(params,"brand", String.class))
                .setModel(MapUtil.getObject(params,"model", String.class))
                .setPrice(MapUtil.getObject(params,"price",Float.class))
                .setStockQuantity(MapUtil.getObject(params,"stockQuantity",Integer.class))
                .setDescription(MapUtil.getObject(params,"description",String.class))
                .setReleaseDate(MapUtil.getObject(params,"releaseDate", Date.class))
                .setWarrantyPeriod(MapUtil.getObject(params,"warrantyPeriod", Integer.class))
                .setImageURL(MapUtil.getObject(params,"imageURL", String.class))
                .build();
        return productSearchBuilder;
    }
}
