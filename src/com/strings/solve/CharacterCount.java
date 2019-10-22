package com.strings.solve;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		String s =  "savewatersaveearths";
		Map<Character,Integer> map = getCharacterCount(s);
		System.out.println(map);
		
	}

	
	
	public static Map<Character,Integer> getCharacterCount(String s){
		s =s.toLowerCase();
		Map<Character,Integer> mapObj= new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(!mapObj.containsKey(s.charAt(i))) {
				mapObj.put(s.charAt(i),1);
			}else {
				int count = mapObj.get(s.charAt(i));
				mapObj.put(s.charAt(i),count+1);
			}
			
		}
		
		return mapObj;
		
	}
}
