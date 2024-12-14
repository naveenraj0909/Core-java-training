package com.day6;

public class TryCatchExample {

	public static void main(String[] args) {
		System.out.println("Before Exception");

		try {
			// int a = 10 / 0;
			int arr[] = { 10, 20, 30 };
			System.out.println(arr[7]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Inside finally...");
		}

		System.out.println("After Exception");

	}

}
