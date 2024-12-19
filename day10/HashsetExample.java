package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set will not allow duplicate values
//Set is Un-ordered collection
//Set has non-index based collection

public class HashsetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(null);
		set.add(null);

		System.out.println(set);

		System.out.println(set.isEmpty()); // Returns Boolean value
		System.out.println(set.size());// Returns int value
		System.out.println(set.contains(10)); // Returns Boolean value
		
		//way 1
		System.out.println("----Way 1----");
		for(Integer i : set) {
			System.out.println(i);
		}
		
		//Way 2
		System.out.println("----Way 2----");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
