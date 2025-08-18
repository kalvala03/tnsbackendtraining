package com.kprit.tns.loops;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// Reversing a number
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num:");
		int num=sc.nextInt();
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("reverse is:"+rev);

	}

}
