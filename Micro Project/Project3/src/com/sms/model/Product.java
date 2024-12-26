package com.sms.model;


public class Product {
	private int pid;
	private String pname;
	private int pprice;
	private String category;
	
	
	public Product() {
		super();
		
	}


	public Product(int pid, String pname, int pprice, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.category = category;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPprice() {
		return pprice;
	}


	public void setPprice(int pprice) {
		this.pprice = pprice;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", category=" + category + "]";
	}

	
	
	
	
	
	

}
