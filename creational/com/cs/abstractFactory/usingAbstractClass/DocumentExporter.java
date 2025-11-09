package com.cs.abstractFactory.usingAbstractClass;

/**
* Abstract class for exporters.
* 
* Demonstrates code reuse (common export behavior).
* Template Method Pattern — defines the export steps.
* Follows DRY principle — shared logic implemented once.
*/
abstract class DocumentExporter {

 // Template Method
 public final void export(Document doc) {
     validate(doc);
     convertToBytes(doc);
     writeToFile(doc);
     System.out.println("Export completed successfully.\n");
 }

 // Common validation step (can be overridden if needed)
 protected void validate(Document doc) {
     System.out.println("Validating " + doc.getClass().getSimpleName());
 }

 // Abstract step — implemented differently for each format
 protected abstract void convertToBytes(Document doc);

 // Common export operation — shared across all exporters
 protected void writeToFile(Document doc) {
     System.out.println("Writing file to disk...");
 }
}

