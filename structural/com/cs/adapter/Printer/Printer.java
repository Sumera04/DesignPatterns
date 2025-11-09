package com.cs.adapter.Printer;

//Adapter Pattern Example
//Type: Structural Design Pattern
//Real-World Example: Connecting a modern printer interface with a legacy printer implementation

//Target Interface — The interface expected by the client
interface Printer {
void print();
}

/*
---------------------------
📘 NOTES & PRINCIPLES FOLLOWED
---------------------------
1. **Single Responsibility Principle (SRP):**
- Adapter’s sole job is to translate the interface (no extra logic).

2. **Open/Closed Principle (OCP):**
- Existing classes (LegacyPrinter, Printer) are not modified.
- New adapters can be created without changing old code.

3. **Dependency Inversion Principle (DIP):**
- The client depends on the abstraction (Printer interface), not a concrete class.

---------------------------
💡 REAL-WORLD ANALOGY
---------------------------
- A **power adapter** converts one plug type into another.
You don’t modify the socket or your laptop — you just use an adapter in between.

- Similarly, `PrinterAdapter` makes `LegacyPrinter` compatible with the `Printer` interface.

---------------------------
PROS
---------------------------
1. Promotes **reusability** of legacy or third-party code.
2. Reduces **tight coupling** between client and incompatible systems.
3. Increases **flexibility** — easy to plug in new adapters.
4. Improves **maintainability** — existing code remains unchanged.

---------------------------
CONS
---------------------------
1. Adds an extra layer of abstraction — may increase complexity slightly.
2. Can be overused — not always necessary if interfaces can be designed cleanly from the start.

---------------------------
 Q&A
---------------------------

Q1. What problem does the Adapter Pattern solve?
A1. It enables classes with incompatible interfaces to work together without modifying existing code.

Q2. What are the main participants in Adapter Pattern?
A2. 
- **Target** (expected interface)
- **Adaptee** (existing incompatible class)
- **Adapter** (bridge class converting one to another)
- **Client** (uses Target interface)

Q3. Difference between Class Adapter and Object Adapter?
A3. 
- **Class Adapter:** Uses inheritance (not flexible in Java due to single inheritance).
- **Object Adapter:** Uses composition (preferred approach in Java).

Q4. How does Adapter differ from Decorator?
A4. 
- **Adapter:** Converts one interface into another.
- **Decorator:** Adds new behavior to an existing interface.

Q5. Which principles does the Adapter Pattern follow?
A5. SRP, OCP, and DIP.

---------------------------
REVISION TIP:
---------------------------
Think of “Adapter” whenever you hear:  
> “I have legacy code or a third-party API that doesn’t match my interface,  
> but I can’t modify it.”
*/

