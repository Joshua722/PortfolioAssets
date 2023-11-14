package com.pluralsight.finance;

public class CreditCard extends FixedAsset implements Valuable {
    String accountNumber;
    double balance;

    public CreditCard(String name, double marketValue, String accountNumber, double balance) {
        super(name, marketValue);
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    @Override
    public double getValue() {
        return 0;
    }
}
