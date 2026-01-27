package rt.innerclasses;

public class NonStaticInnerClass_Demo2 {

	void main(){
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		outer.makeInnerClass();
	}

}

class Outer2{
	int x = 75;
	
	public void makeInnerClass() {
		Inner inner = new Inner();
		IO.println("Value of x : "+x);
		inner.display();
		
	}
	
	class Inner{
		void display() {
			IO.println("Inner class ready");
		}
	}
}
