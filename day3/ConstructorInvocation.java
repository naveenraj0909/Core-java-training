package com.day3;

class A {

	A() {
		System.out.println("Hello A");
	}
}

class B extends A {

	B() {
		this(5);
		System.out.println("Hello B");
	}

	B(int a) {
		System.out.println("Hello BBBBBB");
	}

}

class C extends B {

	C() {
		System.out.println("Hello C");
	}

}

public class ConstructorInvocation {

	public static void main(String[] args) {
		C obj = new C();

	}

}
