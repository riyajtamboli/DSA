package Recursion_Practice;

public class SumOfNaturalNumber {
	
	public static int printSum(int n) {
		if(n==1) {
			return 1;
		}
		int sum = 0;
		sum = n + printSum(n-1);
		return sum;
		
	}

	public static void main(String[] args) {
		IO.print(printSum(5));

	}

}
