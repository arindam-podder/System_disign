package com.arindam.lld_soliddesignpattern.SOLID.SRP;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1L, "Product 1", 100.0, "Product 1 Description"));
        products.add(new Product(2L, "Product 2", 200.0, "Product 2 Description"));
        products.add(new Product(3L, "Product 3", 300.0, "Product 3 Description"));
        products.add(new Product(4L, "Product 4", 400.0, "Product 4 Description"));
    }


    public static Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

}
