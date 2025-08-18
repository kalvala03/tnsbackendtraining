package com.kprit.tns.staticimp;

public class Staticnestedclass { //We cannot declare a top-level class with a static modifier(outer class)
	static int a=10;
	int b=20;
	static class staticclass{ //we can declare nested classes as static(inner class)
		static void display() {
			System.out.println("This is Static nested class");
			System.out.println(a);  //allowed,bcz Doesn’t need an outer object,can only access outer class’s static members directly.
			//System.out.println(b);  // NOT allowed, needs Outer object
		}
	}
	
	public static void main(String[]args) {
		//Staticnestedclass.staticclass ob=new Staticnestedclass.staticclass();  //for non static method
		//ob.display();
		Staticnestedclass.staticclass.display();   //when method is static 
		Staticnestedclass obj=new Staticnestedclass (); //for non static variable
		System.out.println(obj.b);
		
	}
}
