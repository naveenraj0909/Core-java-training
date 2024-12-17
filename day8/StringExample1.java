package com.day8;

//Ways of String Declaration

public class StringExample1 {

	public static void main(String[] args) {
		// 1st Way
		String s1 = "Naveen";
		// 2nd Way
		String s2 = new String("Helloo");
		// 3rd Way
		char ch[] = { 'W', 'E', 'L', 'C', 'O', 'M', 'E' }; // Character Array
		String s3 = new String(ch);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
