package com.day2;

class Mobile{
	String brand;
	int price;
	String ram;
	
	Mobile(String brand, int price, String ram){
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	
	void display() {
		System.out.println("Mobile Brand = "+brand);
		System.out.println("Mobile price = "+price);
		System.out.println("RAM capacity = "+ram);
	}
	
}

public class ClassAndObject2 {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile("Samsung", 30000, "8GB RAM");
		obj1.display();
		
		Mobile obj2 = new Mobile("Redmi" , 20000, "6GB RAM");
		obj2.display();

	}

}
