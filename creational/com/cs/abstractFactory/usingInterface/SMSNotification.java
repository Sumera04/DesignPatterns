package com.cs.abstractFactory.usingInterface;

//----- EMAIL FAMILY -----
class SMSNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification...");
	}
}
