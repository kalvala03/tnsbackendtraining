package com.kprit.tns.exceptionhandling;

public class UnhandledExceptionDemo {
	
	//If an error(exception) occurs and we don’t handle it, the program will stop suddenly.
	//Any code written after that error will not run.

	public static void main(String[] args) {
		System.out.println("Program Starts executing");
		int n1=5;
		int n2=0;
		
		// Dividing a number by zero
        // This will cause an error (ArithmeticException)
		int res=n1/n2;
		
		 // This line will not run because the program stops at the error
		System.out.println(res);
		
		// This line will also not run
		System.out.println("Program execution ends successfully");
	}

}
