package com.inheritance;

public interface MobilePhoneInterface {
	int simSlot = 0;
	
	void insertCard(SimCardInterface sim);
	void removeCard();
	void makeCall(long phoneNumber);
	void sendMessage(long phoneNumber, String message);
	
}
