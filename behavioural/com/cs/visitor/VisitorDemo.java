package com.cs.visitor;

//Behavioral Design Pattern
//Real-World Example: Shopping cart items (Book, Fruit) with different pricing logic handled by a Visitor

/*
Principles Followed:
- Open/Closed Principle (OCP): New operations can be added without modifying existing element classes.
- Single Responsibility Principle (SRP): Visitor defines external operations; element classes focus only on their data.
- Separation of Concerns: Business logic for operations (like pricing or tax calculation) is separated from data classes.

Pros of Visitor Pattern:
1. Add new operations without changing element classes.
2. Keeps related behavior together in Visitor classes.
3. Promotes cleaner and more maintainable code.

Cons:
1. Adding new element types requires updating all Visitors.
2. Tight coupling between Visitor and Element structure.

Real-World Analogy:
- Customs officer (visitor) inspects different luggage types (elements) differently.
- Tax auditor (visitor) applies different tax rules for various income sources (elements).
*/
//Step 5: Client — uses Visitor to perform operations
public class VisitorDemo {
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] {
				new Book(60, "1234"),
				new Book(35, "5678"),
				new Fruit(10, 2, "Apple"),
				new Fruit(5, 5, "Banana")
		};

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}
}

/* Interview Q&A:

Q1: What is the Visitor Pattern?
A1: It allows defining new operations on a group of related objects without changing their classes by using a separate visitor object.

Q2: What problem does it solve?
A2: It decouples algorithms from the objects they operate on, supporting new behaviors without modifying element code.

Q3: What is "double dispatch"?
A3: It’s a mechanism where the operation executed depends on both the visitor type and the element type — enabling proper method selection.

Q4: When to use Visitor Pattern?
A4:
- When an object structure is stable but you need to add new operations frequently.
- When behavior should be kept separate from data structure.

Q5: Real-world examples?
A5:
- Compilers: traversing AST nodes to perform operations like type checking or code generation.
- Tax calculation for different product categories.

Q6: Difference between Strategy and Visitor?
A6:
- Strategy changes the algorithm used by one object.
- Visitor adds new operations across many different object types.

Q7: Drawback?
A7: Adding a new element type requires changing all existing visitors.
*/

