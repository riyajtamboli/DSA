package com.pattern;

public class HallowRectangle {

	public static void main(String[] args) {
		
		int row = Integer.parseInt(IO.readln("Enter Row : "));
		int col = Integer.parseInt(IO.readln("Enter Col : "));
		
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i == 1 || i==row || j==1 || j==col) {
					IO.print("*");
				}else {
					IO.print(" ");
				}
			}
			IO.println();
		}

	}

}
