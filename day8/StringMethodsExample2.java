package com.day8;

public class StringMethodsExample2 {

	public static void main(String[] args) {
		String s2 = "Java";

		char ch[] = s2.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		// OR
		for (int i = 0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i));
		}

		String s3 = "Welcome to Java World";
		String temp[] = s3.split(" ");
		for (String s : temp) {
			System.out.println(s);
		}

	}

}
