package com.cs.factory.usingInterface;

/**
 * Concrete implementations of Notification
 * 
 * Each class follows Single Responsibility Principle (SRP) —
 *    handles only one type of notification.
 */
class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending a Push Notification");
	}
}
