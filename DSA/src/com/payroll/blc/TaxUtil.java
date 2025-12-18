package com.payroll.blc;

public class TaxUtil {
	public double calculateTax(Employee e) {
		if(e.calculateGrossSalary() > 50000) {
			return e.calculateGrossSalary()*0.20;
		}else {
			return e.calculateGrossSalary()*0.05;
		}
	}
	
	public double calculateTax(Manager m) {
		if(m.calculateGrossSalary() > 50000) {
			return m.calculateGrossSalary()*0.20;
		}else {
			return m.calculateGrossSalary()*0.05;
		}
	}
	
	public double calculateTax(Trainer t) {
		
		if(t.calculateGrossSalary() > 50000) {
			return t.calculateGrossSalary()*0.20;
		}else {
			return t.calculateGrossSalary()*0.05;
		}
	}
	
	public double calculateTax(Sourcing s) {
		
		if(s.calculateGrossSalary() > 50000) {
			return s.calculateGrossSalary()*0.20;
		}else {
			return s.calculateGrossSalary()*0.05;
		}
	}
	
}
