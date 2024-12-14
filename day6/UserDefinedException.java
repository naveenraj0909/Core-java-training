package com.day6;

import java.util.Scanner;

class AgeException extends Exception {
	@Override
	public String toString() {
		return "Ohh Noo!!...You are Not Eligible to vote";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		if (age >= 18)
			System.out.println("Congratulation...You are Eligible to vote");
		else {
			try {
				throw new AgeException();
			} catch (AgeException e) {
				System.out.println(e);
			}
		}
	}
}
