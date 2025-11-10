package com.cs.mediator;

//Behavioral Design Pattern
//Real-World Example: A chat room where users communicate through a central ChatMediator instead of directly.

/*
Principles Followed:
- Loose Coupling: Colleagues don’t communicate directly; they use a mediator.
- Single Responsibility Principle (SRP): Each class has a focused role — Mediator manages communication; Colleagues handle their own logic.
- Open/Closed Principle (OCP): New colleague types can be added without modifying existing ones.
- Encapsulation: Communication logic is centralized in the mediator, not scattered among objects.

Pros of Mediator Pattern:
1. Reduces complex dependencies between objects.
2. Centralizes communication for easier maintenance.
3. Promotes reuse of independent colleague classes.
4. Simplifies object collaboration logic.

Cons:
1. Mediator can become complex if too many interactions are centralized.
2. Adds an extra layer of abstraction.

Real-World Analogy:
- Air traffic control: planes (colleagues) communicate via the control tower (mediator).
- Chat room: users communicate via the chat server, not directly with each other.
*/
//Step 4: Client demonstrating decoupled communication
public class MediatorDemo {
	public static void main(String[] args) {
		ChatMediator chatRoom = new ChatRoom();

		User user1 = new User("Alice", chatRoom);
		User user2 = new User("Bob", chatRoom);

		user1.sendMessage("Hi Bob!");
		user2.sendMessage("Hey Alice, how are you?");
	}
}

/* Interview Q&A:

Q1: What is the Mediator Pattern?
A1: It defines an object that centralizes communication between multiple objects, preventing them from referring to each other directly.

Q2: What problem does it solve?
A2: It eliminates complex dependencies and tangled communication paths between objects.

Q3: What are the key components?
A3:
- Mediator (interface)
- ConcreteMediator (handles communication)
- Colleagues (objects communicating via mediator)
- Client (sets up interaction)

Q4: How does it improve design?
A4: Promotes loose coupling and single responsibility by isolating communication logic.

Q5: Real-world examples?
A5: 
- Chat rooms
- Air traffic control systems
- UI dialog boxes coordinating widgets

Q6: Difference between Mediator and Observer?
A6: Mediator coordinates *direct communication* between objects, while Observer broadcasts *state changes* to multiple listeners.

Q7: What’s a common drawback?
A7: The mediator can become a “god object” if it handles too many interactions.
*/

