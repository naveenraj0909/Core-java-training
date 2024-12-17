package com.day8;

//equals vs == operator
public class StringMethodsExample3 {

	public static void main(String[] args) {

		String s1 = new String("Java"); // It will create in Heap
		String s2 = new String("Java");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));

		String s3 = "Java"; // It is string literal. It will create in String pool
		String s4 = "Java";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

	}

}
