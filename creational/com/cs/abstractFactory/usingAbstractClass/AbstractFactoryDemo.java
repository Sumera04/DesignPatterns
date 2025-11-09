package com.cs.abstractFactory.usingAbstractClass;


/**
 * Client Code
 * 
 * Depends on abstraction (Document), not concrete implementations — DIP.
 * Uses Polymorphism to execute correct subclass behavior.
 * 
 * - Abstract class used since all documents share partial implementation.
 * - Follows SRP, OCP, LSP, DIP, and promotes code reuse.
 * - Ideal when subclasses share both structure and logic.
 * - Great for systems needing a “template” + customizable behavior.
 */

public class AbstractFactoryDemo {
	public static void main(String[] args) {

		/**
		 * Imagine a document editor platform that supports exporting to Word, PDF, and Excel.
		 * Each document type might require special export configurations (e.g., margins, compression, metadata).
		 * Revision Notes:
		 * - SRP: Each factory handles one document type only.
		 * - OCP: Add new type (e.g., PowerPointDocument) → add new factory, no modification.
		 * - DIP: Client depends on DocumentFactory interface, not concrete classes.
		 * - LSP: Each subclass (Word, Pdf, Excel) can substitute Document safely.
		 * - Polymorphism: The same interface handles all factories & products.
		 * 
		 * How would you improve your single DocumentFactory design?”
		 * “I’d extract each document type into its own factory implementing a DocumentFactory interface. 
		 * This keeps creation logic modular and adheres to Single Responsibility and Open/Closed principles.
		 * It also allows more flexibility if creation of each document type involves unique configuration or dependencies.”
		 * 
		 * This structure evolves naturally into the Abstract Factory Pattern
		 * if we later introduce “families” of related objects (e.g., Document + Editor + Exporter).
		 */

		// Example: Client chooses PDF factory dynamically
        DocumentAbstractFactory factory = new PdfDocumentFactory();

        Document doc = factory.createDocument();
        DocumentExporter exporter = factory.createDocumentExporter();

        doc.open();
        doc.print();
        exporter.export(doc); // Template Method in action
        doc.save();
	}
}
