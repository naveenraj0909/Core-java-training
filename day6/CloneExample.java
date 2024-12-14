package com.day6;

//Java - Object Cloning
public class CloneExample implements Cloneable { // Cloneable is predefined Interface from java.lang package
	int a = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExample obj1 = new CloneExample();
		CloneExample obj2 = (CloneExample) obj1.clone();

		obj1.a = 20;

		System.out.println(obj2.a);

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
