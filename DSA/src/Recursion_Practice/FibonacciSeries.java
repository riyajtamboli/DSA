package Recursion_Practice;

public class FibonacciSeries {
	
	public static int fibSeries(int n) {
		if(n==1 || n == 0) {
			return n;
		}
		
		return fibSeries(n-1)+fibSeries(n-2);
		
	}

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0; i<=n; i++) {
			System.out.print(fibSeries(i)+" ");
		}
	}

}
