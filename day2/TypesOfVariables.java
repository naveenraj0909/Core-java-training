package com.day2;
     //Types of variables in java


public class TypesOfVariables {
	int a = 10;  //Instance or Object variable
	static int b = 20;  // Static or class variable

	public static void main(String[] args) {
		int c = 30;  //Local variable
		System.out.println(c);
		
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.a);
		
		System.out.println(TypesOfVariables.b);
		

	}

}
