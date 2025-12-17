package batch53_blc_classes;

public class Employee {
	private String name;
	private int id;
	private String department;
	private double salary;
	
	private Employee(String name, int id, String department, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	public static Employee cretaeEmployeeObject(String name, int id, String department, double salary) {
		return new Employee(name, id, department, salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]";
	}
	
	public double calculateAnnualSalary() {
		double annualSalary = salary * 12;
	
		switch(department) {
			case "Sales":
				annualSalary = annualSalary * 0.10;
				break;
			case "Engineering":
				annualSalary = annualSalary * 0.15;
				break;
			case "HR":
				annualSalary = annualSalary * 0.08;
				break;
			default:
				annualSalary = annualSalary * 0.05;
				
		}
		
		return annualSalary+salary;
	}
}
