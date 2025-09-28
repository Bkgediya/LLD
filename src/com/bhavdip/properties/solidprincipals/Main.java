package com.bhavdip.properties.solidprincipals;


// s : single responsibility principal
// o : open/close principal
// L : Liskov substitution principal (LSP)
// i : Interface segregation principal (ISP)
// d : Dependency inversion principal

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Biscuit",100));
        shoppingCart.addProduct(new Product("Cake",200));
        int price = shoppingCart.calculateTotalPrice();
        System.out.println("price is " + price);
        CartInvoicePrinter invoicePrinter = new CartInvoicePrinter(shoppingCart);
        invoicePrinter.printInvoices();

        CartDBStorage dbStorage = new CartDBStorage(shoppingCart);
        dbStorage.dbStorage();
    }
}
