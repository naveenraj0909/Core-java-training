package com.sms.service;

import com.sms.model.Product;
import com.sms.repo.ProductRepo;
import com.sms.repo.ProductRepoInt;

public class Productservice {
	static ProductRepoInt productRepo = new ProductRepo();

	public String insertProductValidation(Product product) {
		String result;
		if (product == null) {
			return "Product Object is Null";
		} else if (product.getPid() == 0 || product.getPname() == null || product.getPprice() == 0 || product.getCategory() == null ) {
			result = "Invalid Product Data";
		} else {
			boolean flag = productRepo.doInsertProduct(product);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not saved";
			}

		}
		return result;
	}
	
	public static String deleteProductValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid ID";
		} else {
			boolean flag = productRepo.doDeleteProduct(id);
			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}
	
	public String updateProductValidation(Product product) {
		String result;
		if (product == null) {
			return "Employee Object is Null";
		} else if (product.getPid() == 0 || product.getPname() == null || product.getPprice() == 0 || product.getCategory() == null) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = productRepo.doUpdateProduct(product);
			if (flag) {
				result = "Product Object Updated";
			} else {
				result = "Product Object Not Found";
			}

		}
		return result;
	}
	
public static String findProductValidation(int id) {
		
		String result = "";

		if (id == 0) {
			result = "Invalid ID";
		} else {
			Product product = productRepo.doFindProduct(id);
			if (product != null) {
				result = product.toString();
			} else {
				result = "Product Object Not Found";
			}
		}
		return result;
	}

public String findAllProductValidation() {
	return productRepo.doFindAllProduct().toString();
}


}
