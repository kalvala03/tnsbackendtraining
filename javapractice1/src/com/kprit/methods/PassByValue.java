package com.kprit.methods;
import java.util.Arrays;

public class PassByValue {
	
	// i) method with primitives
    static int changeNum(int x) {
        x = 50;                 // only local copy is modified
        return x;               // returns 50
    }
    
    // ii)method with Non-Primitives (Objects)
    static void changeArray(int[] ar) {
        ar[0] = 90;             // modifies the actual object(stored in heap)
    }
    
    public static void main(String[] args) {
         
        // Primitives 
        int num = 10;    // 'num' is primitive,stored in stack
        
        System.out.println("Before method call, num = " + num); 
        changeNum(num);
        System.out.println("After method call, num = " + num);  // original not changes
        
        System.out.println();
        
        //Non-Primities
        int[] arr = {1, 2, 3, 4};  // reference stored in stack, object in heap
        
        System.out.println("Before method call, arr = " + Arrays.toString(arr));
        changeArray(arr);   // passes copy of reference → still points to same array
        System.out.println("After method call, arr = " + Arrays.toString(arr));
    }
}
