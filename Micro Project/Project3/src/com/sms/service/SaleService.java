package com.sms.service;
import com.sms.model.Sale;
import com.sms.repo.SaleRepo;

public class SaleService {
	SaleRepo saleRepo = new SaleRepo();

	public String insertSaleValidation(Sale sale) {
		String result;
		if (sale == null) {
			return "Employee Object is Null";
		} else if (sale.getSid() == 0 || sale.getProduct().getPid() == 0 || sale.getQuantity() == 0 || sale.getDate() == null) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = saleRepo.doInsertSale(sale);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not saved";
			}

		}
		return result;

	}
	
	public String deleteSaleValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid No";
		} else {
			boolean flag = saleRepo.doDeleteSale(id);
			if (flag) {
				result = "Sale Object Deleted";
			} else {
				result = "Sale Object Not Found";
			}
		}
		return result;
	}
	
	public String updateDepartmentValidation(Sale sale) {
		String result;
		if (sale == null) {
			return "Employee Object is Null";
		} else if (sale.getSid() == 0 || sale.getProduct().getPid() == 0 || sale.getQuantity() == 0 || sale.getDate() == null)  {
			result = "Invalid Department Data";
		} else {
			boolean flag = saleRepo.doUpdateSale(sale);
			if (flag) {
				result = "Sale Object Updated";
			} else {
				result = "Sale Object Not Found";
			}
		}
		return result;
	}
	
public  String findSaleValidation(int id) {
		
		String result = "";

		if (id == 0) {
			result = "Invalid ID";
		} else {
			Sale sale = saleRepo.doFindSale(id);
			if (sale != null) {
				result = sale.toString();
			} else {
				result = "Sale Object Not Found";
			}
		}
		return result;
	}

public String findAllSaleValidation() {
	return saleRepo.doFindAllSale().toString();
}



}
