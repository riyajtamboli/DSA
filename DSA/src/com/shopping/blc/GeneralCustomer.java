package com.shopping.blc;

public class GeneralCustomer extends Customer{
	
	
	public GeneralCustomer(String name) {
		super(name);
	}
	
	public double calculateBill(double ...prices) {		
		return super.calculateBill(prices);
	}
	
	public void printDetails() {
		IO.println("Name : "+this.name);
		IO.println("Total Cost : "+(total));
		IO.println("No Discount For General Customer");
	}
	
}
