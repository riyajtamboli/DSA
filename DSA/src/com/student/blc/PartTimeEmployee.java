package com.student.blc;

public class PartTimeEmployee extends Employee {
	protected double hourlyRate;
	protected int hourlyTime;
	
	public PartTimeEmployee(int id, String name, double hourlyRate, int hourlyTime) {
		super(id, name);
		if(hourlyRate <= 0) {
			IO.print("Employee Hourly Rate can't be zero or negative.");
			System.exit(0);
		}else {
			this.hourlyRate = hourlyRate;
		}
		
		if(hourlyTime <=0) {
			IO.print("Employee Hourly Time can't be zero or negative.");
				System.exit(0);
		}else {
			this.hourlyTime = hourlyTime;
		}
	}
	
	@Override
	public double calculateSalary() {
		return (hourlyRate*hourlyTime);
	}

	@Override
	public String toString() {
		return 
				this.name+ " Salary is : "+this.calculateSalary();
	}
	
	
	
}
