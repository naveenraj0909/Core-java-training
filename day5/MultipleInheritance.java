package com.day5;

interface one {
	int a = 10; // public , static , final
}

interface two {
	int b = 20;
}

interface three extends one, two { // Interface to interface we can use extends keyword
	void sum();
}

class NormalClass implements three { // class to interface we can use implements keyword
	public void sum() {
		int c = a + b;
		System.out.println("Sum = " + c);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		NormalClass multi = new NormalClass();
		multi.sum();

	}

}
