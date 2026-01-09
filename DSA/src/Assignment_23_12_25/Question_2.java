package Assignment_23_12_25;

public class Question_2 {

	public static void main(String[] args) {
			int original1 = 1;
			int original2 = 2;
			swap(original1, original2);
			IO.println(original1);
			IO.println(original2);
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a =  b;
		b = temp;
	}

}
