package com.kprit.tns.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//static and jagged array(each row can have a different length.)
		int[][] arr= {
				{1,2,3},
				{4,5},
				{7,8,9}
		};
		
		//dynamic
		// Creating a 3x3 2D array (2 rows, 2 columns)
		int[][] ar=new int[2][2];    
		System.out.println("enter inputs:");
		
		for(int row=0;row<ar.length;row++) {     // loop through rows
			for(int col=0;col<ar[row].length;col++) {    //loop through columns
				ar[row][col]=sc.nextInt();
			}
		}
		
		/*
		for(int row=0;row<ar.length;row++) {     // loop through rows
			for(int col=0;col<ar[row].length;col++) {    //loop through columns
				System.out.print(ar[row][col]+" ");
			}
			System.out.println();
		}
		*/
		
		for(int row=0;row<ar.length;row++) {  
			System.out.println(Arrays.toString(ar[row]));
		}
		
		//using for each loop
		
		//We use int[] in for(int[] row : ar) bcz each element of a 2D array is itself a 1D array of integers, not a single integer.
		for(int[] row:ar) {        // row is an int[]
			System.out.println(Arrays.toString(row));
		}
	}	
}
