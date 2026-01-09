package com.employee.elc;

import com.student.blc.FullTimeEmployee;
import com.student.blc.PartTimeEmployee;

public class EmployeeType {
		public static void main(String args[]) {
			
			IO.println("Salary Calculation Menu");
			IO.println("1. FullTime Employee");
			IO.println("2. PartTime Employee");
			int choice = Integer.parseInt(IO.readln("Please Select Employee Type: "));
			
			switch(choice) {
				case 1 ->{ 
					int id = Integer.parseInt(IO.readln("Enter FullTime Employee ID : "));
					String name = IO.readln("Enter FullTime Employee Name: ");
					double salary = Double.parseDouble(IO.readln("Enter the Salary: "));
					FullTimeEmployee fe = new FullTimeEmployee(id, name, salary);
					IO.println(fe);

				}
				case 2 ->{
					int id = Integer.parseInt(IO.readln("Enter PartTimeEmployee Employee ID : "));
					String name = IO.readln("Enter PartTimeEmployee Employee Name: ");
					double hourlyRate = Double.parseDouble(IO.readln("Enter the hourlyRate : "));
					int houryTime = Integer.parseInt(IO.readln("Enter HourlyRate : "));
					PartTimeEmployee pe = new PartTimeEmployee(id, name, hourlyRate, houryTime);
					IO.println(pe);
					
				}
			}
		}
}
