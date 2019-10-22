package com.strings.solve;

import java.util.Scanner;

public class AnagramWithoutBuiltIn {

	public static String sort(String s) {
		char arr[] = s.toLowerCase().toCharArray();
		char b;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					b = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = b;
				}
			}
		}
		s = new String(arr);
		return s;
	}

	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings ");
		s1 = sc.next();
		s2 = sc.next();
		if(s1.length() != s2.length()) {
			System.out.println("They are not anagrams");
			return;
		}
		s1 = sort(s1);
		s2 = sort(s2);
		if (s1.equals(s2))
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");
	}

}
