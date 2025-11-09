package com.cs.adapter.Printer;

//Adapter — Converts LegacyPrinter interface into Printer interface
class PrinterAdapter implements Printer {
	private LegacyPrinter legacyPrinter; // Composition-based adapter (Object Adapter)

	public PrinterAdapter(LegacyPrinter legacyPrinter) {
		this.legacyPrinter = legacyPrinter;
	}
	@Override
	public void print() {
		// Adapter translates the call
		legacyPrinter.printDocument();
	}
}