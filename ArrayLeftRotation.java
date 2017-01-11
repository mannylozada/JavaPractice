package com.manny.practice;

import java.util.*;


public class ArrayLeftRotation {
    public static void shiftLeft(int[] arr, int n, int s) {
    	int[] rotated = new int[n];
    	
    	System.arraycopy(arr, s, rotated, 0, n-s);
    	System.arraycopy(arr, 0, rotated, n-s, s);
       
        for (int j = 0; j < n; j++) {
            System.out.print(rotated[j]);
            
            if (j < n - 1) {
                System.out.print(" ");
            }
        }
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        shiftLeft(a, n, k);
    }
}