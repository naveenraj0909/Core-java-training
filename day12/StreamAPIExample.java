package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
	/**
	 * -> = definition 
	 * :: = Method reference
	 * filter() = intermediate operation 
	 * forEach() = Terminal operation
	 * count() = Terminal operation
	 * collect() = Terminal operation
	 * map() = Intermediate operation
	 */

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 9, 6, 7, 4, 8);

		numbers.stream()
		.filter(x -> x % 2 == 0)
		.forEach(System.out::println);

		
		System.out.println("Count of even numbers");
		long count = numbers.stream()
				.filter(x -> x % 2 == 0)  //It is for filter according to the condition
				.count(); //Counting the filtered condition
		System.out.println(count);
		
		
		System.out.println("Collecting in List");
		List<Integer> evenNumber = numbers.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumber);
		
		
		System.out.println("Multiply by 10 for even numbers");
		List<Integer> evenNumber1 = numbers.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(evenNumber1);

	}

}
