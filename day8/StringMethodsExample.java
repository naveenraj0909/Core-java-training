package com.day8;

public class StringMethodsExample {

	public static void main(String[] args) {
		String s1 = "Java";
		
		System.out.println(s1.length());  //length is a method
		System.out.println(s1.charAt(1)); //like array it will start from index 0
		System.out.println(s1.concat(" World"));
		System.out.println(s1.equals("java")); //It will compare each character, It is case sensitive
		System.out.println(s1.equalsIgnoreCase("java"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.endsWith("ba"));
		System.out.println(s1.replace('a', 'z'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = "Java World";
		
		System.out.println(s2.substring(3,7));
		System.out.println(s2.substring(3));
		
			
		

	}

}
