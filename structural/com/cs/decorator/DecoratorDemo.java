package com.cs.decorator;

//Real-World Example: Coffee shop — adding milk, sugar, or cream to a basic coffee

/*
Principles Followed:
- Open/Closed Principle (OCP): New behaviors can be added without modifying existing classes.
- Single Responsibility Principle (SRP): Each decorator adds one specific feature.
- Composition Over Inheritance: Decorators use object composition instead of subclassing.

Pros of Decorator Pattern:
1. Adds responsibilities dynamically at runtime.
2. Avoids class explosion (compared to subclassing).
3. Promotes flexibility and reusability.
4. Follows “wrap to extend” design philosophy.

Real-World Analogy:
- Wrapping a gift: You can add multiple layers (decorations) without altering the gift itself.
- Coffee shop: Start with plain coffee and add milk, sugar, or whipped cream dynamically.
 */

//Step 5: Client Code
public class DecoratorDemo {
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " => Rs." + coffee.getCost());

		// Add milk
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " => Rs." + coffee.getCost());

		// Add sugar
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription() + " => Rs." + coffee.getCost());

		// Add whip cream
		coffee = new WhipCreamDecorator(coffee);
		System.out.println(coffee.getDescription() + " => Rs." + coffee.getCost());
	}
}

/*
Expected Output:
Simple Coffee => Rs.50.0
Simple Coffee, Milk => Rs.60.0
Simple Coffee, Milk, Sugar => Rs.65.0
Simple Coffee, Milk, Sugar, Whip Cream => Rs.80.0
 */

/* Interview Q&A:
Q1: What problem does the Decorator solve?
A1: It allows adding new behavior dynamically without modifying existing code or 
	creating complex inheritance hierarchies.

Q2: How is it different from Inheritance?
A2: Inheritance adds behavior at compile time; Decorator adds at runtime via composition.

Q3: Difference between Decorator and Proxy?
A3: Both wrap an object, but:
 - Decorator adds functionality.
 - Proxy controls access or manages object lifecycle.

Q4: What design principles does it follow?
A4: Open/Closed, Single Responsibility, and Composition over Inheritance.

Q5: When not to use Decorator?
A5: When too many decorators make debugging or object tracing complex.
 */

