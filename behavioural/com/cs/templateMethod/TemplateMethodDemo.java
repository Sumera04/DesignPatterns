package com.cs.templateMethod;

//Behavioral Design Pattern
//Real-World Example: Data processing workflow (steps like load, parse, process, and save)
/*
Principles Followed:
- Template Method defines a fixed algorithm structure but allows subclasses to redefine certain steps.
- Open/Closed Principle (OCP): Algorithm structure is fixed; new variations can be added via subclassing.
- Hollywood Principle: “Don’t call us, we’ll call you” — base class calls subclass methods at specific points.
- Inversion of Control: The parent class controls flow; subclasses fill in details.

Pros of Template Method Pattern:
1. Promotes code reuse by defining invariant parts of an algorithm in a single place.
2. Enforces consistent processing structure across subclasses.
3. Reduces code duplication.

Real-World Analogy:
- Cooking recipe template: Steps like “prepare ingredients”, “cook”, “serve” are fixed, 
but details differ for each dish.
- Document generation: Steps like “create header”, “add content”, “print footer” are fixed; 
content varies.
*/

//Step 3: Demo class — client code
public class TemplateMethodDemo {
	public static void main(String[] args) {
		DataProcessor csvProcessor = new CSVDataProcessor();
		csvProcessor.processData();  // Executes full template with CSV-specific steps

		System.out.println();

		DataProcessor jsonProcessor = new JSONDataProcessor();
		jsonProcessor.processData(); // Executes full template with JSON-specific steps
	}
}


/*Interview Q&A:
Q1: What problem does the Template Method solve?
A1: It allows defining the skeleton of an algorithm in a base class while letting subclasses customize specific steps.

Q2: Why is it called “Template Method”?
A2: Because the parent class provides a “template” (fixed workflow) for the algorithm.

Q3: Which principle does it implement?
A3: Open/Closed Principle — base algorithm is fixed, and behavior changes via subclassing.

Q4: Difference between Template Method and Strategy Pattern?
A4: 
- Template Method: Uses inheritance (base class controls flow).
- Strategy: Uses composition (behavior is injected dynamically).

Q5: What is the Hollywood Principle?
A5: “Don’t call us, we’ll call you.” — The parent class controls the sequence, calling subclass methods when needed.

Q6: When to use it?
A6: When you have a common process with fixed steps but need flexibility in some of them (e.g., report generation, data processing, testing frameworks).

Q7: Disadvantage?
A7: Relies on inheritance, which can reduce flexibility compared to composition-based patterns.
*/

