package com.kprit.methods;
import java.util.Scanner;

public class Sum {
	
	// A static method is used here because we are calling it directly 
    // from main() without creating an object of the class
	
	//method1 without return statement
	static void sumOf() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1:");
		int n1=sc.nextInt();
		System.out.print("Enter num2:");
		int n2=sc.nextInt();
		System.out.println("Sum of "+n1+" and "+n2+" is "+(n1+n2));
		sc.close();
	}
	
	//method2 with return statement
	//Using 'return' allows us to send the value back to the caller,so it can be used later
    	static int sum2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1:");
		int n1=sc.nextInt();
		System.out.print("Enter num2:");
		int n2=sc.nextInt();
		return n1+n2;  //Once a return is executed,control goes back to the caller.
						//so no statement after return will execute.
	    //System.out.println("Hi");  //raises compile time error.

	
	}
	
	public static void main(String[] args) {
		
		sumOf();  // Calling the sumOf method directly without creating an object
		
		int ans=sum2();        //one way by Calling sum2() and storing result in a variable
		System.out.println("Sum:"+ans);
		
		System.out.println("Sum:"+sum2());  //or calling sum2() directly inside println without storing	}
	}
}
