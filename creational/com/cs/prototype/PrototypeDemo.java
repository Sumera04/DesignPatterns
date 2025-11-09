package com.cs.prototype;

//===============================================================
//CLIENT CODE
//===============================================================
/**
 * ===============================================================
 * DESIGN PRINCIPLES FOLLOWED
 * ===============================================================
 *	 
 *  SRP (Single Responsibility Principle)
 *   - `Document` only manages data & clone logic.
 *   - `DocumentRegistry` manages prototype storage.
 * 
 *  OCP (Open/Closed Principle)
 *  - New prototype types (e.g., Report, Invoice) can be added without modifying existing classes.
 *  
 *  LSP (Liskov Substitution Principle)
 *  - Clones behave exactly like their originals (substitutable).
 *  
 *  DIP (Dependency Inversion Principle)
 *  - Client depends on Prototype interface, not concrete Document.
 *  
 *  Encapsulation
 *  - `DocumentRegistry` hides object creation logic from clients.
 */
public class PrototypeDemo {
	public static void main(String[] args) {

		// Step 1: Create original prototype
		Document letterTemplate = new Document(
				"Letter Template", 
				"Dear [Name],\nThank you for your business.", 
				"Admin", 
				"Times New Roman"
				);

		// Step 2: Register prototype in registry
		DocumentRegistry.addPrototype("letter", letterTemplate);

		// Step 3: Clone and customize
		Document newLetter = DocumentRegistry.getPrototype("letter");
		newLetter.setTitle("Letter to John");
		newLetter.setAuthor("Manager");

		// Step 4: Display both
		System.out.println("\n--- Prototype Document ---");
		letterTemplate.display();

		System.out.println("--- Cloned & Customized Document ---");
		newLetter.display();
	}
}

/*  
*  ===============================================================
*  REVISION NOTES & Q&A
*  ===============================================================
*  
*  Q1: What is the Prototype Pattern?
*  A1: It's a creational pattern that creates new objects by cloning 
*  existing ones instead of instantiating from scratch.
*  
*  Q2: When would you use it?
*  A2: When object creation is expensive or complex (e.g., loading templates, 
*  database configs, network objects, or large data models).
*  
*  Q3: How is it different from Factory Method?
*  A3: Factory creates *new* objects every time; Prototype *copies* existing ones (clones).
*  
*  Q4: Real-life analogy?
*  A4: Using a pre-designed “template” document instead of writing a new one from scratch.
*  
*  Q5: What are the advantages?
*  A5:
*  - Performance boost (avoids heavy initialization)
*  - Simplifies complex object creation
*  - Allows dynamic object configurations at runtime
*  
*  Q6: What are potential issues?
*  A6:
*  - Deep vs. shallow copy problems
*  - Complex objects may require custom clone logic
*  
*  Q7: Which principles does it follow?
*  A7:- SRP, OCP, LSP, DIP, and Encapsulation.
*  
*  Q8: Where do we use this in real-world systems?
*  A8:
*  - Word processors (copy templates)
*  - Game engines (clone enemies, maps)
*  - GUI editors (duplicate shapes)
*  - Prototype-based caching systems
*/

