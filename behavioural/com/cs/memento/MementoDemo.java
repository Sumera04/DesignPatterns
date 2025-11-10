package com.cs.memento;

//Behavioral Design Pattern
//Real-World Example: Text editor implementing Undo/Redo functionality using snapshots of text state

/*
Principles Followed:
- Single Responsibility Principle (SRP): Each class has one clear role — Originator creates states, Memento stores them, Caretaker manages history.
- Encapsulation: Internal state of the object is saved and restored without exposing its implementation details.
- Open/Closed Principle (OCP): New save/restore operations can be added without modifying existing classes.

Pros of Memento Pattern:
1. Enables undo/redo functionality by saving object snapshots.
2. Preserves encapsulation — internal details of Originator remain hidden.
3. Makes rollback operations safe and isolated.

Cons:
1. Can increase memory usage if many states are stored.
2. Needs careful handling for large or frequent snapshots.

Real-World Analogy:
- “Ctrl+Z” (Undo) in a text editor.
- A video game checkpoint — restores game state to a saved point.
*/
// Step 4: Client demonstrating undo functionality
public class MementoDemo {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		History history = new History();

		editor.type("Hello ");
		editor.type("World!");
		history.save(editor); // Save checkpoint

		editor.type(" More text added...");
		System.out.println("Current Text: " + editor.getText());

		history.undo(editor); // Undo to previous checkpoint
		System.out.println("After Undo: " + editor.getText());
	}
}

/* Interview Q&A:

Q1: What is the Memento Pattern?
A1: It captures and externalizes an object’s internal state without exposing its implementation, allowing it to be restored later.

Q2: What are its main participants?
A2:
- **Originator:** Creates and restores its state.
- **Memento:** Stores the internal state.
- **Caretaker:** Manages saved states and requests rollbacks.

Q3: What problem does it solve?
A3: Provides undo/redo functionality without violating encapsulation.

Q4: What are real-world examples?
A4: Text editors (undo), games (save checkpoints), transactions (rollback).

Q5: Which SOLID principles does it follow?
A5: SRP (each class has one job), and Encapsulation (state details are hidden from caretaker).

Q6: What are drawbacks?
A6: High memory usage for large or frequent snapshots.

Q7: When to use?
A7: When you need to restore an object to a previous state, such as undo, rollback, or versioning systems.
*/
