package com.day8;

//Java Utility Classes : Calendar
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));

	}

}
