package com.bhavdip.properties.solidprincipals;

public class SavingAccount implements WithdrawableAccount{
    private double balance;

    public SavingAccount() {
        this.balance = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        }

        System.out.println("saving balance is "+this.balance);
    }

    @Override
    public void deposite(double amount) {
        balance+= amount;
        System.out.println(" saving current balance is "+this.balance);
    }
}
