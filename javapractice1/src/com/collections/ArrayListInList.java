package com.collections;
import java.util.Scanner;
import java.util.ArrayList;  
/*  ArrayList → dynamic array, allows duplicates, maintains insertion order, fast random access, but slow insert/delete in middle.
	Use when search/read is frequent and insert/delete is rare.  */

public class ArrayListInList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// created ArrayList with initial capacity 3
		ArrayList<Integer> al=new ArrayList<>(3);
		
		//static adding
		al.add(4);
		al.add(10);
		al.add(6);
		al.add(7);
		al.add(9);
		System.out.println(al);
		
		
		//dynamic adding using loop
		System.out.println("Enter how many numbers u want to enter:");
		int n = sc.nextInt();
		System.out.println("Enter inputs:");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			al.add(num);
		}
		System.out.println(al);
		
		
		//multidimentional arraylist
		ArrayList<ArrayList<Integer>> matrix=new ArrayList<>(3);
		System.out.println("Enter inputs for 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter input for [" + i + "][" + j + "]: ");
                int num = sc.nextInt();
                matrix.get(i).add(num);
            }
        }

        // print the 2D ArrayList in nested form
        System.out.println("2D ArrayList (nested form): " + matrix);

        // print as matrix
        System.out.println("Matrix format:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
	}

}
