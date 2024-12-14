package com.day6;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			// int a = 10 / 0;
			throw new ArithmeticException("Cannot Divide By Zero");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
