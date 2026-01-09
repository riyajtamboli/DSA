package Super_Keyword;

public class SuperConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		
	}

}

class Animal{
	
	public Animal() {
		IO.println("Animal Constructor");
	}
}

class Dog extends Animal{
	
	public Dog() {
		IO.println("Dog Constructor");
	}
}