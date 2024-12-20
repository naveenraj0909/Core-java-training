package com.day11;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		String name = null;
		Optional<String> nameOptional = Optional.ofNullable(name);

		if (nameOptional.isPresent()) {
			// Value is present, you can access it using get()
			String value = nameOptional.get();
		} else {
			// Value is absent
			System.out.println("Value is not there");
		}

	}

}
