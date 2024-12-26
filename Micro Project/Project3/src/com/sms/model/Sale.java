package com.sms.model;

public class Sale {
	private int sid;
	//private int pid;
	private Product product;
	private int quantity;
	private String date;
	public Sale() {
		super();
		
	}
	public Sale(int sid, Product product, int quantity, String date) {
		super();
		this.sid = sid;
		this.product = product;
		this.quantity = quantity;
		this.date = date;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Sale [sid=" + sid + ", product=" + product + ", quantity=" + quantity + ", date=" + date + "]";
	}
	
	
	
	
}
