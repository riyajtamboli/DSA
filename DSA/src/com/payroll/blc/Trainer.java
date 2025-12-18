package com.payroll.blc;

public class Trainer {
	private int trainerid;
	private String trainerName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private int batchCount;
	private double perkPerBatch;
	
	public Trainer(int trainerid, String trainerName, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		this.trainerid = trainerid;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary() {
		return basicSalary+HRAPer+DAPer+(batchCount * perkPerBatch);
	}
}
