package com.inheritance;

public class MobilePhone implements MobilePhoneInterface{
	int simSlot;
	
	public MobilePhone(int simSlot) {
		this.simSlot = simSlot;
	}
	

	@Override
	public void removeCard() {
	}

	@Override
	public void makeCall(long phoneNumber) {
	}

	@Override
	public void sendMessage(long phoneNumber, String message) {
	}

	@Override
	public void insertCard(SimCardInterface sim) {
		
		if(simSlot != 0) {
			IO.println("Sim already inserted");
		}else {
			IO.println("Sim inserted");
			simSlot = 0;
		}
		
	}
	
	

}
