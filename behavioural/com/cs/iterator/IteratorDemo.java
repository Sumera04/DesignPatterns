package com.cs.iterator;

//Behavioral Design Pattern
//Real-World Example: Iterating over a collection of books without exposing how books are stored internally

/*
Principles Followed:
- Single Responsibility Principle (SRP): Iterator handles traversal, collection manages storage.
- Encapsulation: The collection hides its internal representation from clients.
- Open/Closed Principle (OCP): New types of iterators (e.g., reverse iterator) can be added without modifying existing code.

Pros of Iterator Pattern:
1. Provides a uniform way to traverse different collections.
2. Hides internal structure (array, list, map, etc.).
3. Allows multiple simultaneous traversals.
4. Supports polymorphic iteration (same interface for all collections).

Real-World Analogy:
- A TV remote lets you go through channels one by one without knowing how they’re stored internally.
- An elevator panel lets you go floor by floor without knowing how floors are connected.
*/

//Step 5: Client code demonstrating traversal without knowing internal structure
public class IteratorDemo {
	public static void main(String[] args) {
		BookCollection collection = new BookCollection();
		Iterator iterator = collection.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

/* Interview Q&A:

Q1: What is the Iterator Pattern?
A1: It provides a uniform way to access elements of a collection sequentially without exposing its internal structure.

Q2: What problem does it solve?
A2: It decouples traversal logic from the collection’s internal representation.

Q3: What are the key participants?
A3: 
- Iterator (interface defining traversal)
- ConcreteIterator (implements traversal)
- Aggregate/Collection (creates iterator)
- ConcreteAggregate (actual collection)

Q4: How does it follow SRP?
A4: Collection focuses on storing data; Iterator focuses on traversal logic.

Q5: Can we have multiple iterators on the same collection?
A5: Yes, each iterator maintains its own traversal state.

Q6: Real-world use cases?
A6: Java’s `Iterator` and `ListIterator` interfaces; loops like `for-each` internally use this pattern.

Q7: What’s the difference between Iterator and Iterable in Java?
A7: `Iterable` defines a method `iterator()` to provide an iterator; `Iterator` defines traversal operations (`hasNext()`, `next()`).
*/
