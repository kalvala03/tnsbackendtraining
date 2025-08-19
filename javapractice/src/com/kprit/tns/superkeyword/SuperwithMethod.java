package com.kprit.tns.superkeyword;

public class SuperwithMethod {
	class Base{
		void msg() {
			System.out.println("This method is from Parent class");
		}
	}
	class Subclass extends Base{
		void msg() {
			super.msg();
			System.out.println("This method is from Child class");
		}
	}
				
	public static void main(String[]args) {
		SuperwithMethod ob=new SuperwithMethod();
		Subclass obj=ob.new Subclass();
		obj.msg();
	}
}
