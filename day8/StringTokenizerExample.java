package com.day8;

//Java Utility Classes - String Tokenizer

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String s1 = "Welcome to Java world";
		StringTokenizer st = new StringTokenizer(s1, " ");

		System.out.println(st.countTokens());
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

	}

}
