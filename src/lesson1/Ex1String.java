package lesson1;

import java.util.Arrays;
import java.util.List;

/***
 * 
 * 
 * 
 * @author C5253526
 *  Create a string that consists of the first letter of each word in
the list of Strings provided. HINT: Use a StringBuilder to construct the
result
 *
 */
public class Ex1String {
	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("test","mahesh","rajesh","demo");
		
		StringBuilder sb = new StringBuilder();
		
		list.forEach(s -> sb.append(s.charAt(0)));
		
		System.out.println(sb.toString());
		
		
	}
	
	
	public String generateStringFromFirstletter(List<String> list) {
		
		return "";
	}

}
