package com.kprit.tns.conditionalstatements;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		
		//printing the day according to their equivalent number.
		System.out.print("Enter Input:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String day;
		
		switch(input) {
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thursday";
			break;
		case 5:
			day="Friday";
			break;
		case 6:
			day="Saturday";
			break;
		case 7:
			day="Sunday";
			break;
		default:
			day="Invalid Input";
		}
		System.out.println(day);
		
		
		// performing an arithmetic operation based on a given symbol using switch-case.
		System.out.println("Enter the Operator:");
		char op=sc.next().charAt(0);
		System.out.println("Enter the num1:");
		int n1=sc.nextInt();
		System.out.println("Enter the num2:");
		int n2=sc.nextInt();
		
		switch(op) {
		case '+':
			System.out.println("Addition:"+(n1+n2));
			break;
		case '-':
			System.out.println("Subtraction:"+(n1-n2));
			break;
		case '*':
			System.out.println("Multiplication:"+(n1*n2));
			break;
		case '%':
			System.out.println("Modulo:"+(n1%n2));
			break;
		case '/':
			System.out.println("Division:"+(n1/n2));
			break;
		default:
			System.out.println("Invalid Operator");
		}
		
	}

}
