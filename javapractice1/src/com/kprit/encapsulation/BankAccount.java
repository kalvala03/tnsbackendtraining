package com.kprit.encapsulation;

//Encapsulation means binding data and methods together in a single class while hiding the internal details.
//Here, 'balance' is private 
//Only controlled access is given through getters and setters (methods).

public class BankAccount {
	
	// private variable (data hiding)
    private double balance;

    // constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // public method to deposit
    public void deposit(double depamt) {
        if(depamt > 0) {
            balance += depamt;
            System.out.println("Deposited: " + depamt);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // public method to withdraw
    public void withdraw(double withamt) {
        if(withamt > 0 && withamt <= balance) {
            balance -= withamt;
            System.out.println("Withdrew: " + withamt);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // public method to check balance
    public double getBalance() {
        return balance;
    }
}
