package com.arrays.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/**
 * Java program to find missing elements in a Integer array containing numbers
 * from 1 to 100.
 *
 * @author Javin Paul
 */
public class MissingNumberInArray {

	public static void main(String args[]) {

		// one missing number
		printMissingNumber(new int[] { 1, 2,4,6 }, 6);

	}

	/**
	 * A general method to find missing values from an integer array in Java.
	 * This method will work even if array has more than one missing element.
	 */
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);

		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		/*System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
				count);*/
		int lastMissingIndex = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			lastMissingIndex = lastMissingIndex+1;
			list.add(lastMissingIndex);
		}
		
		System.out.println(list);

	}

	/**
	 * Java method to find missing number in array of size n containing numbers
	 * from 1 to n only. can be used to find missing elements on integer array
	 * of numbers from 1 to 100 or 1 - 1000
	 */
	private static int getMissingNumber(int[] numbers, int totalElementsCount) {
		int expectedSum = totalElementsCount * ((totalElementsCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}

}
