package com.kprit.tns.constructor;

public class ConstructorDemo {
	String name;
	int rollno;
	
	/*
	Note-1--->If no constructor is written in a class, Java automatically provides a default constructor (with no parameters).
	It initializes object variables with default values (like 0, null, false).
	
	
	Note-2--->In Java, if we don’t initialize instance variables, they automatically get default values 
	for example, null for objects like String and 0 for numeric types like int.
	public ConstructorDemo(){
		// No initialization here
	}
	*/
	
	
	// 1. Non-parametarized Constructor
	public ConstructorDemo(){
		name="kalyani";
		rollno=548;
		System.out.println("This is a Non-Parameterized Constructor");
	}
	
	// 2. Parameterized Constructor
	public ConstructorDemo(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		System.out.println("This is a Parameterized Constructor");
	}
	
	// 3. Copy Constructor
    // Creates a new object by copying the values of an existing object.
	ConstructorDemo(ConstructorDemo dupbook){
		this.name=dupbook.name;
		this.rollno=dupbook.rollno;
		System.out.println("This is a copy Constructor");
	}
	

	public static void main(String[]args) {
		ConstructorDemo obj=new ConstructorDemo();   //calls Non-parametarized Constructor
		System.out.println(obj.name);
		System.out.println(obj.rollno);
		ConstructorDemo obj1=new ConstructorDemo("Kavitha", 123);  //calls parametarized Constructor
		System.out.println(obj1.name);
		System.out.println(obj1.rollno);
		ConstructorDemo obj2=new ConstructorDemo(obj1);  //calls copy Constructor
		System.out.println(obj2.name);
		System.out.println(obj2.rollno);
		
	}
}
