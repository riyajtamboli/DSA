package com.inheritance;

public class Aggragation {

	public static void main(String[] args) {
		College clg = new College("Sit", "Lonavala");

		Student raj = new Student("Raj", clg);
		IO.println(raj);
		
	}

}

class College {
	private String collegeName;
	private String location;
	

	public College(String collegeName, String location) {
		super();
		this.collegeName = collegeName;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", location=" + location + "]";
	}
	
}

class Student{
	String studentName;
	College college;
	
	
	public Student(String studentName, College college) {
		super();
		this.studentName = studentName;
		this.college = college;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", college=" + college + "]";
	}
	
	
}