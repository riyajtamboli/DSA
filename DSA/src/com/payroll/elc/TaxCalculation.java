package com.payroll.elc;

import com.payroll.blc.Employee;
import com.payroll.blc.Manager;
import com.payroll.blc.Sourcing;
import com.payroll.blc.TaxUtil;
import com.payroll.blc.Trainer;


public class TaxCalculation {

	public static void main(String[] args) {
		
		TaxUtil tx = new TaxUtil();
		
		int choice = Integer.parseInt(IO.readln("Enter choice : "));
		
		switch(choice) {
		 case 1 ->{
             int employeeId = Integer.parseInt(IO.readln("Enter Employee Id : "));
             String employeeName = IO.readln("Enter Employee Name : ");
             double basicSalary = Double.parseDouble(IO.readln("Enter Employee Basic Salary : "));
             double HRAPer = Double.parseDouble(IO.readln("Enter Employee HRAPer : "));
             double DAPer = Double.parseDouble(IO.readln("Enter Employee DAPer : "));
             Employee e = new Employee(employeeId, employeeName, basicSalary, HRAPer, DAPer);
             IO.println("Gross Salary : "+e.calculateGrossSalary());
             IO.print("Tax : "+tx.calculateTax(e));
         }
         case 2 ->
         {
             int managarId = Integer.parseInt(IO.readln("Enter Manager Id : "));
             String managarName = IO.readln("Enter Manager Name : ");
             double basicSalary = Double.parseDouble(IO.readln("Enter Manager Basic Salary  : "));
             double HRAPer = Double.parseDouble(IO.readln("Enter Manager HRAPer : "));
             double DAPer = Double.parseDouble(IO.readln("Enter Manager DAPer : "));
             double projectAllowance = Double.parseDouble(IO.readln("Enter Manager Project Allowance : "));
             Manager m = new Manager(managarId, managarName, basicSalary, HRAPer, DAPer, projectAllowance);
             IO.println("Gross Salary : "+m.calculateGrossSalary());
             IO.print("Tax : "+tx.calculateTax(m));
         }
         case 3 ->{
             int trainerId = Integer.parseInt(IO.readln("Enter Trainer ID : "));
             String trainerName = IO.readln("Enter Trainer Name : ");
             double basicSalary = Double.parseDouble(IO.readln("Enter Trainer Basic Salary : "));
             double HRAPer = Double.parseDouble(IO.readln("Enter Trainer HRAPer : "));
             double DAPer = Double.parseDouble(IO.readln("Enter Trainer DAPer : "));
             int batchCount = Integer.parseInt(IO.readln("Enter Batch Count : "));
             Double perkPerBatch = Double.parseDouble(IO.readln("Enter Trainer Perk Per Batch: "));
             Trainer tr = new Trainer(trainerId, trainerName,basicSalary,HRAPer, DAPer, batchCount, perkPerBatch);

             IO.println("Gross Salary : "+tr.calculateGrossSalary());
             IO.print("Tax : "+tx.calculateTax(tr));
         }

         case 4 -> {
             int sourceId = Integer.parseInt(IO.readln("Enter Source ID : "));
             String sourceName = IO.readln("Enter Source Name : ");
             double basicSalary = Double.parseDouble(IO.readln("Enter Source Basic Salary : "));
             double HRAPer = Double.parseDouble(IO.readln("Enter Source HRAPer : "));
             double DAPer = Double.parseDouble(IO.readln("Enter Source DAPer : "));
             double enrollmentTarget = Integer.parseInt(IO.readln("Enter Source Enrollment Target : "));
             Double enrollmentReached = Double.parseDouble(IO.readln("Enter Source Enrollment Reached : "));
             Double perkPerEnrollment = Double.parseDouble(IO.readln("Enter Source Perk Per Enrollment : "));
             Sourcing s = new Sourcing(sourceId, sourceName, basicSalary, HRAPer, DAPer, enrollmentTarget, enrollmentReached, perkPerEnrollment);

             IO.println("Gross Salary : "+s.calculateGrossSalary());
             IO.print("Tax : "+tx.calculateTax(s));
         }
  
		}

	}

}
