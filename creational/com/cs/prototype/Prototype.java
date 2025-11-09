package com.cs.prototype;

// ===============================================================
// PROTOTYPE INTERFACE
// ===============================================================

/**
 * Defines a cloning contract for all prototypes.
 *
 * Principle: DIP (Dependency Inversion Principle) - Client depends on abstraction, not concrete classes.
 * Principle: OCP (Open Closed Principle) - New prototype types can be added without modifying client code.
 */
interface Prototype extends Cloneable {
    Prototype clone();  // Custom clone method (not Object.clone())
}