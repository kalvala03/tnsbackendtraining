package com.kprit.tns.exceptionhandling;

//  Main class to demonstrate custom exception usage
public class CustomException {

    static class BankAccount {
        private double balance; 

        public BankAccount(double balance) {
            this.balance = balance;
        }

        // Method to withdraw money from account
        // Throws InsufficientBalanceException if balance is not enough
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Withdrawal failed! Please check the balance");
            } 
            else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        }
    }

    // Main method to test custom exception
    public static void main(String[] args) {
        
        // Creating a new bank account with initial balance of 5000
        BankAccount obj = new BankAccount(3000);

        try {  
        	obj.withdraw(4000);  
        
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        System.out.println("Transaction process finished.");
    }
}
