package com.cs.abstractFactory.usingAbstractClass;

//------------------ Abstract-class-based Factory Pattern ------------------

/**
* Abstract class representing a generic Document.
* 
* Demonstrates Abstraction — defines what all documents can do.
* Promotes Reusability — provides common logic (open, save).
* Supports Template Method idea — some methods are implemented, others abstract.
*/
abstract class Document {

// Common method shared across all documents
// Example of code reuse (DRY principle)
public void open() {
   System.out.println("Opening document...");
}

public void save() {
   System.out.println("Saving document...");
}

// Abstract method — enforces specific behavior in subclasses
public abstract void print();
}