package com.cs.prototype;

//===============================================================
// CONCRETE PROTOTYPE — Document
//===============================================================
/**
 * Demonstrates both SHALLOW and DEEP cloning approaches.
 *
 * SRP — handles only document data and cloning logic.
 * LSP — cloned documents substitute originals safely.
 */
class DocumentWithMetadata implements Prototype {

	private String title;
	private String content;
	private String author;
	private Metadata metadata;

	public DocumentWithMetadata(String title, String content, String author, Metadata metadata) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.metadata = metadata;

		// Simulate heavy initialization
		System.out.println("Loading resources and setting up document engine...");
	}

	/**
	 * SHALLOW COPY — references same Metadata object
	 */
	public Prototype shallowClone() {
		System.out.println("Performing SHALLOW copy...");
		return new DocumentWithMetadata(title, content, author, metadata); // same reference
	}

	/**
	 * DEEP COPY — creates new Metadata object (no shared reference)
	 */
	@Override
	public Prototype clone() {
		System.out.println("Performing DEEP copy...");
		return new DocumentWithMetadata(title, content, author, metadata.deepCopy());
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

	public Metadata getMetadata() { 
		return metadata; 
	}

	public void display() {
		System.out.println("Title: " + title + " | Author: " + author);
		System.out.println("Metadata → " + metadata);
		System.out.println("Content: " + content + "\n");
	}
}
