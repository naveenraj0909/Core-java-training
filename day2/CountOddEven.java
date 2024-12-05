package com.day2;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int evenCount = 0;
		int oddCount = 0;

		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = oddCount + 1;
			}
		}
		System.out.println("Even Count is : " + evenCount);
		System.out.println("Odd count is : " + oddCount);
	}

}
