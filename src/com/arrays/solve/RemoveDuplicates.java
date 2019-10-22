package com.arrays.solve;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		  Integer[] original ={1, 1, 2, 8, 9, 8, 4, 7, 4, 9, 1};
		  Set<Integer> set = new HashSet<>( Arrays.asList(original));
		  System.out.println(set);
		  
		  
	}

}
 