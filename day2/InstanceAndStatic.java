package com.day2;

public class InstanceAndStatic {
	int a = 20;
	static int b = 40;

	public static void main(String[] args) {
		InstanceAndStatic obj1 = new InstanceAndStatic();
		InstanceAndStatic obj2 = new InstanceAndStatic();
		
		System.out.println("Instance variable...");
		
		System.out.println("Value of A before change for object 1 :"+obj1.a);
		System.out.println("Value of A before change for object 2 :"+obj2.a);
		
		obj1.a = 30;
		
		System.out.println("Value of A after change for object 1 :"+obj1.a);  //30 -> It will change only the copy value
		System.out.println("Value of A after change for object 2 :"+obj2.a);
		
		System.out.println("Static variable...");
		
		System.out.println("Value of B before change for object 1 :"+obj1.b);
		System.out.println("Value of B before change for object 2 :"+obj2.b);
		
		obj1.b = 60;
		
		System.out.println("Value of B after change for object 1 :"+obj1.b);
		System.out.println("Value of B after change for object 2 :"+obj2.b);

	}

}
