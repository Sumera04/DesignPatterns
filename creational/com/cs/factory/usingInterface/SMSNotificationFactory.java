package com.cs.factory.usingInterface;

/**
 * Each factory is responsible for creating a specific type of Notification.
 * 
 * SRP — Each class handles only one creation type.
 * OCP — Adding new factory doesn’t require modifying existing factories.
 */
class SMSNotificationFactory implements NotificationFactory {
	@Override
	public Notification createNotification() {
		// Maybe initialize SMS API credentials here.
		return new SMSNotification();
	}
}