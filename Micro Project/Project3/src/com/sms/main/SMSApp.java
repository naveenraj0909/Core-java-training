package com.sms.main;

import java.util.Scanner;

import com.sms.model.Product;
import com.sms.model.Sale;
import com.sms.service.Productservice;
import com.sms.service.SaleService;
import com.sms.view.ProductView;
import com.sms.view.SaleView;


public class SMSApp {
	
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.println("1. Insert Product");
		System.out.println("2. Delete Product");
		System.out.println("3. Update Product");
		System.out.println("4. Find Product");
		System.out.println("5. Find All Product");
		System.out.println("6. Insert Sale");
		System.out.println("7. Delete Sale");
		System.out.println("8. Update Sale");
		System.out.println("9. Find Sale");
		System.out.println("10. Find All Sale");
		System.out.println("11. Exit");

		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		return choice;

	}
	
public static void main(String[] args) {
		
		Productservice productService = new Productservice();
		
		SaleService saleService = new SaleService();

		String result = "";
		String msg = "";
		Product product;
		Sale sale;
		int id = 0;
		Scanner sc = new Scanner(System.in);
		do {
			int choice = menu();

			switch (choice) {
			case 1:
				product = ProductView.insertProductView();
				result = productService.insertProductValidation(product);
				ProductView.printResult(result);
				break;
				
			case 2:
				id = ProductView.deleteProductView();
				result = Productservice.deleteProductValidation(id);
				ProductView.printResult(result);
				break;
				
			case 3:
				product = ProductView.updateProductView();
				result = productService.updateProductValidation(product);
				ProductView.printResult(result);
				break;
			case 4:
				id = ProductView.findProductView();
				result = Productservice.findProductValidation(id);
				ProductView.printResult(result);
				break;
			case 5:
				result = productService.findAllProductValidation();
				ProductView.printResult(result);
				break;
			case 6:
				sale = SaleView.insertSaleView();
				result = saleService.insertSaleValidation(sale);
				SaleView.printResult(result);
				break;
			case 7:
				id = SaleView.deleteSaleView();
				result = saleService.deleteSaleValidation(id);
				SaleView.printResult(result);
				break;
			case 8:
				sale = SaleView.updateSaleView();
				result = saleService.updateDepartmentValidation(sale);
				SaleView.printResult(result);
				break;
			case 9:
				id = SaleView.findSaleView();
				result = saleService.findSaleValidation(id);
				SaleView.printResult(result);
				break;
			case 10:
				result = saleService.findAllSaleValidation();
				SaleView.printResult(result);
				break;
				
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do You Want To Continue [Yes | No] : ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
