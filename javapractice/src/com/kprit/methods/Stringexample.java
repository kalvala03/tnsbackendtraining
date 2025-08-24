package com.kprit.methods;

public class Stringexample {
	public void greetings() {
		System.out.println("Hello");
	}
	
	public String msg() {
		String ans="kalyani";
		return ans;
	}
	
	static String display() {     //static method
		String msg="This is display method";
		return msg;
	}
	
	static String print() {    //static method 
		return "How are you?";
	}

	public static void main(String[] args) {
		Stringexample obj=new Stringexample();
		obj.greetings();
		System.out.println(obj.msg());
		System.out.println(print());      //static method, must call directly
		
		String msg=display();
		System.out.println(display());    
	}

}
