package com.cs.abstractFactory.usingInterface;

/**
 * Each concrete factory is responsible for creating compatible objects.
 * 
 * SRP — each factory focuses on one notification family.
 * OCP — new notification families can be added easily.
 */
class EmailNotificationFactory implements NotificationAbstractFactory {
	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}

	@Override
	public NotificationTemplate createTemplate() {
		return new EmailNotificationTemplate();
	}
}
