package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String msg = "";

		do {
			System.out.println("Enter an option from below : ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition... ");
				System.out.println("Enter First number : ");
				int a = sc.nextInt();
				System.out.println("Enter Second number : ");
				int b = sc.nextInt();
				int c = a + b;
				System.out.println("Addition = " + c);
				break;
			case 2:
				System.out.println("Subtraction... ");
				System.out.println("Enter First number : ");
				int d = sc.nextInt();
				System.out.println("Enter Second number : ");
				int e = sc.nextInt();
				int f = d - e;
				System.out.println("Subtraction = " + f);
				break;
			case 3:
				System.out.println("Multiplication... ");
				System.out.println("Enter First number : ");
				int g = sc.nextInt();
				System.out.println("Enter Second number : ");
				int h = sc.nextInt();
				int i = g * h;
				System.out.println("Multiplication = " + i);
				break;
			case 4:
				System.out.println("Division... ");
				System.out.println("Enter First number : ");
				int j = sc.nextInt();
				System.out.println("Enter Second number : ");
				int k = sc.nextInt();
				int l = j / k;
				System.out.println("Division = " + l);
				break;
			case 5:
				System.out.println("Exiting...Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid choice..");
			}

			System.out.println("Do You want to continue [Yes | No] : ");
			msg = sc.next();
		} while (msg.equals("Yes"));
		System.out.println("Thank you");

	}

}
