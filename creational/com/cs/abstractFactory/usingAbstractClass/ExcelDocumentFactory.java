package com.cs.abstractFactory.usingAbstractClass;

//------------------ Concrete Factories ------------------

/**
 * Each factory focuses on creating one type of Document.
 * Follows SRP — each has one reason to change.
 * Follows OCP — new document types = new factories, no modification.
 */
class ExcelDocumentFactory implements DocumentAbstractFactory {
	@Override
	public Document createDocument() {
		// Excel-specific setup, sheet initialization, etc.
		System.out.println("Initializing Excel workbook...");
		return new ExcelDocument();
	}

	@Override
	public DocumentExporter createDocumentExporter() {
		return new ExcelDocumentExporter();
	}
}