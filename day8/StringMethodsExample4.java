package com.day8;

//Strings are immutable in Java
//StringBuffer are mutable in java

public class StringMethodsExample4 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		s1.concat(" World");
		System.out.println(s1);

		s1 = s1.concat(" World"); // Reassigning
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Naveen");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
	}

}
