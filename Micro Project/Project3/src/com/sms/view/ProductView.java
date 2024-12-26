package com.sms.view;

import java.util.Scanner;

import com.sms.model.Product;
import com.sms.model.Sale;

public class ProductView {
	static Scanner sc = new Scanner(System.in);
	static int pid;
	static String pname;
	static int pprice;
	static String category;
	
	public static void printResult(String result) {
		System.out.println(result);
	}
	
	public static Product insertProductView() {
		System.out.println("Enter Product ID , Product Name, Price, category");
		pid = sc.nextInt();
		pname= sc.next();
		pprice = sc.nextInt();
		category = sc.next();
		
		return new Product(pid, pname, pprice, category);
	}
	public static int deleteProductView() {
		System.out.println("Enter Product ID");
		return sc.nextInt();
	}
	
	public static Product updateProductView() {
		System.out.println("Enter Product ID , Product Name, Price, category ");
		pid = sc.nextInt();
		pname = sc.next();
		pprice = sc.nextInt();
		category = sc.next();
		return new Product(pid, pname, pprice, category);	
	}
	
	public static int findProductView() {
		System.out.println("Enter Product ID");
		return sc.nextInt();
	}


}
