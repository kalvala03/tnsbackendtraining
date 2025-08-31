package com.kprit.tns.superkeyword;

public class SuperwithMethod {
	class Base{
		void msg() {
			System.out.println("This method is from Parent class");
		}
	}
	class Subclass extends Base{
		@Override
		void msg() {
			//super.msg();    //use when u want both parent and child class details
			System.out.println("This method is from Child class");
		}
		//Non-Static method
		void dummy() {
			super.msg();
		}
	}
				
	public static void main(String[]args) {
		SuperwithMethod ob=new SuperwithMethod();
		Subclass obj=ob.new Subclass();
		//obj.msg();   call to access both parent and child class details
		obj.dummy();    //call Non-Static method
	}
}
