package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private int empId;
	private String empName;
	private double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}

public class SerializationExample {

	public static void main(String[] args) throws Exception {
		//Serialization
		Employee obj = new Employee(101, "Naveen", 50000);
		FileOutputStream fout = new FileOutputStream("C:\\text file\\hello.txt"); //Writing
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(obj);
		fout.close();
		objout.close();
		System.out.println("Object saved into the file");
		
		//De-Serialization
		FileInputStream fin = new FileInputStream("C:\\text file\\hello.txt"); //Reading
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee obj2 = (Employee) objin.readObject();
		objin.close();
		fin.close();
		
		System.out.println("Employee ID : "+ obj2.getEmpId());
		System.out.println("Employee NAME : "+ obj2.getEmpName());
		System.out.println("Employee SALARY : "+ obj2.getEmpSalary());
	}

}
