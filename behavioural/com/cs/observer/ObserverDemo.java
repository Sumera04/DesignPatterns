package com.cs.observer;

//Behavioral Design Pattern
//Real-World Example: Notification system (e.g., YouTube channel subscribers)
/*
Principles Followed:
- Loose Coupling: Subject and Observers communicate through an interface.
- Open/Closed Principle (OCP): New observers can be added without modifying existing code.
- Dependency Inversion Principle (DIP): Both Subject and Observer depend on abstractions.
- Single Responsibility Principle (SRP): Each class handles one responsibility (notifying, updating, or observing).

Pros of Observer Pattern:
1. Promotes decoupling between publisher and subscribers.
2. Makes system event-driven and easily extensible.
3. Enables automatic update propagation.

Real-World Analogy:
- YouTube Channel (Subject) notifies all its subscribers (Observers) when a new video is uploaded.
- Stock Market system notifying registered apps when prices change.
*/

//Step 5: Demo Class — client interaction
public class ObserverDemo {
	public static void main(String[] args) {
		Channel channel = new Channel("TechWorld");

		Observer user1 = new Subscriber("Alice");
		Observer user2 = new Subscriber("Bob");
		Observer user3 = new Subscriber("Charlie");

		channel.attach(user1);
		channel.attach(user2);
		channel.attach(user3);

		channel.uploadVideo("Observer Pattern Explained"); // All subscribers get notified

		channel.detach(user2); // Bob unsubscribes
		channel.uploadVideo("Strategy Pattern in Java"); // Only Alice and Charlie get notified
	}
}


/*Interview Q&A:
Q1: What problem does the Observer Pattern solve?
A1: It allows multiple objects to automatically stay updated when the state of another object changes.

Q2: How does it achieve loose coupling?
A2: Subject and Observers communicate via interfaces, so neither depends on the other’s implementation.

Q3: Difference between Observer and Publisher-Subscriber?
A3: Observer is typically in-process and direct; Pub-Sub uses an event bus or broker (more decoupled).

Q4: How does it follow SOLID principles?
A4:
- SRP: Each class handles one concern.
- OCP: Add new observers without changing existing code.
- DIP: Both depend on abstraction.

Q5: When to use?
A5: When one object’s change must notify others automatically — e.g., UI listeners, data streams, notifications.

Q6: Disadvantage?
A6: Can lead to cascading updates or difficult debugging if there are too many observers or circular notifications.
*/
