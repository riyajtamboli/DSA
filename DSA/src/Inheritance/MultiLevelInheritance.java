/* One class derived from another derived class */



package Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
			Dog d = new Dog();
			//d.bark();
				d.showColor();
	}
}


class Animal{
	void walk() {
		IO.print("He can walk");
	}
	
	void eat() {
		IO.print("He can Eat");
	}
}

class Mammals extends Animal{
	String color = "Blue";
	void legs() {
		IO.print("4 legs");
	}
}

class Dog extends Mammals{
	
	String color = "White";
	void showColor() {
 		IO.print(super.color);
	}
	void bark() {
		
		IO.print("bark");
	}
	
}