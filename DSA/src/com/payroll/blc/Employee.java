package com.payroll.blc;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	
	public Employee(int employeeId, String employeeName, double basicSalary, double hRAPer, double dAPer) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}
	
	public double calculateGrossSalary() {
		return basicSalary+HRAPer+DAPer;
	}
	
}
