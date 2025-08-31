package com.kprit.tns.superkeyword;

public class SuperwithVar {
	
	//If both parent and child have variables with the same name → child variable hides parent variable.
	//To access parent’s variable → use super.variableName.
	//Note:super() is not applicable for local variables.

	class Parent{
		int height=10;
		int breadth=5;
	}
	class Child extends Parent{
		int height=15;
		int width=6;
		
		//Super can be used only inside a constructor, instance method, or initializer block of the child class.
		//It cannot be used in main() directly because main() is a static method, 
		//and super works only in the context of an object, not in a static context.
		
		Child(){
			System.out.println(super.height);  // This will print the Parent class variable value.
			System.out.println(height);  // This will print the child class variable value.
		}
	}
	public static void main(String[]args) {
		SuperwithVar obj=new SuperwithVar();
		Child ob=obj.new Child();
	}
}
