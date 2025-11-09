package com.cs.abstractFactory.usingInterface;

//----- EMAIL FAMILY -----
class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending Email Notification...");
	}
}
