package com.student.blc;

public class FullTimeEmployee extends Employee {
	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		if(salary <= 0) {
			IO.print("Employee Salary can't be zero or negative.");
			System.exit(0);
		}else {
			
			this.salary = salary;
		}
		
	}
	
	@Override
	public double calculateSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return 
				this.name +" Salary is : "+calculateSalary();
	}
	
	
	
}
