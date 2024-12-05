package com.day2;
                            //Class And Object
class Employee{
	int eId;
	String name;
	double salary;
	
	//Constructor
	Employee(int eId, String name, double salary){
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	
	//Method
	void display() {
		System.out.println("Employee ID : "+eId);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
	}
	
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		//Creating object
		Employee obj1 = new Employee(101, "Naveen", 50000);
		obj1.display();
		
		Employee obj2 = new Employee(102, "Raj", 70000);
		obj2.display();

	}

}
