package com.kprit.tns.superkeyword;

public class SuperwithVar {
	
	//If both parent and child have variables with the same name → child variable hides parent variable.
	//To access parent’s variable → use super.variableName.

	class Parent{
		int height=10;
		int breadth=5;
	}
	class Child extends Parent{
		int height=15;
		int width=6;
		//we can access the parent variable directly with super.varname inside any method/constructor/initializer of the child class, 
		//but not directly in main().
		Child(){
			System.out.println(super.height);
		}
	}
	public static void main(String[]args) {
		SuperwithVar obj=new SuperwithVar();
		Child ob=obj.new Child();
		//System.out.println(ob.height);  This will print the child class variable value.
	}
}
