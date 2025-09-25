package com.kprit.encapsulation;

public class BankAccMain {
	public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);

        acc.deposit(2000);            // Deposited: 2000
        acc.withdraw(1500);           // Withdrew: 1500
        System.out.println("Balance: " + acc.getBalance()); // Balance: 5500

        // acc.balance = 100000;  ❌ ERROR bcz 'balance' is private
    }
}
