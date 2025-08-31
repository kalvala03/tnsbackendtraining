package com.kprit.tns.superkeyword;

public class SuperwithConstructors {
	//default constructor
	class Parent1{
		Parent1(){
			System.out.println("Parent constructor");

		}
	}
	class Child1 extends Parent1{
		Child1(){
			//super(); if you don’t explicitly write super(), the compiler automatically inserts it for default constructors.
			System.out.println("child constructor");
		}
		
	}
	
	//Parameterized constructor
	class Parent {
	    String surname;

	    Parent(String surname) {
	        this.surname = surname;  // just assigning, no print
	    }
	}

	class Child extends Parent {
		String surname;
	    String name;

	    Child(String parentSurname, String childSurname, String name) {
	        super(parentSurname);       
	        this.surname = childSurname; // sets Child.surname
	        this.name = name;           // sets Child.name
	    }

	    void display() {
	        System.out.println("Parent's Surname (using super): " + super.surname);
	        System.out.println("Child's Surname (using this): " + this.surname);
	        System.out.println("Child's Name: " + this.name);
	    }	}

	 public static void main(String[] args) {
	        SuperwithConstructors ob1 = new SuperwithConstructors();
	        Child1 obj = ob1.new Child1();
	        Child ob = ob1.new Child("Kalvala","k.", "Kalyani");

	        ob.display(); 
	}

}
