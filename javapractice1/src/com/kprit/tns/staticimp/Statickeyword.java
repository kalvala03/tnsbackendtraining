package com.kprit.tns.staticimp;

public class Statickeyword {
	static  String var="This is a static variable"; //static keyword is independent on objects.
	static int a; //static variable
	int b=20;  //non static variable
	 static { 
		 System.out.println("This is a static block1");  
		 a=10;
	 }
	 static { 
		 System.out.println("This is a static block2");  
		 a+=5;
	 }
	 
	 static void meth1() {
		 System.out.println("This is a static method1");  
		 // b=20; // raises error ,non-static variable b cannot be referenced from a static context.
		 // meth2();  //raises error saying non-static method meth2() cannot be referenced from a static context
		 meth3();  //no error
		//System.out.println(this.a); //raises error when used this keyword in static method
	 }
	 
	 void meth2()
	    {    
	        System.out.println("This is a non Static method");
	        System.out.println(this.a); //no error  when used this keyword in non static method
	    }
	    
	  static void meth3()
	    {    
	        System.out.println("This is a Static method2");
	    }
	    
	public static void main(String[]args) {
		System.out.println(var);  
		System.out.println(a);   //overwrites as only one copy is created
		//System.out.println(b);  //raises error because it is a non static variable and depends on instances.
		Statickeyword ob=new Statickeyword();
		System.out.println(ob.b);    //now it doesnot raise any error.
		

	    // Calling the methods
	    meth1();        // static method, called using class name or directly
	    ob.meth2();     // non-static method, called using object
	    meth3();        // static method, called directly
		
	}
}
