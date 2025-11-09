package com.cs.abstractFactory.usingInterface;

//----- Push FAMILY -----
class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification...");
	}
}
