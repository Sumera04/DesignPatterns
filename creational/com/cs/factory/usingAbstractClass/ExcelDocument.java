package com.cs.factory.usingAbstractClass;

/**
 * Concrete Document types
 * 
 * Follows SRP — each class has one responsibility: handle a specific document format.
 * Follows Liskov Substitution Principle (LSP) — any subclass can replace its parent type safely.
 */

class ExcelDocument extends Document {
	@Override
	public void export() {
		System.out.println("Exporting as .xlsx file");
	}
}
