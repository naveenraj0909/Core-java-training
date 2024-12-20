package com.day11;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// After Java 8: forEach to print each number
		numbers.forEach(number -> System.out.println(number));

	}

}
