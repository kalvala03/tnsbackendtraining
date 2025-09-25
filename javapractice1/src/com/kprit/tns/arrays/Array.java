package com.kprit.tns.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		//ways of array declaration
		int[] arrname;
		String ar[];
		
		//array initialization
		//i)static: directly assigning values at declaration
		int[] n= {1,2,3,4,5};
		
		//ii)dynamic: creating array with fixed size
		int[] a1=new int[5];
		System.out.println(a1[0]);  //gives default value of int:0
		
		String[] a2=new String[5];
		System.out.println(a2[0]);  //gives default value of string:null
		
		//array of primitives
		int[] arr=new int[4];
		arr[0]=10;   // assigning values
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//System.out.println(arr[3]);
		
		//input using for loop
		System.out.println("Enter inputs(int type):");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();  // user enters value → stored in array
			System.out.print(arr[i]+" ");   // print as entered
		}
		System.out.println();
		
		// Using Arrays.toString() (import Arrays class to use it)
		// Arrays.toString() converts array into string format [a, b, c, d]

		System.out.println("Array using tostring: "+Arrays.toString(arr));
		
		//For-each (Enhanced For Loop)
		// Reads each element directly without using index
		System.out.println("Array using enhanced for loop:");
		for(int num : arr) {        //read as for num(every element) in array
			System.out.print(num+" ");   //print array
		}
		System.out.println();
		
	    //array of objects
		String[] str=new String[5];
		System.out.println("Enter inputs(string type):");
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		
		//Arrays are mutable so we can modify
		str[0]="kalyani";
		System.out.println(Arrays.toString(str)); 
		
	}
}
