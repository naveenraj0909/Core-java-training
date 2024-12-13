package com.day4;

class employee{
	
	private employee() {
		
	}
	static employee obj1 = new employee();
	
	public static employee getEmpobject() {
	return obj1;	
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		employee obj1 = employee.getEmpobject();
		System.out.println(obj1);
		employee obj2 = employee.getEmpobject();
		System.out.println(obj2);
	}

}
