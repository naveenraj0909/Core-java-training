package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();

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
		System.out.println("----Way 1----By using ForEach Loop");
		for(Integer i : set) {
			System.out.println(i);
		}
		
		//Way 2
		System.out.println("----Way 2----By using Iterator");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
