package com.day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary ) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
}
	
	@Override
	public String toString() {
		return "Employee[[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class Java8AdditionalLabExercise {

	public static void main(String[] args) {
		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using stream functions
		System.out.println("Question 1 : ");
		List<Integer> list = Arrays.asList(1, 5, 8, 2, 9, 4, 7, 10, 13, 16, 10, 27, 17, 12, 2, 1, 5);
		List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list1);

		// 2. Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		System.out.println("\nQuestion 2 : ");
		List<Integer> list2 = list.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(list2);

		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?
		System.out.println("\nQuestion 3 :");
		List<Integer> duplicate = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println(duplicate);

		System.out.println("By using Set");
		Set<Integer> duplicate1 = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println(duplicate1);

//		List<Integer> duplicate12 = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).distinct()
//				.collect(Collectors.toList());
//		System.out.println("List : "+duplicate12);

		System.out.println("Count is : ");
		Long count = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).distinct().count();
		System.out.println(count);

		// 4. Given the list of integers, find the first element of the list using
		// Stream functions?
		System.out.println("\nQuestion 4 : ");
		int first = list.stream().findFirst().get();
		System.out.println(first);

		// 5. Given a list of integers, find the total number of elements present in the list using Stream
		// functions?
		System.out.println("\nQuestion 5 : ");
		long count1 = list.stream().count();
		System.out.println(count1);

		// 6. Given a list of integers, find the maximum value element present in it using Stream
		// functions?
		System.out.println("\nQuestion 6 : ");
		int max = list.stream().max((x, y) -> x - y).get();
		System.out.println(max);
		
		//7. Sort the Employee object using salary
		System.out.println("\nQuestion 7 : ");
		List <Employee> empList = Arrays.asList(new Employee(101, "Naveen", 5000),new Employee(102, "stevan", 2000),new Employee(103, "Gokul", 3000));
		List<Employee> sorted = empList.stream().sorted((x,y) -> y.salary - x.salary).collect(Collectors.toList());
		System.out.println(sorted);
		
		//8. Given a list of integers, sort all the values present in it using Stream functions?
		System.out.println("\nQuestion 8 : ");
		List<Integer> sorted2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted2);
		
		//9. Given a list of integers, sort all the values present in it in descending order using Stream
		//functions?
		System.out.println("\nQuestion 9 : ");
		List<Integer> sorted3 = list.stream().sorted((x,y) -> y - x).collect(Collectors.toList());
		System.out.println(sorted3);
		
		//10. Given an integer array nums, return true if any value appears at least twice in the array,
		//and return false if every element is distinct.
		System.out.println("\nQuestion 10 : ");
		boolean  dup = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).count()>0 ? true : false;
		System.out.println(dup);
		
		//11. Java 8 program to find factorial of given list of integer values
		System.out.println("\nQuestion 11 : ");
		List<Integer> factorial = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factorial2 = factorial.stream().map(x -> {
			int fact = 1;
			for(int i = 1; i<=x; i++)
				fact = fact * i;
				return fact;
		}).collect(Collectors.toList());
		System.out.println(factorial2);
		
	}
}

