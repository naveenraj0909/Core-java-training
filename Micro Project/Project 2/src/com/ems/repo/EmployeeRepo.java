package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;


public class EmployeeRepo {
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into naveen_employee values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			ps.setInt(4, employee.getDepartment().getDno());
		
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;	
	}

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete naveen_employee where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setInt(1, id);
			
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Delete Query not executed");
		}
		return flag;	
		
	}

	public boolean doUpdateEmployee(Employee employee) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update naveen_employee set ename = ?, esalary = ?, dno = ? where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setString(1, employee.getEname());
			ps.setInt(2, employee.getEsalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());
		
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;	
	}

	public Employee doFindEmployee(int id) {
		Employee employee = null;
		int deptno = 0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from  naveen_employee where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
		 
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				deptno = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(deptno);
				employee.setDepartment(department);
				
			}
		}catch(SQLException e){
			System.out.println("Find Query not Executed");
		}
		return employee;
		 
	}

	public List<Employee> doFindAllEmployee() {
		List<Employee> list = new LinkedList<>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from naveen_employee";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				int deptno = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(deptno);
				employee.setDepartment(department);
				
				
				list.add(employee);
			}
		}catch(SQLException e){
			System.out.println("Find Query not Executed");
		}
		return list;
	}

}
