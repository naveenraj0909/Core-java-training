package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {
	int input1;
	int input2;
	static Calculator calc;
	
	@BeforeClass
	public static void  beforeClass() {
		System.out.println("Before Class...");
		calc = new Calculator();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class...");
		calc = null;
	}
	@Before
	public void before() {
		System.out.println("Before..."); //Pre Logic
		input1 = 10;
		input2 = 20;	
	}
	
	@After
	public void after() {
		System.out.println("After..."); //Post Logic
		input1 = 0;
		input2 = 0;
	}

	@Test
	public void testAddition() {
		System.out.println("Test Addition");
//		Calculator calc = new Calculator();
//		int actual = calc.addition(10, 20);
//		int expected = 30;
//		assertEquals(expected, actual);
	}

	@Test
	public void testSubtraction() {
		System.out.println("Test Subtraction");
//		Calculator calc = new Calculator();
//		int actual = calc.subtraction(10, 20);
//		int expected = -10;
//		assertEquals(expected, actual);
	}

}
