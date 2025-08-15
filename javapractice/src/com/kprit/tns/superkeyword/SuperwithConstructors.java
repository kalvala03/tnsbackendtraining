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
	class Parent{
		Parent(String name){
			System.out.println("Parent constructor:"+name);

		}
	}
	class Child extends Parent{
		Child(String name){
			super(name);  //If the parent only has a parameterized constructor  then writing super(...) in the child’s constructor becomes mandatory.
			//System.out.println("Child constructor:"+name);  //comment this if u want only parent construnctor to invoke
		}
		
	}
	
	public static void main(String[]args) {
		SuperwithConstructors ob1=new SuperwithConstructors();
		Child ob=ob1.new Child("kalyani");
	}
}
