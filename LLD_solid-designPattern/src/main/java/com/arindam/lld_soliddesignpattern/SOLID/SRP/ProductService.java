package com.arindam.lld_soliddesignpattern.SOLID.SRP;

public class ProductService {

    public static Product getProductById(Long id) {
        // Fetch product from database
        return ProductDB.getProductById(id);
    }

}
