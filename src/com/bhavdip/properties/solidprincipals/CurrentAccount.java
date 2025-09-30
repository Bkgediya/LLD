package com.bhavdip.properties.solidprincipals;

public class CurrentAccount implements WithdrawableAccount{
    private double balance;

    public CurrentAccount() {
        this.balance = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("current account balance is unsuffcient");
        }

        System.out.println("current account balance is "+this.balance);
    }

    @Override
    public void deposite(double amount) {
        balance+= amount;
        System.out.println("current account balance is "+this.balance);
    }
}
