package com.pattern;

public class InvertedHalfPyramidNumber {

	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Enter rows : "));
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				IO.print(j+" ");
			}
			IO.println();
		}

	}

}
