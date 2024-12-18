package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	//to traverse vector we use Enumeration

	public static void main(String[] args) { 
		Vector<Integer> vec = new Vector<>(3, 2); //3 is the initial capacity , 2 will be the increment value after the capacity is full
		
		System.out.println(vec.size());     //0
		System.out.println(vec.capacity()); //3
		
		vec.add(10);
		System.out.println(vec.size());     //1
		System.out.println(vec.capacity()); //3

		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());     //3
		System.out.println(vec.capacity()); //3
		
		vec.add(40);
		System.out.println(vec.size());     //4
		System.out.println(vec.capacity()); //5 , capacity will be increased by 2 after the initial capacity is full 
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	

}
 