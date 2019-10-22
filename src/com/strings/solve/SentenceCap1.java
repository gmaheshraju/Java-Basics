package com.strings.solve;

import java.util.Arrays;
import java.util.Scanner;

//import lesson1.String;
//import lesson1.StringBuilder;

public class SentenceCap1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String str = input.nextLine();

	/*	String[] words = str.split("\\s+");

		for (int i = 0; i < words.length; i++) {
			words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1, words[i].length());
		}

		// Join the array
		System.out.print(String.join(" ", words));*/
		
		
		
		String [] strArray = str.split(" ");
	    StringBuilder sb = new StringBuilder();
	    Arrays.asList(strArray)
	    .forEach(s -> sb.append(Character.toUpperCase(s.charAt(0))+s.substring(1)+" "));
	    String result = sb.toString();
	    
	    Arrays.asList(strArray).replaceAll(String::toUpperCase);
	    System.out.println(result);
	    
	    
	}
}