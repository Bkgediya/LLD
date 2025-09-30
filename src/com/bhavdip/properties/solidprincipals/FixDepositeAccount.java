package com.bhavdip.properties.solidprincipals;

public class FixDepositeAccount implements  DepositeAccount{
    private double balance;

    FixDepositeAccount() {
        this.balance = 0;
    }

    @Override
    public void deposite(double amount) {
        this.balance+= amount;
        System.out.println("Fix deposite balance"+this.balance);
    }
}
