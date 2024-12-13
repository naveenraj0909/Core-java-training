package com.day4;

class overloading{
	overloading(int a, int b){
		int sum = a + b;
		System.out.println("sum is : "+sum);
	}
	overloading(int a){
		this(10,20);
		System.out.println(a);
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		overloading over = new overloading(5);
		

	}

}
