package batch53_elc_classes;

import batch53_blc_classes.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
	int n = Integer.parseInt(IO.readln("Enter how many Employee want : "));
	for(int i=1; i<=n; i++) {
			IO.println("Enter Employee Details Of "+ i+ " ");
			String name = IO.readln("Enter Name : ");
			int id = Integer.parseInt(IO.readln("Enter Id : "));
			String department = IO.readln("Enter Department : ");
			double salary = Double.parseDouble(IO.readln("Enter Double : "));
			Employee emp = Employee.cretaeEmployeeObject(name, id, department, salary);
			IO.println(emp);
			IO.println("Salary With Bonus : "+emp.calculateAnnualSalary());			
			}
	}
}
 