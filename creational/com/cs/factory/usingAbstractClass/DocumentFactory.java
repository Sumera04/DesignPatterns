package com.cs.factory.usingAbstractClass;

//------------------ Factory Interface ------------------

/**
 * Factory interface defining a generic contract for document creation.
 * 
 * Promotes Dependency Inversion Principle (DIP) — clients depend on abstraction.
 * Enables polymorphic factories.
 */
interface DocumentFactory {
	Document createDocument();
}
