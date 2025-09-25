package com.kprit.tns.polymorphism;

public class MethodOverloading {
	
	//Method Overloading is when you have multiple methods in the same class with the same name but different parameters
	//It allows the same action to be performed in different ways.
	
	class Printer{
		void print(int pagenum) {
			System.out.println("Printing page:" + pagenum);
		}
		void print(int startpage,int endpage) {
			System.out.println("Print from "+startpage+" to "+endpage);
		}
		void print(int startpage,int endpage,String color) {
			System.out.println("Print from "+startpage+" to "+endpage+" in "+color);
		}
	}

	public static void main(String[] args) {
		MethodOverloading ob=new MethodOverloading();
		Printer obj=ob.new Printer();
		obj.print(5);
		obj.print(1,10);
		obj.print(1,15,"color");
	}

}
