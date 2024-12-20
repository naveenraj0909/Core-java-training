package com.day11;

interface MyInterface1{
	void myAbstractMethod();
	
	default void myDefaultMethod() {
		System.out.println("Hii Default method");
	}
	
	static void myStaticMethod() {
		System.out.println("Hii Static Method");
	}
}

public class Java8InterfaceExample{

	public static void main(String[] args) {
		

	}

}
