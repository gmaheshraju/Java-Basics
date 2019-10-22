package com.strings.solve;

/*Input: INDIA  
Replace Character: I 
Output: 1ND2A (Because I available in 2 places) */
public class CharacterReplace {

	public static void main(String[] args) {

		String result =replaceCharterwithDigit("INDIA",'I');
		System.out.println(result);
		
	}

	/*
	 * 
	 * take a loop if it matches replace with count variable if it repeats again
	 * increment count variable and append
	 */
	public static String replaceCharterwithDigit(String s1, char c) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == c) {
				count = count + 1;
				sb.append(count);
			} else {
				sb.append(s1.charAt(i));
			}

		}
		return sb.toString();
	}

}
