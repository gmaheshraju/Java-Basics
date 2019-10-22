package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class TestStreams {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		Stream<Integer> streams = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		streams.forEach(p -> System.out.println(p));

		List<Integer> list = new ArrayList<Integer>();
		list.add(44);
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream3 = list.stream().sorted();
		stream3.forEach(p -> System.out.print(p));

		Stream<Date> stream4 = Stream.generate(() -> {
			return new Date();
		}).limit(4);
		stream4.forEach(p -> System.out.println(p));

		IntStream stream5 = "12345_abcdefg".chars();
		stream5.forEach(p -> System.out.println(p));

		// OR

		Stream<String> stream6 = Stream.of("A$B$C".split("\\$"));
		stream6.forEach(p -> System.out.println(p));

		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}
		Stream<Integer> stream7 = list2.stream();
		List<Integer> evenNumbersList = stream7.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
		System.out.println(list2);
		Stream<Integer> stream8 = list2.stream();
		Integer[] evenNumbersArr = stream8.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.add("Akash");
		memberNames.add("Anand");

		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		memberNames.stream().filter((s) -> s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);

		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		memberNames.forEach(System.out::println);

		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.print(memNamesInUppercase);

		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);
		
		
		long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

		System.out.println(totalMatched);
		
		Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		
		
		 List<Integer> list6 = new ArrayList<Integer>();
         for(int i = 1; i< 100000000; i++){
             list.add(i);
         }
         //Here creating a parallel stream
         Stream<Integer> stream9 = list.parallelStream(); 
         Integer[] evenNumbersArr2 = stream9.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr2);
         
         
         List<Employee> employees = new ArrayList<Employee>();
         
         employees.add(new Employee(1, "Lokesh", 36));
         employees.add(new Employee(2, "Alex", 46));
         employees.add(new Employee(3, "Brian", 52));
         
         employees.add(new Employee(3, "Brian", 10));
          
         Comparator<Employee> comparator = Comparator.comparing( Employee::getAge );
         employees.add(new Employee(3, "Brian", 52));
         
         // Get Min or Max Object
         Employee minObject = employees.stream().min(comparator).get();
         Employee maxObject = employees.stream().max(comparator).get();
          
         System.out.println("minObject = " + minObject);
         System.out.println("maxObject = " + maxObject);

	}

}
