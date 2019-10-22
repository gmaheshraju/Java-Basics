package com.arrays.solve;

import java.util.Arrays;

public class LargestEvenNumberInArray {
	
	public static void main(String[] args) {
	    int[] a = new int[]{10, 46, 780, 32, 3, 80, 92, 11, 39, 57};
	    System.out.println(Arrays.toString(a));
	    findLargestEvenNumber(a);
	}

	private static int findLargestEvenNumber(int[] a) {
		if (a == null || a.length == 0) { 
			return 0; 
		}
	    int largest = Integer.MIN_VALUE;
	    for (int number : a) {
	        if (number % 2 == 0 && number > largest) {
	        	largest = number;
	        }
	    System.out.println(largest);
	    
	    return largest;
	    }
		return largest;

	}
}
