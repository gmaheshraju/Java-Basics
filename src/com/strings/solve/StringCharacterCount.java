package com.strings.solve;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterCount {

	public static String SPACE=" ";
	public static void main(String args[]) {

		String s = "this is a test this is a test";
		String[] splitted = s.split(SPACE);
		
		Map<String,Integer> wordCount=getWordMap(splitted);
		displayMap(wordCount);

	}

	public static Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			if (!map.containsKey(s)) { // first time we've seen this string
				map.put(s, 1);
			} else {
				int count = map.get(s);
				map.put(s, count + 1);
			}
		}
		return map;
	}
	
	public static void displayMap(Map<String,Integer> map){
		
		for(Map.Entry<String, Integer> obj : map.entrySet()){
			System.out.println("key ->"+obj.getKey()+"value -> "+obj.getValue());
		}
		
		map.forEach((key, value) -> {
		    System.out.println("Key : " + key + " Value : " + value);
		});
	}
	
	public static Map<String,Integer> getWordMap(String[] strings){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : strings) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
	
		}
		return map;
	}
	
	
	

}
