package com.day11;

interface MyReference {
	void hello1();
}

public class MethodReferenceExample {

	//Reference to the Instance Method
	void MyClass1() {
		System.out.println("Example for Instance Method Reference...");
	}

	//Reference to the Static Method
	static void MyClass2() {
		System.out.println("Example for Static Method Reference...");
	}

	//Reference to the Constructor
	MethodReferenceExample() {
		System.out.println("Constructor...");
	}

	public static void main(String[] args) {
		MethodReferenceExample obj = new MethodReferenceExample();
		MyReference reference = obj::MyClass1;
		reference.hello1();

		reference = MethodReferenceExample::MyClass2;
		reference.hello1();

		reference = MethodReferenceExample::new;
		reference.hello1();

	}

}
