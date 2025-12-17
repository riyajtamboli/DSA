package batch53_elc_classes;

import batch53_blc_classes.Student;

public class StudentDemo {

	public static void main(String[] args) {

			while(true) {
				String name = IO.readln("Enter the name : ");
				int age = Integer.parseInt(IO.readln("Enter Age : "));
				String grade = IO.readln("Enter the grade : ");
				
				Student std = Student.createStudentObject(name, age, grade);
				System.out.println(std);
				String ch = IO.readln("Enter the choice : ");
					
				if(ch.equalsIgnoreCase("no")) {
					break;
				}
			} 
	}

}
