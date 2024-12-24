package com.ems.service;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.repo.DepartmentRepo;
import com.ems.repo.EmployeeRepo;

/**
 * @author Naveen.S
 * @version 1.0
 * 
 */
public class DepartmentService {

	static DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			return "Department Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null){
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object Not saved";
			}

		}
		return result;

	}

	public String deleteDepartmentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid No";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department Object Deleted";
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			return "Employee Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null)  {
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	public static String findDepartmentValidation(int id) {
		
		String result = "";

		if (id == 0) {
			result = "Invalid No";
		} else {
			Department department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}


}
