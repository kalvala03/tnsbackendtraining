package com.kprit.tns.inheritance;

//Hybrid inheritance is a combination of two or more types of inheritance.
//It is achieved here by combining Single Inheritance (Employee extends Person)
//and multiple interface implementation (Employee implements Work, Salary).

public class HybridInheritance {

	// Base class
	class Person {
	    void personalInfo() {
	        System.out.println("I am a person with a name and age.");
	    }
	}

	interface Work {
	    void doWork();
	}

	interface Salary {
	    void getSalary();
	}

	// Derived class using hybrid inheritance
	class Employee extends Person implements Work, Salary {
	    @Override
	    public void doWork() {
	        System.out.println("Employee works on software development.");
	    }

	    @Override
	    public void getSalary() {
	        System.out.println("Employee receives monthly salary.");
	    }
	}

	// Main class
	public static void main(String[] args) {
	    HybridInheritance  ob=new HybridInheritance ();
	    Employee e = ob.new Employee();
	    e.personalInfo(); 
	    e.doWork();       
	    e.getSalary();    
	    }
}
