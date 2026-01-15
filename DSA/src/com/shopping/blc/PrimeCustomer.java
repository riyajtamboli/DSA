package com.shopping.blc;

public class PrimeCustomer extends Customer {
		protected double discountRate= 10.0;

		public PrimeCustomer(String name) {
			super(name);
		}
		
		public double calculateBill(double ...prices) {		
			super.calculateBill(prices);
			return this.total;
		}
		
		public void printDetails() {
			double discount = (total /100)*10; 
			IO.println("Name : "+this.name);
			IO.println("Discount Amount: "+discount);
			IO.println("Price Before The Discount : "+total);
			IO.println("Total Cost After Discount : "+(total-discount));
		}
}
