package com.cs.factory.usingAbstractClass;

/**
 * Factory class responsible for creating appropriate Document objects.
 * 
 * Encapsulates creation logic — Factory Method Pattern.
 * Supports OCP — adding new document type doesn’t affect existing logic.
 */
class SingleDocumentFactory {
	public static Document createDocument(String type) {
		switch (type.toLowerCase()) {
		case "word":
			return new WordDocument();
		case "pdf":
			return new PdfDocument();
		case "excel":
			return new ExcelDocument();
		default:
			throw new IllegalArgumentException("Unknown document type: " + type);
		}
	}
}
