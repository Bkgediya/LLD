package com.bhavdip.properties.solidprincipals;

public class MongoDBPersistance implements Persistance{
    @Override
    public void save(ShoppingCart shoppingCart) {
        System.out.println("This is the printing from the mongodb");
    }
}
