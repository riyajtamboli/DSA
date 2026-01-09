package Shallow_copy;

public class Demo1 {

	public static void main(String[] args) {
			Demo d = new Demo();
			Demo d2 = d;
			d2.setA(12);
			d2.display();
	}

}

class Demo{
	int a = 4000;
	public void setA(int a) {
		this.a = a;
	}
	void display() {
		IO.println(a);
	}
}
