package com.day5;

//Abstract Class with Constructor
abstract class Vehicle1 {
	Vehicle1() { // Default Constructor..It will call by using super().
		this(5);
		System.out.println("Abstract Class Constructor");
	}
	Vehicle1(int a){
		this(6,7);
		System.out.println(a);
	}
	Vehicle1(int a, int b){
		System.out.println(a+","+b);
	}

	void engine() {
		System.out.println("\nI have 1 Engine");
	}

	abstract void noOfWheels();

	abstract void brandName();

}

class Bike1 extends Vehicle1 {
	Bike1(){
		
	}
	void noOfWheels() {
		System.out.println("I have 2 wheels...");
	}

	void brandName() {
		System.out.println("My brand name is Honda");
	}
}

public class AbstractExample3 {

	public static void main(String[] args) {
		Vehicle1 vec = new Bike1();
		vec.engine();
		vec.noOfWheels();
		vec.brandName();

	}

}
