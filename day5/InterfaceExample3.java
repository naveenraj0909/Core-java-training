package com.day5;

interface MyInterface11 {
	void myAbstractMethod1(); // Public and Default
}

interface MyInterface22 extends MyInterface11 {
	void myAbstractMethod2();
}

class MyNormalClass22 implements MyInterface22 {

	@Override
	public void myAbstractMethod1() {
		System.out.println("My Abstract Method - 1");
	}

	@Override
	public void myAbstractMethod2() {
		System.out.println("My Abstract Method - 2");
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		MyInterface22 obj = new MyNormalClass22(); // DMD - Dynamic Method Dispatch
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();

	}

}
