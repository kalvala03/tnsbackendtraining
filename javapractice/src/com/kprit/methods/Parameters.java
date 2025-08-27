package com.kprit.methods;
import java.util.Scanner;

public class Parameters {
	public int sum(int a,int b) {      // the variables a and b are parameters
		int ans=a+b;
		return ans;
	}
	
	static String msg(String name) {
		name="Hello "+name;
		return name;
	}
	static String msg1(String naam) {
		naam="Hi "+naam;
		return naam;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		
		String res=sc.next();        //here instead of naam,another variable res also works
									// here 'res' variable stores input given by the user. 
		System.out.println(msg1(res));  // When passed to msg1(), it becomes the argument for parameter 'naam'
		
		Parameters obj =new Parameters();
		System.out.println(obj.sum(10,20));   //10,20 are arguments
        
		System.out.println(msg("kalyani"));
		sc.close();
	}

}
