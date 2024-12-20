package com.ems.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;

/**
 * @author Naveen.S
 * @version 1.0
 * It is creating a Map object to store n number of employee
 */
public class DBUtil {
	private static List<Employee> list = new LinkedList<>();
	private static Map<Integer, Employee> map = new HashMap<>();

	public static List<Employee> getListDBInstance() {
		return list;
	}

	public static Map<Integer, Employee> getMapDBInstance() {
		return map;
	}

}
