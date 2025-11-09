package com.cs.factory.usingAbstractClass;

//------------------ Concrete Factories ------------------

/**
 * Each factory focuses on creating one type of Document.
 * Follows SRP — each has one reason to change.
 * Follows OCP — new document types = new factories, no modification.
 */
class PdfDocumentFactory implements DocumentFactory {
	@Override
	public Document createDocument() {
		// PDF compression, font embedding, encryption setup...
		System.out.println("Configuring PDF export options...");
		return new PdfDocument();
	}
}