package batch53_blc_classes;

public class Student {
		private String name;
		private int age;
		private String grade;
		
		
		private Student(String name, int age, String grade) {
			this.name = name;
			this.age = age;
			this.grade = grade;
		}
		
		public static Student createStudentObject(String name, int age, String grade) {
			return new Student(name, age, grade);
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
		}
		
		
		
		
}
