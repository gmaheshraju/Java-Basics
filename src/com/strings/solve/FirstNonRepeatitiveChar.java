package com.strings.solve;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatitiveChar {
	/*
	 * * Using HashMap to find first non-repeated character from String in Java.
	 * * Algorithm : * Step 1 : Scan String and store count of each character in
	 * HashMap * Step 2 : traverse String and get count for each character from
	 * Map. * Since we are going through String from first to last character, *
	 * when count for any character is 1, we break, it's the first * non
	 * repeated character. Here order is achieved by going * through String
	 * again.
	 */
	public static char firstNonRepeatedCharacter(String word) {
		Map<Character, Integer> scoreboard = new LinkedHashMap<>();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			Integer count = scoreboard.get(c);
			scoreboard.put(c, (count == null) ? 1 : count + 1);
		}
		System.out.println(scoreboard);
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}
	
	
	
	public static void main(String[] args) {
		char ch =firstNonRepeatedCharacter("testalgin");
		char ch2=firstNonRepeatedCharacter("abcdefghija");
		System.out.println(ch);
		System.out.println(ch2);
	}
}
