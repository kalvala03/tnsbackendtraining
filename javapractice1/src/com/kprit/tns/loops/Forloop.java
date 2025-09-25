package com.kprit.tns.loops;

import java.util.Scanner;

public class Forloop {
	public static void main(String[]args) {
		//printing factors of given number
		
		//eg: Factors of 18   -->   1 2 3 6 9 18  
				//If u divide 18 with these Numbers(1 2 3 6 9 18) then u can get remiander as 0 in all these scenarios.
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println("Factors of "+num+":");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		//Write a program to check given number is prime number or not.
		System.out.print("Enter a num:");
		int n=sc.nextInt();
		int fc=0;
		for(int i = 2; i*i <= n; i++){
			if(n%i==0) {
				fc++;
			}
		}
		if(fc==0) {
			System.out.println(n+" is a primenumber");
		}
		else {
			System.out.println(n+" is not a primenumber");
		}
	}
}
