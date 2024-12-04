package com.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter value : ");
		int a = sc.nextInt();
		System.out.println("value   factorial");

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
			System.out.println(i + "       " + fact);
		}
	}

}
