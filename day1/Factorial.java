package com.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value : ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + a + " is : " + fact);

	}

}
