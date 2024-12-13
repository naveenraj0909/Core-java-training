package com.day5;

interface MyInterface {
	void myAbstractMethod1(); // Public and Default

	void myAbstractMethod2();
}

class MyNormalClass1 implements MyInterface {
	
	public void myAbstractMethod1() {
		System.out.println("My Abstract Method - 1");
	}

	public void myAbstractMethod2() {
		System.out.println("My Abstract Method - 2");
	}
}

public class InterfaceExample1 {

	public static void main(String[] args) {
		MyInterface obj = new MyNormalClass1();
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();

	}

}
