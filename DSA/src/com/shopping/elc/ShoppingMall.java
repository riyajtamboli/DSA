package com.shopping.elc;

import com.shopping.blc.Customer;
import com.shopping.blc.GeneralCustomer;
import com.shopping.blc.PrimeCustomer;
import com.shopping.blc.VipCustomer;

public class ShoppingMall {
	void main() {
		IO.println("Please Select the Customer Type to get additional Discount");
		IO.println("1. General Customer"+"\n2. Prime Customer"+"\n3. VIP Customer");
		int choice = Integer.parseInt(IO.readln("Enter Customer Type: "));
		String name = IO.readln("Please Enter Your Name : ");
		int items = Integer.parseInt(IO.readln("Enter number of Items : "));
		
		double prices[] = new double[items];
		
		for(int i=0; i<items; i++) {
			String item = IO.readln("Enter item name: ");
			double amt = Double.parseDouble(IO.readln("Enter price: "));
			prices[i] = amt;
		}
		
		switch(choice) {
			case 1 ->{
				Customer cust;
				cust = new GeneralCustomer(name);
				generateBill(cust, prices);
			}
			case 2 -> 
			{
				Customer cust;
				cust = new PrimeCustomer(name);
				generateBill(cust, prices);
			}
			case 3 ->{
				Customer cust;
				cust = new VipCustomer(name);
				generateBill(cust, prices);
			}
		}
		
	
	}
	
	public static void generateBill(Customer cust, double ...prices) {
		IO.println("------------------------------------------------");
		cust.calculateBill(prices);
		cust.printDetails();
	}
}
