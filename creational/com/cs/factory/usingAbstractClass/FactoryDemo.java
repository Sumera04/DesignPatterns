package com.cs.factory.usingAbstractClass;


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

public class FactoryDemo {
	public static void main(String[] args) {
		/**
		 * Violates Open/Closed Principle (OCP) — adding a new type requires modifying the factory.
		 * Breaks Single Responsibility Principle (SRP) — one class creates all document types.
		 * Difficult to maintain if each document creation needs unique setup (templates, permissions, etc.).
		 */
		Document singleDoc = SingleDocumentFactory.createDocument("pdf");
		singleDoc.open();
		singleDoc.export();
		singleDoc.save();

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

		DocumentFactory factory = new PdfDocumentFactory();
		Document doc = factory.createDocument();

		doc.open();
		doc.export();
		doc.save();
	}
}
