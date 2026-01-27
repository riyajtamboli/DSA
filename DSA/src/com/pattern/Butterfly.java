package com.pattern;

public class Butterfly {

	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Enter Rows: "));
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				IO.print("*");
			}
			
			for(int space = 1; space<= 2*(n-i); space++) {
				IO.print(" ");
			}
			
			for(int star = 1; star<=i; star++) {
				IO.print("*");
			}
			
			IO.println();
		}
		
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				IO.print("*");
			}
			
			for(int space = 1; space<= 2*(n-i); space++) {
				IO.print(" ");
			}
			
			for(int star = 1; star<=i; star++) {
				IO.print("*");
			}
			
			IO.println();
		}
		
		
	}

}
