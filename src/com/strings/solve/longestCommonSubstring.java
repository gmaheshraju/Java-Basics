package com.strings.solve;

import java.util.*;

public class longestCommonSubstring {
	static int maxlength = 0;
	static String longestSubString;

	
	/*
	 * loop first string 
	 * loop second string  start position would be i+1
	 * take substring from i and j from string1
	 * 
	 * 
	 * if max < substring length then assign max  to substring length
	 * in t
	 * 
	 */
	public static String generate(String string1, String string2) {
		String str;
		for (int i = 0; i <= string1.length() - 1; i++) {
			for (int j = i + 1; j <= string1.length(); j++) {
				str = string1.substring(i, j);
				if (string2.contains(str)) {
					if (maxlength < str.length()) {
						maxlength = str.length();
						longestSubString = str;
					}
				}
			}
		}

		return longestSubString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter the two strings ");
		s1 = sc.next();
		s2 = sc.next();
		generate(s1, s2);
		System.out.println("Longest common substring is " + longestSubString);
	}
}