package com.cs.factory.usingInterface;

/**
 * Concrete implementations of Notification
 * 
 * Each class follows Single Responsibility Principle (SRP) —
 *    handles only one type of notification.
 */
class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending an Email Notification");
	}
}