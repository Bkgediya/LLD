package com.bhavdip.properties.solidprincipals;


// s : single responsibility principal
// o : open/close principal
//  ->> open for extension but close for modification : abstraction, inheritance, polymorphism

// L : Liskov substitution principal (LSP)
//  ->> subclasses should be substitutable for their base class
// notes : signature rule, property rule, method rule
// i : Interface segregation principal (ISP)
//  ->>

// d : Dependency inversion principal
//  ->>

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Biscuit",100));
        shoppingCart.addProduct(new Product("Cake",200));
        int price = shoppingCart.calculateTotalPrice();
        System.out.println("price is " + price);
        CartInvoicePrinter invoicePrinter = new CartInvoicePrinter(shoppingCart);
        invoicePrinter.printInvoices();

//        CartDBStorage dbStorage = new CartDBStorage(shoppingCart);
//        dbStorage.dbStorage();
        Persistance p = new SQLPersistance();
        p.save(shoppingCart);

        Persistance m = new MongoDBPersistance();
        m.save(shoppingCart);

        Persistance file = new FilePersistance();
        file.save(shoppingCart);

        SavingAccount account = new SavingAccount();
        SavingAccount account1 = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        FixDepositeAccount fixDepositeAccount1 = new FixDepositeAccount();
        FixDepositeAccount fixDepositeAccount2 = new FixDepositeAccount();

        List<WithdrawableAccount> withdrawableAccountList = new ArrayList<>();
        withdrawableAccountList.add(account);
        withdrawableAccountList.add(account1);
        withdrawableAccountList.add(currentAccount);

        List<DepositeAccount> depositeAccountList = new ArrayList<>();
        depositeAccountList.add(fixDepositeAccount1);
        depositeAccountList.add(fixDepositeAccount2);

        BankClient bankClient = new BankClient(withdrawableAccountList, depositeAccountList);
        bankClient.transactions();



    }
}
