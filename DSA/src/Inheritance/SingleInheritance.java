package Inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		Hr raj = new Hr();
		raj.bonus();
	}

}

class Employee{
	void salary() {
		IO.println("Salary = 70000");
	}
}

class Hr extends Employee{
	void bonus() {
		IO.println("Bonus = 5000");
	}
}
