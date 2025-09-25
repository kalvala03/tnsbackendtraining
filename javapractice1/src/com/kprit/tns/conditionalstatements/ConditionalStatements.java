package com.kprit.tns.conditionalstatements;

public class ConditionalStatements {
	public static void main(String args[]) {
		
		//if Statement
		//when if cond is false, only outer if statement executes 
		if(10<5) {
			System.out.println("inside if");	
		}
		System.out.println("outside if");
		
		//when if cond is true, both outer and inner if statements executes 
		if(10>5) {
			System.out.println("inside if");	
		}
		System.out.println("outside if");
		
		//if else
		int n=10;
		if(n%2==0) {
			System.out.println("n is even");
		}
		else {
			System.out.println("n is odd");
		}
		
		//nested if
		//program to display a student's grade based on their score, using nested if-else statements.
		//Grade A: score ≥ 90
		//Grade B: score ≥ 80 but less than 90
		//Grade C: score ≥ 70 but less than 80
		//Grade D: score less than 70
		
		int score=85;
		if(score>=90){
			System.out.println("Grade A");
		}
		else {
			if(score>=80) {
				System.out.println("Grade B");
			}
			else {
				if(score>=70) {
					System.out.println("Grade C");
				}
				else {
					System.out.println("Grade D");
				}
			}
		}
		
		//if-else-if 
		//Finding the Maximum of Three Numbers
		int n1=10;
		int n2=50;
		int n3=75;
		if(n1>=n2 && n2>=n3) {
			System.out.println("n1 is maximum num");
		}
		else if(n2>=n3) {
			System.out.println("n2 is maximum num");
		}
		else{
			System.out.println("n3 is maximum num");
		}
	}

}
