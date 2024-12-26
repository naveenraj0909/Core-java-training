package com.sms.repo;

import java.util.List;

import com.sms.model.Product;

public interface ProductRepoInt {
	
	public boolean doInsertProduct(Product product);
	public boolean doDeleteProduct(int id);
	public boolean doUpdateProduct(Product product);
	public Product doFindProduct(int id);
	public List<Product> doFindAllProduct();

}
