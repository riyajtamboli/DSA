package com.shopping.blc;
public abstract class Customer {
	protected String name;
	
	
	public Customer(String name) {
		super();
		if(name.isEmpty()) {
			IO.println("name can not be empty");
			System.exit(0);
		}else {
			this.name = name;
		}
	}
	
	double total =0;
	public double calculateBill(double ...prices) {	
		for(double price: prices) {
			total = total +price;
		}	
		return total;
	}

	public abstract void printDetails();
	
	
}
