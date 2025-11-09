package com.cs.abstractFactory.usingInterface;

/**
 * Abstract Factory Interface that declares methods for creating
 * families of related objects (Notification + Template).
 * 
 * Follows Dependency Inversion — client depends only on abstraction.
 * Follows Open/Closed — new families can be added without changes.
 */
interface NotificationAbstractFactory {
	Notification createNotification();
	NotificationTemplate createTemplate();
}