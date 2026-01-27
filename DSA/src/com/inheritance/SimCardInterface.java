package com.inheritance;

public interface SimCardInterface {
		 long phoneNumber = 0;
		 String networkProvider = "";
		 String activated = "";
		public long getNumber(long phoneNumber);
		public String networkProvider(String networkProvider);
		public String activated(String activated);
		
}
