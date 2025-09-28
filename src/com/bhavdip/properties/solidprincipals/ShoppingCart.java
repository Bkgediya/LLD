package com.bhavdip.properties.solidprincipals;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    // calculate total price in cart
    public int calculateTotalPrice() {
        int total = 0;
        for (Product product : products) {
            total+= product.price;
        }
        return total;
    }
}
