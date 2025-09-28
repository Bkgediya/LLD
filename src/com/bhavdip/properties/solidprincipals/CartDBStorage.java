package com.bhavdip.properties.solidprincipals;

public class CartDBStorage {
    private ShoppingCart shoppingCart;

    CartDBStorage(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void dbStorage() {
        System.out.println("Data is saved to the database");
    }
}
