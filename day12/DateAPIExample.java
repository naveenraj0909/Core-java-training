package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //now() is a static method
		
		
		System.out.println(date);
		System.out.println(date.getYear());

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

	}

}
