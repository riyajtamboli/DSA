package Recursion_Practice;

public class AscendingOrder {
	public static void AscendingOrder(int n) {
		if(n==0) {
			return;
		}
		
		AscendingOrder(n-1);
		IO.print(n+" ");
	}

	public static void main(String[] args) {
			AscendingOrder(10);
	}

}
