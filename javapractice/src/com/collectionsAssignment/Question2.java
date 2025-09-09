package com.collectionsAssignment;

import java.util.*;

public class Question2 {
	public static void main(String[] args) {
		
		//WAP to print the duplicates along with its count
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Enter size:");
		int n=sc.nextInt();
		
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++) {
			String str=sc.next();
			al.add(str); 
		}
		System.out.println(al);
		
		ArrayList<String> printed=new ArrayList<>();
		
		boolean found=false;
		for(String s:al) {
			int c=Collections.frequency(al, s);
			if(c>1 && !printed.contains(s)) {
				System.out.println(s+"-"+c);
				printed.add(s);
				found=true;
			}
			
		}
		if(!found)
			System.out.println("No duplicates");
	}
}
