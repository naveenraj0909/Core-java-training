package com.day3;

// Single Inheritance
class Vehicle {
	void noOfEngine() {
		System.out.println("I have 1 Engine...");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have 2 Wheels...");
	}
}

// All three class combined are Multi Level Inheritance
class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("Brand name : pulsar");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();

	}

}
