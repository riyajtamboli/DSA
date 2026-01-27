package com.pattern;

public class FloyedTriangle {

	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Enter rows : "));
		int count=1;
		for(int i=1; i<=n; i++ ) {
			for(int j=1; j<=i; j++) {
				IO.print(count+++" ");
			}
			IO.println();
		}
	}

}
