package com.cs.factory.usingInterface;

/**
 * Factory class responsible for object creation.
 * 
 * Follows Factory Method pattern — encapsulates object creation logic.
 * Follows Open/Closed Principle (OCP) — new types can be added without modifying client code.
 * Client is decoupled from concrete classes (DIP).
 */
class SingleNotificationFactory {
	public static Notification createNotification(String type) {
		if (type == null || type.isEmpty()) {
			return null;
		}
		switch (type.toLowerCase()) {
		case "email":
			return new EmailNotification();
		case "sms":
			return new SMSNotification();
		case "push":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown notification type: " + type);
		}
	}
}