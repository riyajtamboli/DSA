package com.inheritance;

public class Main {

	public static void main(String[] args) {
		long l = 99999999999L;
		Jio jio =new Jio(l, "jio", "yes");
		
		IO.println(jio.getNumber(l));
		MobilePhone mi = new MobilePhone(1);
		mi.insertCard(jio);		
	}

}
