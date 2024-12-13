package com.day4;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have 1 Engine..");
	}
	
	void noofwheels() {
		System.out.println("cannot define here...");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have 2 wheels");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		obj.noOfEngine();
		obj.noOfWheels();

	}

}
