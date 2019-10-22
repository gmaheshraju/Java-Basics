package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snippet {
	/**
	   * Exercise 1
	   *
	   * Create a string that consists of the first letter of each word in the list
	   * of Strings.
	   */
	  private static void exercise1() {
	    List<String> list = Arrays.asList(
	        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
	
	    StringBuilder sb = new StringBuilder();
	    list.forEach(s -> sb.append(s.charAt(0)));
	    String result =sb.toString();
	    System.out.println("Exercise 1 result = " + result);
	  }
	
	  /**
	   * Exercise 2
	   *
	   * Remove the words that have odd lengths from the list.
	   */
	  private static void exercise2() {
	    List<String> list = new ArrayList<>(Arrays.asList(
	        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
	    list.removeIf(s-> s.length() % 2 != 0);
	    list.forEach(System.out::println);
	  }
	  
	  public static void main(String[] args) {
		  
		  exercise1();
		  exercise2();
		
	}
}

