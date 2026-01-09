package Super_Keyword;


public class SuperVariable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer();
		d.display();
	}

}

class Employee{
	protected int a = 45;
	
	
}
class Developer extends Employee{
	private int a = 50;
	
	public void display() {
		IO.println(this.a);
		IO.print(super.a);
	}
}
