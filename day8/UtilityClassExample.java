package com.day8;
//Java Utility classes : Date

import java.util.Date;

public class UtilityClassExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getDay());
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());

		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());

	}

}
