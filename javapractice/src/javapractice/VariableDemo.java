package javapractice;

public class VariableDemo {
	
	//Instance variable
	String var1;
	
	//Static variable
	static String var2="This is Static variable,declared using only Static keyword,accessed by using class name and are allocated memory only once.";
	
	public void method1() {
		
		//local variable
		String var3="This is Local Variable,declared insided the method and are accessed directly by their name.";
		System.out.println(var3);
	}
	
}
