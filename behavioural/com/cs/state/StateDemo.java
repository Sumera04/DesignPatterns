package com.cs.state;

//Behavioral Design Pattern
//Real-World Example: Traffic light system where the signal changes behavior dynamically based on current state (Red, Yellow, Green)

/*
Principles Followed:
- Single Responsibility Principle (SRP): Each state class handles behavior for a single state.
- Open/Closed Principle (OCP): Adding a new state doesn’t affect existing code.
- Encapsulation of Behavior: State-specific logic is localized in individual classes.
- Loose Coupling: The context delegates behavior to the current state object.

Pros of State Pattern:
1. Removes complex conditional (if/else or switch) statements.
2. Encapsulates state-specific behavior cleanly.
3. Makes state transitions explicit and controlled.
4. Improves code maintainability and scalability.

Real-World Analogies:
- Traffic lights: behavior changes depending on which light is ON.
- Media player: Play, Pause, Stop states each define unique behavior.
*/

//Step 4: Client code demonstrating behavior change by switching states
public class StateDemo {
	public static void main(String[] args) {
		TrafficLightContext context = new TrafficLightContext();

		context.setState(new RedLightState());
		context.applyState(); // Red Light - STOP!

		context.setState(new YellowLightState());
		context.applyState(); // Yellow Light - READY!

		context.setState(new GreenLightState());
		context.applyState(); // Green Light - GO!
	}
}


/* Interview Q&A:

Q1: What is the State Pattern?
A1: It allows an object to change its behavior dynamically when its internal state changes, 
appearing as if the object’s class has changed.

Q2: How does it differ from Strategy Pattern?
A2: In Strategy, behavior is selected by the client at runtime; in State, the context changes 
behavior automatically as state changes.

Q3: Which SOLID principles does it follow?
A3: SRP (each state has one responsibility), OCP (add new states without changing existing code).

Q4: What are real-world use cases?
A4: Vending machines, media players, document workflows, traffic lights, and ATM machines.

Q5: What is the main benefit?
A5: Eliminates large conditional logic for state transitions and keeps each state behavior isolated.

Q6: What is a common drawback?
A6: Increases the number of classes and objects, making the design more complex for simple problems.
*/

