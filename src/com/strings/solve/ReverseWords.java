package com.strings.solve;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String s ="Reverse Me";
		String result = reverse(s);
		
		System.out.println(result);
		
		
	}
	
	public static String reverse(String s) {
		String result ="";
		for (int i=s.length()-1;i>=0;i--) {
			
			result+=s.charAt(i);
		}
		
		return result;
	}

}
