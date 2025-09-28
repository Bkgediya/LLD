package com.bhavdip.properties.solidprincipals;

public class CartInvoicePrinter {
    private ShoppingCart shoppingCart;

    CartInvoicePrinter(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void printInvoices() {
        System.out.println("Invoice is created");
    }
}


