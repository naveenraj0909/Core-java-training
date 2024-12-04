package com.day1;
import java.util.Scanner;

//user input

public class Employee{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		System.out.println("Enter your Name : ");
		String name = sc.next();
		System.out.println("Enter your salary : ");
		float salary = sc.nextFloat();

		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}