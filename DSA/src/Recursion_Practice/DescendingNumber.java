package Recursion_Practice;

public class DescendingNumber {
	
	public static void descendingNumber(int n) {
		if(n== 0) {
			return;
		}
		IO.print(n + " ");
		descendingNumber(n-1);
	}

	public static void main(String[] args) {
		descendingNumber(10);
	}

}
