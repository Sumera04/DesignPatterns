package com.cs.factory.usingInterface;

/**
 * Factory interface defining a method for creating notifications.
 * 
 * This allows creating families of factories (Abstract Factory concept).
 * Follows Interface Segregation & DIP.
 *
 * We can create separate factories for each product family (e.g., Email, SMS, Push).
 * This approach is especially relevant when:
 * 1. You want to follow the Open/Closed Principle more strictly.
 * 2. Your creation logic for each type becomes complex or distinct.
 * 3. You’re evolving towards the Abstract Factory Pattern (a natural extension of Factory Method).
 */
interface NotificationFactory {
	Notification createNotification();
}