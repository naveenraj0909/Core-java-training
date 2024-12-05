package com.day2;

public class TypesOfMethods {
	
	void myMethod1() {
		System.out.println("This is Instance Method...");
	}
	
	static void myMethod2() {
		System.out.println("This is Static method...");
	}

	public static void main(String[] args) {
		TypesOfMethods obj = new TypesOfMethods();
		obj.myMethod1();
		
		TypesOfMethods.myMethod2();

	}

}
