package com.kprit.tns.variabletypes;

public class VariableDemoMain {

	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		
		//calling instance variable
		System.out.println(obj.var1="This is Instance Variable,declared inside the class but outside the main and accessed by obj reference.");
		System.out.println();
		
		// calling static variable
		System.out.println(VariableDemo.var2);
		System.out.println();
		
		//calling local variable
		obj.method1();

	}

}
