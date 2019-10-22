package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class ParllellStreams {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		 long t =System.currentTimeMillis();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         //Here creating a parallel stream
         Stream<Integer> stream9 = list.parallelStream(); 
         Integer[] evenNumbersArr2 = stream9.filter(i -> i%2 == 0).toArray(Integer[]::new);
        // System.out.println(evenNumbersArr2);
         long e =System.currentTimeMillis();
         long total = e -t;
         System.out.println(total);
         
         
         long t1 =System.currentTimeMillis();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         //Here creating a parallel stream
         Stream<Integer> stream99 = list.stream(); 
         Integer[] evenNumbersArr22 = stream99.filter(i -> i%2 == 0).toArray(Integer[]::new);
        // System.out.println(evenNumbersArr2);
         long e2 =System.currentTimeMillis();
         long total2 = e2 -t1;
         System.out.println(total2);
         
         Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                 .max(Comparator.comparing(Integer::valueOf))
                 .get();

         Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                 .min(Comparator.comparing(Integer::valueOf))
                 .get();

         		System.out.println("maxNumber = " + maxNumber);
         		System.out.println("minNumber = " + minNumber);
         		
         		 List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
         		 IntSummaryStatistics stats = numbers.stream()
         		                                     .mapToInt((x) -> x)
         		                                     .summaryStatistics();
         		 System.out.println(stats);
         		  
         		 Integer maxNumber2 = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
	}

}
