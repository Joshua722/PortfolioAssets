package com.pluralsight.finance;

public class BankAccount extends FixedAsset implements Valuable {
    String accountNumber;
    double balance;


    public BankAccount(String name, double marketValue, String accountNumber, double balance) {
        super(name, marketValue);
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double deposit(double deposit){
        balance += deposit;
        return balance;
    }
    public double withdraw(double withdraw){
        balance -= withdraw;
        return balance;
    }
    @Override
    public double getValue() {
        return 0;
    }
}
