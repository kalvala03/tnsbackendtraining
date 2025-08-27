package com.kprit.tns.exceptionhandling;

//  User-defined Exception class
// This exception will be thrown when a user tries to withdraw
// more money than available balance in the bank account.

public class InsufficientBalanceException extends Exception {
    
    // Constructor that accepts a custom error message
    public InsufficientBalanceException(String message) {
        super(message);  // pass the message to the parent Exception class
    }
}
