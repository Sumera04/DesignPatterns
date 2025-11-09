package com.cs.facade;

//Structural Design Pattern
//Real-World Example: Home Theater System controlled through a single remote (Facade)

/*
Principles Followed:
- Single Responsibility Principle (SRP): Facade handles coordination between subsystems.
- Open/Closed Principle (OCP): Subsystems can evolve without affecting the client.
- Dependency Inversion Principle (DIP): Client depends on the Facade abstraction, not subsystem details.

Pros of Facade Pattern:
1. Simplifies complex system interactions.
2. Reduces tight coupling between client and subsystems.
3. Improves code readability and maintainability.
4. Provides a single entry point to multiple APIs or subsystems.

Real-World Analogy:
- A hotel reception desk: You don’t deal with kitchen, housekeeping, or billing separately — 
  the receptionist (Facade) coordinates everything.
- Universal remote: Controls TV, DVD, and speakers using one interface.
 */

//Step 3: Client Code
public class FacadeDemo {
	public static void main(String[] args) {
		// Subsystems
		DVDPlayer dvd = new DVDPlayer();
		Projector projector = new Projector();
		Amplifier amp = new Amplifier();
		Lights lights = new Lights();

		// Facade
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, amp, lights);

		// Client uses simple interface
		homeTheater.watchMovie("Inception");
		homeTheater.endMovie();
	}
}

/*
Expected Output:
Get ready to watch a movie...
Lights dimmed to 30%
Projector ON
Projector input set to DVD Player
Amplifier ON
Volume set to 8
DVD Player ON
Playing movie: Inception
Movie started!

Shutting movie theater down...
Stopping movie
DVD Player OFF
Amplifier OFF
Projector OFF
Lights ON
Movie theater shut down.
 */

/* Interview Q&A:
Q1: What problem does the Facade solve?
A1: It simplifies the usage of complex subsystems by providing a unified interface for clients.

Q2: How is it different from Adapter?
A2: 
- Adapter converts one interface to another for compatibility.
- Facade provides a simpler interface to an entire subsystem.

Q3: When to use Facade?
A3: 
- When a system has multiple subsystems and you want to reduce complexity for clients.
- To decouple clients from complex APIs or legacy code.

Q4: Does Facade hide functionality?
A4: No, it only simplifies access. Advanced clients can still access subsystems directly.

Q5: What design principles does it follow?
A5: 
- SRP: Manages subsystem interactions.
- DIP: Client depends on Facade abstraction.
- OCP: Subsystems can change independently of the Facade.
 */
