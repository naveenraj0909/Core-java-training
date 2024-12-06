package com.day3;
           //Java Bean
class Employee{
	private int eId;
	private String name;
	private double eSalary;
	
	
	public Employee() {
		
	}


	public Employee(int eId, String name, double eSalary) {
		super();
		this.eId = eId;
		this.name = name;
		this.eSalary = eSalary;
	}


	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double geteSalary() {
		System.out.println("Changed salary = "+eSalary);
		return eSalary;
	}


	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	
}
public class GetSetExample {
	
	public static void main(String[] args) {
		Employee obj = new Employee(101, "naveen", 50000);
		obj.seteSalary(60000);
		obj.geteSalary();

	}

}
