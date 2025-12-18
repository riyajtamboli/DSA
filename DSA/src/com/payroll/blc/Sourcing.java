package com.payroll.blc;

public class Sourcing {
	private int sourceId;
	private String sourceName;
	private double enrollmentTarget;
	private double enrollmentReached;
	private double perkPerEnrollment;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	
	public Sourcing(int sourceId, String sourceName, double enrollmentTarget, double enrollmentReached,
			double perkPerEnrollment, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}
	
	public double calculateGrossSalary() {
		return basicSalary+HRAPer+DAPer+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
	
	
}
