package com.kprit.thiskeyword;

//In interfaces, 'this' in default methods refers to the implementing class object 
//and is used to access class details or call its methods.
// Interface variables are static,final. so, accessed via the interface name, not this.

public interface InInterface {
    String name = "Kalyani";   
    
    public void display();     // abstract method (implicitly public and abstract)

    // default method 
    default void print() {
        System.out.println(this.getClass().getName());
    }
}

class Demo implements InInterface {
	@Override
    public void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();   // Calls overridden method
        d.print();     // Calls default method from interface 
        System.out.println(InInterface.name); // Accessing interface variable
    }
}
