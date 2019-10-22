package com.solvingInterviewPuzzles;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMissingNumbersLogic {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5 };
		List<Integer> list =find(a);
		System.out.println(list);

	}

	public static List<Integer> find(int[] input) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };// create a new array without
												// missing numbers
		List<Integer> list = new ArrayList<>();
		
		List<Integer> l = new ArrayList<Integer>();// list for missing numbers
		Map<Integer, Integer> m = new HashMap<>();

		// populate a hashmap with the elements in the new array
		for (int i = 0; i < input.length; i++) {
			m.put(input[i], 1);
		}
		// loop through the given input array and check for missing numbers
		for (int i = 0; i < a.length; i++) {
			if (!m.containsKey(input[i]))
				l.add(input[i]);
		}
		return l;
	}

}
