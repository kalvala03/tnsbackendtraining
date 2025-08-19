package com.kprit.tns.superkeyword;

public class SuperwithConstructors {
	/*
	class Parent{
		Parent(){
			System.out.println("Parent constructor");

		}
	}
	class Child extends Parent{
		Child(){
			//super(); if you don’t explicitly write super(), the compiler automatically inserts it for default constructors.
			System.out.println("child constructor");
		}
		
	}
	*/
	class Parent {
	    String surname;

	    Parent(String surname) {
	        this.surname = surname;  // just assigning, no print
	    }
	}

	class Child extends Parent {
	    String name;

	    Child(String surname, String name) {
	        super(surname);   // call parent constructor to set surname
	        this.name = name; // set child’s own variable
	    }

	    void display() {
	        // Accessing inherited variable directly
	        System.out.println("Surname (from Parent): " + surname);
	        System.out.println("Name (from Child): " + name);
	    }
	}

	 public static void main(String[] args) {
	        SuperwithConstructors ob1 = new SuperwithConstructors();
	        Child ob = ob1.new Child("Kalvala", "Kalyani");

	        ob.display(); 
	}

}
