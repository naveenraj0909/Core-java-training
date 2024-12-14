package com.day6;
//java - Object Assignment

public class HashcodeExample {
	int a = 10;

	public static void main(String[] args) {
		HashcodeExample obj1 = new HashcodeExample(); // Object Creation
		HashcodeExample obj2 = obj1; // Assigning object 1 to object 2

		obj1.a = 20;

		System.out.println(obj2.a);

		System.out.println(obj1.hashCode()); // Pre-defined method from object class
		System.out.println(obj2.hashCode());

	}

}
