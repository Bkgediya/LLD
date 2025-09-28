package com.bhavdip.properties.solidprincipals;

public class FilePersistance implements Persistance{
    @Override
    public void save(ShoppingCart shoppingCart) {
        System.out.println("This is the file persistance");
    }
}
