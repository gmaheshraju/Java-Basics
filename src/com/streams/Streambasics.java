package com.streams;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streambasics {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3");
		Stream<String> stream = list.stream();

		System.out.println(list);
		System.out.println(stream);

		String[] strs = { "1", "2", "3" };
		Stream<String> stream1 = Arrays.stream(strs);

		int[] ints = { 1, 2, 3 };
		IntStream stream2 = Arrays.stream(ints);

		// Internal iteration, using new default method
		// Iterable#forEach(Consumer<? super T> action)
		// java7
		List<String> list1 = Arrays.asList("Apple", "Orange", "Banana");
		for (String s : list1) {
			System.out.println(s);
		}

		// java8
		List<String> list2 = Arrays.asList("Apple", "Orange", "Banana");
		// using lambda expression
		list2.forEach(s -> System.out.println(s));
		// or using method reference on System.out instance
		list2.forEach(System.out::println);

		// Counting even numbers in a list, using Collection#stream() and
		// java.util.stream.Stream

		// java7
		List<Integer> list3 = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		int count = 0;
		for (Integer i : list3) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

		// java8

		long count1 = list3.stream().filter(s -> s % 2 == 0).count();

		System.out.println(count1);

		// java7

		List<Integer> list4 = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		List<Integer> evenList = new ArrayList<>();
		for (Integer i : list4) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println(evenList);

		// java8

		List<Integer> list7 = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		List<Integer> evenList2 = list7.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList2);
		
		list7.stream().filter(s -> s%2 ==0).forEach(System.out::println);
		
		
		// java7
		
		List<Integer> list8 =
		        Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		int sum = 0;
		for (Integer i : list8) {
		    if (i % 2 == 0) {
		        sum += i;
		    }
		}
		System.out.println(sum);
		
		
		//java 8
		
		int sum2 =list8
				.stream()
				.filter(i -> i%2 ==0)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("sum2"+sum2);

		
		int sum3 = list8.stream()
		              .filter(i -> i % 2 == 0)
		              .reduce(0, (i, c) -> i + c);
		System.out.println(sum3);
		
		//Finding whether all integers are less than 10 in the list
		
		//java7
		List<Integer> list9 =
		        Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		boolean b = true;
		for (Integer i : list9) {
		    if (i >= 10) {
		        b = false;
		        break;
		    }
		}
		System.out.println(b);
		
		
		//java8
		
		boolean flag = list9.stream().allMatch(i -> i<10);
		
		System.out.println("flag"+flag);
		
		boolean flag2 = list9.stream().anyMatch(i -> i<10);
		
		System.out.println("flag2"+flag2);
		
		
		//Finding all sub-directory names in a directory. Using new static methods, Arrays#stream(T[] array)
		
		List<String> allDirNames = new ArrayList<>();
		for (File file : new File("c:\\").listFiles()) {
		    if(file.isDirectory()){
		        allDirNames.add(file.getName());
		    }
		}
		System.out.println(allDirNames);
		
		List<String> allDirNames2 =
			    Arrays.stream(new File("c:\\")
			          .listFiles())
			          .filter(File::isDirectory)
			          .map(File::getName)
			          .collect(Collectors.toList());
			System.out.println(allDirNames2);
			
			
			Arrays.stream(new File("c:\\").listFiles()).filter(File::isDirectory).map(File::getName)
			.collect(Collectors.toList());
	}

}
