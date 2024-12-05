package com.day2;

public class ArrayOfArrayExample2 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[] {10, 20};
		arr[1] = new int[] {30, 40, 50, 60};
		arr[2] = new int[] {70, 80, 90};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
		
		//Enhanced For loop
		
		System.out.println("By using Enhanced For Loop..");
		for(int i[] : arr) {
			for(int j : i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}

}
