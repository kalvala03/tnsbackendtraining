package com.collectionsAssignment;
import java.util.*;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//i)WAP to print sum & avg of the elements present in the list
		ArrayList<Integer> al=new ArrayList<>();
		
		System.out.println("Enter size:");
		int size=sc.nextInt();
		
		System.out.println("Enter Elements:");
		
        for(int i=0;i<size;i++) {
        	int num=sc.nextInt();
        	al.add(num); 	
        }
        System.out.println(al);
        
        int sum=0;
        for(int i:al) {
        	sum+=i;
        }
        int avg=(sum)/al.size();
        System.out.println("sum:"+sum);
        System.out.println("Avg:"+avg);
        
        
        //ii)WAP to print sum of even numbers present in the list
        
        int evensum=0;
        for(int i:al) {
        	if(i%2==0) {
        		evensum+=i;
        	}
        }
        System.out.println("sum of even :"+evensum);
        
        
        // iii) WAP to split the list into two lists
        int mid=al.size()/2;
        ArrayList<Integer> first=new ArrayList<>(al.subList(0, mid));
        ArrayList<Integer> second=new ArrayList<>(al.subList(mid,al.size()));
        
        System.out.println("Original"+al); 
        System.out.println(first);
        System.out.println(second);
        
        // iv) WAP to merge two lists into a single list
        first.addAll(second);
        System.out.println("Merged list"+first);
        
        sc.close();
        
	}
}
