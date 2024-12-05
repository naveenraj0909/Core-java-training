package com.day2;
//Array of Array....It is not 2D array

public class ArrayOfArray {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) { // for outer loop
			for (int j = 0; j < arr[i].length; j++) { // for inner loop
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// Enhanced For Loop
		System.out.println("By Using Enhanced For loop");
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
