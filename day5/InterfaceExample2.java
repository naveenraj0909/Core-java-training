package com.day5;
//implements Multiple Interfaces

interface MyInterface1 {
	void myAbstractMethod1(); // Public and Default
}

interface MyInterface2 {
	void myAbstractMethod2();
}

class MyNormalClass2 implements MyInterface1, MyInterface2 {

	@Override
	public void myAbstractMethod1() {
		System.out.println("My Abstract Method - 1");
	}

	@Override
	public void myAbstractMethod2() {
		System.out.println("My Abstract Method - 2");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		MyNormalClass2 obj = new MyNormalClass2();
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();

	}

}
