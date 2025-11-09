package com.cs.factory.usingAbstractClass;

//------------------ Concrete Factories ------------------

/**
 * Each factory focuses on creating one type of Document.
 * Follows SRP — each has one reason to change.
 * Follows OCP — new document types = new factories, no modification.
 */
class WordDocumentFactory implements DocumentFactory {
	@Override
	public Document createDocument() {
		// Could include setup: setting Word headers, metadata, templates, etc.
		System.out.println("Preparing Word document settings...");
		return new WordDocument();
	}
}