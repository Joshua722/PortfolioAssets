package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("John",4000,"123941",4000);
    Valuable account2 = new BankAccount("jen",2000,"12445",4000);

    account2.getValue();
        System.out.println(account1.deposit(100));
        System.out.println(account1.withdraw(100));
    }
}
