package com.day10;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashtableExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();
		map.put(10, "Java");
		map.put(20, "Python");
		map.put(30, "c");
		map.put(40, "C++");
		//map.put(null, null);

		System.out.println(map);

		map.put(10, "SQL");
		System.out.println(map);

		map.remove(10);
		System.out.println(map);

		System.out.println(map.get(20));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(30));
		System.out.println(map.containsValue("C++"));

		System.out.println(map);

		// Way 1
		System.out.println("\n   Way 1 \nBy using ForEach Loop");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + "--" + map.get(key));
		}

		System.out.println("\nBy using Iterator");
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "--" + map.get(key));
		}

		// way 2
		System.out.println("\n   Way 2 \nBy using ForEach Loop");
		Set<Entry<Integer, String>> entries = map.entrySet();
		System.out.println(entries);
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}

		System.out.println("\nBy using Iterator");
		Iterator<Entry<Integer, String>> it1 = entries.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> entry = it1.next();
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}

	}

}
