package com.day5;

interface VehiclePlan { // Interface Layer
	void noOfEngine();

	void noOfWheels();

	void brandName();
}

abstract class Vehicle00 implements VehiclePlan { // Abstract Layer
	@Override
	public void noOfEngine() {
		System.out.println("I have 1 Engine...");
	}
}

class Bike5 extends Vehicle00 { // Concrete Layer
	@Override
	public void noOfWheels() {
		System.out.println("I have 2 Wheels");
	}

	@Override
	public void brandName() {
		System.out.println("Brand Name is Honda");
	}
}

public class InterfaceExample4 {

	public static void main(String[] args) {
		VehiclePlan vec = new Bike5(); // DMD
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();

	}

}
