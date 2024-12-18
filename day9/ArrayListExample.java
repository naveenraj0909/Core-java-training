package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List allow order
//List allow Duplicate

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// list.add(new Integer(10));
		list.add(10);
		list.add(30);
		list.add(7);
		list.add(20);
		list.add(10);
		list.add(5);
		System.out.println(list);

		list.add(1, 25);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		list.set(0, 80);
		System.out.println(list);

		System.out.println(list.contains(10)); // Returns boolean value - true or false

		System.out.println(list.size());

		System.out.println(list.isEmpty()); // Returns boolean value - true or false
		
		//way 1 - Only for List
		System.out.println("----WAY 1----");
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//way 2
		System.out.println("----WAY 2----");
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//way 3
		System.out.println("----WAY 3----");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nRemoved Odd values..");
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext()) {
			Integer t = it1.next();
			if(t % 2 == 1) 
				it1.remove();
		}
		System.out.println(list);
	}

}
