package com.sms.view;

import java.util.Scanner;

import com.sms.model.Product;
import com.sms.model.Sale;

public class SaleView {
	static Scanner sc = new Scanner(System.in);
	static int sale_id;
	static int product_id;
	static int quantity;
	static String sale_date;
	
	public static void printResult(String result) {
		System.out.println(result);
	}
	public static Sale insertSaleView() {
		System.out.println("Enter Sale ID, Product ID, Quantity, Sale Date");
		sale_id = sc.nextInt();
		product_id = sc.nextInt();
		quantity = sc.nextInt();
		sale_date = sc.next();
		
		Product product = new Product();
		product.setPid(product_id);
	
		
		
		return new Sale(sale_id, product, quantity, sale_date);
	}
	
	public static int deleteSaleView() {
		System.out.println("Enter Sale ID");
		return sc.nextInt();
	}
	
	public static Sale updateSaleView() {
		System.out.println("Enter Sale ID, Product ID, Quantity, Sale Date");
		
		sale_id = sc.nextInt();
		product_id = sc.nextInt();
		quantity = sc.nextInt();
		sale_date = sc.next();
		
		Product product = new Product();
		product.setPid(product_id);
		
		return new Sale(sale_id, product, quantity, sale_date);
	}
	
	public static int findSaleView() {
		System.out.println("Enter Sale ID");
		return sc.nextInt();
	}
	

}
