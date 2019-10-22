package com.arrays.solve;

import java.util.Arrays;

public class TestMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7 };
		System.out.println("missing numbers in given array");
		for (int j = 1; j < arr.length; j++) {
			if (Arrays.binarySearch(arr, j) < 0) {
				System.out.println(j);
			}
		}
	}

}
