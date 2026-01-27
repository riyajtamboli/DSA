package com.abstraction_practice;

public class Demo2 {

	public static void main(String[] args) {
		
		Car bmw = new Car("Bmw");
		bmw.run();
	}

}

abstract class Vehicle{
	
	protected String vehicleName;
	
	 Vehicle(String vehicleName){
		 this.vehicleName = vehicleName;
	 }
	public abstract void run();
}

class Bike extends Vehicle{
	Bike(String bikeName){
		super(bikeName);
	}

	@Override
	public void run() {
		IO.println(vehicleName+"is Running");
	}
}


class Car extends Vehicle{
	Car(String carName){
		super(carName);
	}
	
	public void run() {
		IO.println(vehicleName + " is running");
	}
}