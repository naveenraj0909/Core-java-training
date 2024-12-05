package com.day2;

import java.util.Scanner;

public class DuplicateNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int duplicateCount = 0;

		// Initializing array elements with user input
		System.out.println("Enter the " + arr.length + " Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Duplicate Count
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = i + 1; arr[i] != -1 && j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}

			}
			if (count > 0) {
				duplicateCount++;
			}
		}
		System.out.println("Duplicate Count is : " + duplicateCount);

	}

}
