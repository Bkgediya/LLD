package com.bhavdip.properties.solidprincipals;

public class SQLPersistance implements Persistance{
    @Override
    public void save(ShoppingCart shoppingCart) {
        System.out.println("This is the printing from the sql");
    }
}
