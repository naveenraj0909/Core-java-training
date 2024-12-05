package com.day2;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 2, 9, 4 };

		Arrays.sort(arr);

		// Sorting in Ascending
		System.out.println("Ascending Order...");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*Enhanced For Loop / For Each Loop
	      for(int i : arr){
		      System.out.println(i);
		   } */

		// Sorting in Descending
		System.out.println("Descending Order...");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
