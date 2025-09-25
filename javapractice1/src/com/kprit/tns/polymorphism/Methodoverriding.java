package com.kprit.tns.polymorphism;

public class Methodoverriding {
	
	//method overriding is when a subclass provides its own version of a method defined in its superclass,
	//keeping the same name, return type, and parameters.
	
	class Payment{
		void pay(double amount) {
			System.out.println("Paying amount"+amount);		
		}
	}
	class Creditcard extends Payment{
		void pay(double amount) {
			System.out.println("Paid "+amount+" using credit card");
		}
	}
	class Paypal extends Payment{
		void pay(double amount) {
			System.out.println("paid "+amount+" using paypal");
		}	
	}
	class UPI extends Payment{
		void pay(double amount) {
			System.out.println("paid "+amount+" using UPI");
		}
	}

	public static void main(String[] args) {
		//parent obj=new child;
		Methodoverriding ob=new Methodoverriding();
		Payment obj=ob.new Creditcard();
		obj.pay(500);
		Payment obj1=ob.new Paypal();
		obj1.pay(1000);
		Payment obj2=ob.new UPI();
		obj2.pay(800);
	}

}
