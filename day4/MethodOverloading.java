package com.day4;

public class MethodOverloading {
	void myMethod(int a) {
		System.out.println(a);
	}
	
	void myMethod(String a) {
		System.out.println(a);
	}
	
	void myMethod(int a, int b) {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod(10);
		obj.myMethod("Naveen");
		obj.myMethod(10, 20);

	}

}
