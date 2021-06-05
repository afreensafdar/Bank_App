package com.example.bank_app;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("Bank Account");
        BankAccount customerAcct= new BankAccount(100.00,200.0);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
        //customerAcct.printBal();
        customerAcct.checkingWithdrawal(50.0);
        customerAcct.savingWithdrawal(600.00);
        customerAcct.transferToChecking(50.0);
        customerAcct.transferToSaving(50.00);
        customerAcct.checkingDeposit(100.00);
        customerAcct.savingsDeposit(150.00);



    }
}
