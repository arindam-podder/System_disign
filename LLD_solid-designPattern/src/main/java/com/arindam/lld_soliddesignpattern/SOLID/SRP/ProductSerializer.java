package com.arindam.lld_soliddesignpattern.SOLID.SRP;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductSerializer {

    public static String serialize(Product product) {
        Map<String, String> productDetails = new LinkedHashMap<>();
        if (product != null) {
            productDetails.put("name", product.getName());
            productDetails.put("price", product.getPrice().toString());
            productDetails.put("description", product.getDescription());
        }
        if(productDetails.size() > 0) {
            return productDetails.toString();
        }
        return null;

    }

}
