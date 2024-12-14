package com.day6;

public class ExceptionHandlingExample1 {

	int a = 10;

	public static void main(String[] args) {
		System.out.println("Before Exception...");

		// int a = 10 / 0; // Arithmetic Exception

		// int arr[] = {10, 20, 30};
		// System.out.println(arr[-1]); // Array Index out of bound Exception

		// int arr[] = new int[-1]; //Negative Array Size Exception

		// int a = Integer.parseInt("ABC"); // Number Format Exception

		ExceptionHandlingExample1 obj = null;
		System.out.println(obj.a); // Null pointer Exception

		System.out.println("After Exception...");

	}

}
