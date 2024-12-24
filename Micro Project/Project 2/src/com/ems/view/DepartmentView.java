package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class DepartmentView {
	static Scanner sc = new Scanner(System.in);
	/**
	 * It is performing To display to the user
	 */
	static int dno;
	static String dname;

	

	/**
	 * It is getting input from user
	 * @return Employee
	 */
	public static Department insertDepartmentView() {
		System.out.println("Enter Department No , Department Name");
		dno = sc.nextInt();
		dname= sc.next();
		
		Department department = new Department();
		department.setDno(dno);
		
		return new Department(dno, dname);
	}
	
	public static int deleteDepartmentView() {
		System.out.println("Enter Department No");
		return sc.nextInt();
	}
	
	public static Department updateDepartmentView() {
		System.out.println("Enter Department No , Department Name");
		
		dno = sc.nextInt();
		dname = sc.next();
		
		Department department = new Department();
		department.setDno(dno);
		
		return new Department(dno, dname);
	}

	public static int findDepartmentView() {
		System.out.println("Enter Department No");
		return sc.nextInt();
	}

}
