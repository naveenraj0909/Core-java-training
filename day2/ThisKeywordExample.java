package com.day2;

//this keyword -> It refers current class object
public class ThisKeywordExample {

	int eId;
	String name;
	double salary;

	// Constructor
	ThisKeywordExample(int eId, String name, double salary) {
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		
		this.display();  //Current Class Method Calling
	}

	ThisKeywordExample() {
		this(101, "Naveen", 50000);  //Current Class Constructor Calling

	}

	// Method
	void display() {
		System.out.println("Employee ID : " + eId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}

	public static void main(String[] args) {

		// Creating object
		ThisKeywordExample obj1 = new ThisKeywordExample();
		obj1.display();

	}

}
