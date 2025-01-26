package com.arindam.lld_soliddesignpattern.SOLID.SRP;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//suppose this is taking the request
public class ProductController {


    // SRP violation
    public static String getProductById(Long id) {
        Product product = ProductDB.getProductById(id);
        Map<String, String> productDetails = new LinkedHashMap<>();
        if (product != null) {
            productDetails.put("name", product.getName());
            productDetails.put("price", product.getPrice().toString());
            productDetails.put("description", product.getDescription());
        }
        if(productDetails.size() > 0) {
            return productDetails.toString();
        }
        return "Product not found";
    }


    // SRP follows
    public static String getProductById2(Long id) {
        Product product = ProductService.getProductById(id);
        String serializedProduct = ProductSerializer.serialize(product);
        if(serializedProduct != null) {
            return serializedProduct;
        }
        return "Product not found";
    }


}
