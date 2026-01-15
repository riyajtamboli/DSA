package com.shopping.blc;

public class VipCustomer extends Customer{
	protected double discountRate = 15.0;
	
	
	
	public VipCustomer(String name) {
		super(name);
	}

	public double calculateBill(double ...prices) {		
		super.calculateBill(prices);
		return this.total;
	}
	
	public void printDetails() {
		double discount = (total /100)*15; 
		IO.println("Name : "+this.name);
		IO.println("Discount Amount: "+discount);
		IO.println("Price Before The Discount : "+total);
		IO.println("Total Cost After Discount : "+(total-discount));
	}
}
