package com.day5;

abstract class MyAbstract { // Abstract Class
	abstract void myMethod1(); // Abstract Method

	abstract void myMethod2();

	void myMethod3() {
		System.out.println("My Normal / Concrete Method");
	}
}

class MyNormalClass extends MyAbstract {
	void myMethod1() { // OverRiding Abstract Method
		System.out.println("My Abstract method - 1");
	}

	void myMethod2() {
		System.out.println("My Abstract method - 2");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		MyAbstract obj = new MyNormalClass(); // DMD - Dynamic Method Dispatch
		obj.myMethod1();
		obj.myMethod2();
		obj.myMethod3();

	}

}
