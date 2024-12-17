package com.day8;

public class Palindrome {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("madam");
		String s = s1.reverse().toString();
		if(s1.toString().equals(s1)) {
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}
