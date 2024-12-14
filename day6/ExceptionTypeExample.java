package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTypeExample {
	void MyMethod() throws FileNotFoundException { // throws
		FileReader fr = new FileReader("Naveen.txt");
	}

	void mymethod1() {
		try {
			MyMethod();
		} catch (FileNotFoundException e) {

		}
	}

	public static void main(String[] args) {
		// Unchecked Exception
		int a = 10 / 0;

		// Checked Exception
		// FileReader fr = new FileReader("Naveen");

	}

}
