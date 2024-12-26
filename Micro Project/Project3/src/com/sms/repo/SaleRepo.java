package com.sms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.sms.model.Product;
import com.sms.repo.SaleRepo;
import com.sms.model.Sale;
import com.sms.util.DBUtil;

public class SaleRepo {
	ProductRepo productRepo = new ProductRepo();
	
	public boolean doInsertSale(Sale sale) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into sale_naveen values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setInt(1, sale.getSid());
			ps.setInt(2, sale.getProduct().getPid());
			ps.setInt(3, sale.getQuantity());
			ps.setString(4, sale.getDate());
			
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;	
	}
	
	public boolean doDeleteSale(int id) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete sale_naveen where Sale_id = ?";
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
	public boolean doUpdateSale(Sale sale) {
		boolean flag = false;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update sale_naveen set product_id = ?, quantity = ?, sale_date = ? where sale_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setInt(1, sale.getProduct().getPid());
			ps.setInt(2, sale.getQuantity());
			ps.setString(3, sale.getDate());
			ps.setInt(4, sale.getSid());
		
			int n = ps.executeUpdate();
			
			if(n==1) 
				flag = true;
		
		}catch(SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;	
	}
	
	public  Sale doFindSale(int id) {
		Sale sale = null;
		int product_id = 0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from  sale_naveen where sale_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
		 
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				sale = new Sale();
				sale.setSid(rs.getInt("sale_id"));
				sale.setDate(rs.getString("sale_date"));
				sale.setQuantity(rs.getInt("quantity"));
				
				product_id = rs.getInt("product_id");
			    Product product = productRepo.doFindProduct(product_id);
				sale.setProduct(product);
				
			}
		}catch(SQLException e){
			System.out.println("Find Query not Executed");
		}
		return sale;
		 
	}
	
	public List<Sale> doFindAllSale() {
		List<Sale> list = new LinkedList<>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from sale_naveen";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Sale sale = new Sale();
				sale.setSid(rs.getInt("sale_id"));
				sale.setQuantity(rs.getInt("quantity"));
				sale.setDate(rs.getString("sale_date"));
				
				int product_id = rs.getInt("product_id");
			    Product product = productRepo.doFindProduct(product_id);
				sale.setProduct(product);
				
				list.add(sale);
			}
		}catch(SQLException e){
			System.out.println("Find Query not Executed");
		}
		return list;
	}


}
