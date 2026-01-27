package com.pattern;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		int row = Integer.parseInt(IO.readln("Enter Rows : "));
		
		for(int i=0; i<=row; i++) {
			for(int j=0; j<=i; j++) {
				if((i+j)%2==0){
					IO.print("1"+" ");
				}else {
					IO.print("0"+" ");
				}
			}
			IO.println();
		}
	}

}
