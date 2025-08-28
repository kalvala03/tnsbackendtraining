package com.kprit.tns.exceptionhandling;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Program Starts executing");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1=sc.nextInt();
		System.out.println("Enter n2:");
		int n2=sc.nextInt();
		
		// try block: code that may throw an exception
		try {
			int res=n1/n2;
			System.out.println(res);
		}
		
		 // catch block: handles the exception if it occurs
		catch(ArithmeticException e) {
			System.out.println(e);	
		}
		
		// finally block: always executes (cleanup code goes here)
		finally {
			 System.out.println("Closing scanner and cleaning up.");
	         sc.close();
		}
		System.out.println("Program execution ends successfully");
	}

}
