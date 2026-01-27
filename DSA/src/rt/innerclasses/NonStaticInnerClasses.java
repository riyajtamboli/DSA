package rt.innerclasses;

public class NonStaticInnerClasses {

	public static void main(String[] args) {
	
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}

}


class Outer{
	private int x = 15;
	
	class Inner{
		public void display() {
			int x = 25;
			IO.println("Value of x : "+x);
		}
	}
}