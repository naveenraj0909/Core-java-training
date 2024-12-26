package com.sms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


import com.sms.model.Product;
import com.sms.util.DBUtil;

public class ProductRepo implements ProductRepoInt {		
	
		//SaleRepo saleRepo = new SaleRepo();

	public boolean doInsertProduct(Product product) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Product_naveen values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, product.getPid());
			ps.setString(2, product.getPname());
			ps.setInt(3, product.getPprice());
			ps.setString(4, product.getCategory());
			

			int n = ps.executeUpdate();
		
			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}

		return flag;
	}
	
	public boolean doDeleteProduct(int id) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete product_naveen where product_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setInt(1, id);
			
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Delete Query not executed");
		}
		return flag;	
		
	}
	public boolean doUpdateProduct(Product product) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update product_naveen set product_name = ?, price = ?, category = ? where Product_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setString(1, product.getPname());
			ps.setInt(2, product.getPprice());
			ps.setString(3, product.getCategory());
			ps.setInt(4, product.getPid());
		
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;	
	}
	
	public Product doFindProduct(int id) {
		Product product = null;
		int deptno = 0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from  product_naveen where product_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
		 
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				product = new Product();
				
				product.setPid(rs.getInt("product_id"));
				product.setPname(rs.getString("product_name"));
				product.setPprice(rs.getInt("price"));
				product.setCategory(rs.getString("category"));
				
				
			}
		}catch(SQLException e){
			System.out.println("Find Query not Executed");
		}
		return product;
		 
	}
	
	public List<Product> doFindAllProduct() {
		List<Product> list = new LinkedList<>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from product_naveen";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Product product = new Product();
				product.setPid(rs.getInt("product_id"));
				product.setPname(rs.getString("product_name"));
				product.setPprice(rs.getInt("price"));
				product.setCategory(rs.getString("category"));
				
				
				list.add(product);
			}
		}catch(SQLException e){
			System.out.println("Find Query not Executed");
		}
		return list;
	}


}
