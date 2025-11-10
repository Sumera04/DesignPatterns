package com.cs.command;

//Behavioral Design Pattern
//Real-World Example: Remote control system where each button executes a specific command (TurnOnLight, TurnOffFan)

/*
Principles Followed:
- Single Responsibility Principle (SRP): Each command represents a single action.
- Open/Closed Principle (OCP): New commands can be added without modifying existing code.
- Encapsulation: The request (command) and the action (receiver) are encapsulated separately.
- Loose Coupling: The invoker (remote) doesn’t know the actual implementation details of the receiver.

Pros of Command Pattern:
1. Decouples sender and receiver.
2. Enables undo/redo functionality.
3. Allows command queuing and logging.
4. Easy to add new commands without changing existing code.

Real-World Analogy:
- A waiter takes an order (command) and passes it to the chef (receiver).
The waiter doesn’t need to know how to cook; they just forward the request.
*/

//Step 5: Client code that wires everything together
public class CommandDemo {
	public static void main(String[] args) {
		Light light = new Light();

		Command lightOn = new TurnOnLightCommand(light);
		Command lightOff = new TurnOffLightCommand(light);

		RemoteControl remote = new RemoteControl();

		remote.setCommand(lightOn);
		remote.pressButton(); // Light is ON

		remote.setCommand(lightOff);
		remote.pressButton(); // Light is OFF
	}
}

/* Interview Q&A:

Q1: What problem does the Command Pattern solve?
A1: It decouples the sender of a request from the receiver, allowing requests to be queued, logged, or undone.

Q2: What are the main components?
A2: Command (interface), ConcreteCommand (implementation), Receiver (actual work), Invoker (triggers command), and Client (configures everything).

Q3: How is undo functionality implemented?
A3: By maintaining a history stack of executed commands and defining an `undo()` method in each command.

Q4: Difference between Command and Strategy Pattern?
A4: Command encapsulates a request as an object (focus on *action*).  
  Strategy encapsulates an algorithm (focus on *how to do*).

Q5: When to use Command Pattern?
A5: Use when you need to queue requests, implement undo/redo, or issue requests to objects without knowing their actions.

Q6: Common real-world use cases?
A6: Remote controls, GUI buttons, task scheduling, and transaction processing systems.
*/

