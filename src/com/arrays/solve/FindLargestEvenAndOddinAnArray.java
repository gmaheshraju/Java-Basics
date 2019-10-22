package com.arrays.solve;

public class FindLargestEvenAndOddinAnArray {

	static class EvenOddPair {

		static int maxodd = Integer.MIN_VALUE;
		static int maxeven = Integer.MIN_VALUE;
	}

	public static void main(String[] args) {

		int[] intArray = { 10, 20, 4, 5, 0, 34, 200, 21, 245 };

		EvenOddPair pair = getMaxOddAndEvenFromAnArray(intArray);
		System.out.println("evens is" + pair.maxeven + "odd is" + pair.maxodd);
	}

	public static EvenOddPair getMaxOddAndEvenFromAnArray(int[] intAray) {
		EvenOddPair pair = new EvenOddPair();
		int maxEven = EvenOddPair.maxeven;
		int maxodd = EvenOddPair.maxodd;
		for (int i = 0; i < intAray.length; i++) {

			if (intAray[i] % 2 == 0 && intAray[i] > maxEven) {
					maxEven = intAray[i];
			} else {
				if (intAray[i] > maxodd) {
					maxodd = intAray[i];
				}
			}

			pair.maxeven = maxEven;
			pair.maxodd = maxodd;

		}
		return pair;

	}

}
