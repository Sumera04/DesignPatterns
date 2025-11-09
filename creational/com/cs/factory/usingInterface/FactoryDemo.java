package com.cs.factory.usingInterface;

/**
 * Client Code
 * 
 *  Depends only on abstraction (interface), not implementation.
 *  Follows Dependency Inversion Principle.
 */
public class FactoryDemo {
	public static void main(String[] args) {
		/**
		 * Adding a new type (e.g., WhatsAppNotification) means modifying existing code → violates Open/Closed Principle. 
		 * If each notification type needs complex creation logic (API tokens, templates, providers, etc.), the single factory gets bloated → violates Single Responsibility Principle (SRP).
		 */
		Notification singleNotification = SingleNotificationFactory.createNotification("email");
		singleNotification.notifyUser(); // Polymorphic call

		/**
		 * We want a modular notification system.
		 * Each type of notification might need special setup (e.g., API keys for SMS, SMTP config for Email).
		 * 
		 * “Can we improve the single NotificationFactory design?”
		 * “Yes — if the creation logic for each notification type becomes complex or if we anticipate frequent additions, 
		 * we can separate each notification type into its own factory class. This follows Single Responsibility and 
		 * Open/Closed Principles and is a step toward the Abstract Factory pattern.”
		 * 
		 * Notes:
		 * Follows SRP — each factory has one reason to change.
		 * Follows OCP — new notification type = new factory, no code modification.
		 * Follows DIP — client depends only on abstractions (Notification, NotificationFactory).
		 * Enables scalability — easily integrate new APIs or providers.
		 * This approach evolves naturally into the Abstract Factory pattern
		 *    if we need families of related objects later (e.g., Email + EmailTemplate).
		 */
        // Suppose user preference = "sms"
        NotificationFactory factory = new SMSNotificationFactory();  // Polymorphic usage
        Notification notification = factory.createNotification();
        notification.notifyUser(); // No knowledge of concrete type
	}
}

/*  Q&A – FACTORY PATTERN

Q1: What is the Factory Pattern?
A1: It is a creational design pattern that provides an interface for creating objects in a superclass, 
but allows subclasses or factory classes to alter the type of objects that will be created.

Q2: Why do we use the Factory Pattern?
A2: To centralize and manage object creation, reduce coupling between client code and concrete classes, 
and make the code more maintainable and extensible.

Q3: What problem does it solve?
A3: It removes the need for client code to know the exact class to instantiate, 
adhering to the "program to an interface, not an implementation" principle.

Q4: What are real-world examples of the Factory Pattern?
A4: 
- Notification system creating Email, SMS, or Push notifications.
- Database connection creation (e.g., JDBC DriverManager.getConnection()).
- GUI frameworks creating buttons and windows for different OS types.

Q5: What are the types of Factory patterns?
A5: 
- Simple Factory (static method returning subclass objects)
- Factory Method (uses inheritance and allows subclasses to define creation)
- Abstract Factory (produces families of related objects)

Q6: Which SOLID principles does the Factory Pattern follow?
A6:
- SRP: Factory handles object creation separately from business logic.
- OCP: New product types can be added without modifying existing code.
- DIP: Client depends on interfaces, not concrete implementations.

Q7: How does the Factory Pattern differ from the Builder Pattern?
A7: 
- Factory focuses on creating objects based on conditions or inputs.
- Builder constructs complex objects step-by-step with more control over configuration.

Q8: How does the Factory Pattern differ from the Prototype Pattern?
A8:
- Factory creates new instances using constructors.
- Prototype creates new instances by cloning existing objects.

Q9: When should you use the Factory Pattern?
A9:
- When object creation logic is complex.
- When multiple related classes share the same interface.
- When you want to decouple object creation from client logic.

Q10: What are the main advantages?
A10:
- Reduces tight coupling.
- Increases flexibility and scalability.
- Centralizes object creation logic.

Q11: What are the disadvantages?
A11:
- Adds extra abstraction, which can make debugging more difficult.
- May introduce many small factory classes if overused.
*/
