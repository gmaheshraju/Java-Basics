package com.samples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class PracticeStreams {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

		List<Integer> even = integers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "");
		
		
		 StringBuilder sb = new StringBuilder();
		    strings.forEach(s -> sb.append(Character.toUpperCase(s.charAt(0))+s.substring(1)+" "));
		    String result = sb.toString();
		
		LongSummaryStatistics stats = integers.stream().mapToLong(x -> (x)).summaryStatistics();

		List<String> st = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
}
