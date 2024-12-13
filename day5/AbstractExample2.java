package com.day5;

abstract class Vehicle {
	void engine() {
		System.out.println("\nI have 1 Engine");
	}

	abstract void noOfWheels();

	abstract void brandName();

}

class Bike extends Vehicle {
	void noOfWheels() {
		System.out.println("I have 2 wheels...");
	}

	void brandName() {
		System.out.println("My brand name is Honda");
	}
}

class Car extends Vehicle {
	void noOfWheels() {
		System.out.println("I have 4 wheels...");
	}

	void brandName() {
		System.out.println("My brand name is SUV");
	}
}

public class AbstractExample2 {

	public static void main(String[] args) {
		Vehicle vec = new Bike();
		vec.engine();
		vec.noOfWheels();
		vec.brandName();

		vec = new Car();
		vec.engine();
		vec.noOfWheels();
		vec.brandName();

	}

}
