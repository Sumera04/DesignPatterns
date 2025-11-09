package com.cs.prototype;

//===============================================================
//CONCRETE PROTOTYPE
//===============================================================

/**
 * Real-world entity representing a Document.
 *
 * 🧠 Heavy object to create due to setup (fonts, templates, styles)
 *
 * Principle: SRP (Single Responsibility Principle)
 *    - Handles only document data and cloning logic.
 * Principle: LSP (Liskov Substitution Principle)
 *    - Cloned objects can substitute originals safely.
 */
class Document implements Prototype {

	private String title;
	private String content;
	private String author;
	private String fontStyle;

	public Document(String title, String content, String author, String fontStyle) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.fontStyle = fontStyle;

		// Simulate heavy initialization
		System.out.println("Loading fonts, styles, and layout engine...");
	}

	@Override
	public Prototype clone() {
		System.out.println("Cloning Document object...");
		return new Document(title, content, author, fontStyle);
	}

	// Getters/Setters for modification after cloning
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display() {
		System.out.println("Title: " + title + " | Author: " + author + " | Font: " + fontStyle);
		System.out.println("Content: " + content + "\n");
	}
}