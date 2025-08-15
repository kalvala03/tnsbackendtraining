package com.kprit.tns.superkeyword;

public class SuperwithVar {
	//Use of super with Variables
	//if both the base class and the subclass have a member with the same name, the subclass variable hides the base class variable.
	//We can access the base class’s variable inside the subclass using the super keyword.
	class Parent{
		int height=10;
		int breadth=5;
	}
	class Child extends Parent{
		int height=15;
		int width=6;
		void display(){
			System.out.println(super.height);
		}
	}
	public static void main(String[]args) {
		SuperwithVar obj=new SuperwithVar();
		Child ob=obj.new Child();
		//System.out.println(ob.height);
		ob.display();
	}
}
