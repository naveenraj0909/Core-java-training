package com.day11;

@FunctionalInterface
interface MyInterface {
	int calc(int a, int b); // public & abstract
}

/*
//Without Lambda Expression
class Addition implements MyInterface {
	public int calc(int a, int b) {
		return a + b;
	}
}

class Subtraction implements MyInterface {
	public int calc(int a, int b) {
		return a - b;
	}
}
*/

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		MyInterface ref = (a, b) -> a + b;
		System.out.println("Addition is : "+ref.calc(10,20));
		System.out.println("Addition is : " +ref.calc(100, 200));
		
		ref = (a, b) -> a - b;
		System.out.println("Subtraction is : "+ref.calc(20,10));
		System.out.println("Subtraction is : " +ref.calc(2000, 1000));


	}

}
