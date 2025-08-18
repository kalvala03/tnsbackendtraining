package com.kprit.tns.finalkeyword;

public class Finalkeyword {
	//different ways to intialize final variable
		class Demo {
				  
			    // a final variable direct initialize
			  final int THRESHOLD = 5;
			    
			    // a blank final variable
			  final int CAPACITY;
			    
			    // another blank final variable
			  final int  MINIMUM;
			    
			    // a final static variable PI direct initialize
			  static final double PI = 3.141592653589793;
			    
			    // a  blank final static  variable
			  static final double EULERCONSTANT;
			    
			    // instance initializer block for initializing CAPACITY
			  {
			        CAPACITY = 25;
			  }
			    
			    // static initializer block for initializing EULERCONSTANT
			  static{
			        EULERCONSTANT = 2.3;
			  }
			    
			    // constructor for initializing MINIMUM
			  public Demo() 
			  {
			        MINIMUM = -1;
			  }
			        
	}

		public static void main(String[] args) {
			final int num = 5;
			// num = 10; // Error, cannot assign a value to final variable num
		
			//final with mutable objects
			final StringBuilder sb = new StringBuilder("hello");
			sb.append(" World"); //  Allowed
			System.out.println(sb); // Hello World
			// sb = new StringBuilder("Hi"); // Not allowed: changing the reference

			//final with immutable objects(like strings)
			final String str = "Java";
			
			//str.concat(" Rocks"); // This creates a new object, doesn't modify original
			System.out.println(str); 

	}

}
