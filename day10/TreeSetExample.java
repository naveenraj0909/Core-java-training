package com.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		SortedSet<Object> set = new TreeSet<>(Collections.reverseOrder());

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);

		System.out.println(set);

		System.out.println(set.isEmpty()); // Returns Boolean value
		System.out.println(set.size());// Returns int value
		System.out.println(set.contains(10)); // Returns Boolean value
		
		//way 1
		System.out.println("----Way 1----By using ForEach Loop");
		for(Object i : set) {
			System.out.println(i);
		}
		
		//Way 2
		System.out.println("----Way 2----By using Iterator");
		Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
