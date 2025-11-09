package com.cs.flyweight;

//Structural Design Pattern
//Real-World Example: Drawing many trees or circles efficiently by sharing common data

/*
Principles Followed:
- Single Responsibility Principle (SRP): Flyweight stores shared (intrinsic) state only.
- Encapsulation: Client manages unique (extrinsic) state externally.
- Memory Optimization: Reduces object count by sharing common data.
- Open/Closed Principle (OCP): New flyweights can be added without changing existing code.

Pros of Flyweight Pattern:
1. Drastically reduces memory usage for large numbers of similar objects.
2. Improves performance when many objects share data.
3. Encourages data sharing and immutability.
4. Maintains consistent intrinsic state across objects.

Real-World Analogy:
- Text editor characters: Each character shares font and style (intrinsic) but has unique position (extrinsic).
- Chess game: Each piece type shares its shape, but its position on the board differs.
 */
//Step 4: Client Code
public class FlyweightDemo {
	private static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};
	private static final String[] OUTLINES = {"Solid", "Dashed"};

	public static void main(String[] args) {
		// Draw 10 circles using shared Flyweight objects
		for (int i = 0; i < 10; i++) {
			String outline = getRandomOutline();
			Circle circle = (Circle) ShapeFactory.getCircle(outline);
			circle.draw(getRandomX(), getRandomY(), getRandomColor());
		}
	}

	private static String getRandomColor() {
		return COLORS[(int) (Math.random() * COLORS.length)];
	}

	private static String getRandomOutline() {
		return OUTLINES[(int) (Math.random() * OUTLINES.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}

/*
Expected Output (example):
Created new Circle with outline: Solid
Drawing Circle with Solid outline at (50,20) with color Blue
Drawing Circle with Solid outline at (10,80) with color Red
Created new Circle with outline: Dashed
Drawing Circle with Dashed outline at (70,90) with color Green
Drawing Circle with Solid outline at (25,55) with color White
Drawing Circle with Dashed outline at (15,45) with color Blue
...
Note: Only 2 Circle objects created, reused multiple times.
 */

/* Interview Q&A:
Q1: What problem does the Flyweight Pattern solve?
A1: It reduces memory usage by sharing common (intrinsic) state across many similar objects.

Q2: What is the difference between intrinsic and extrinsic state?
A2:
- Intrinsic: Shared and immutable data stored inside the flyweight (e.g., shape type, outline).
- Extrinsic: Unique, context-specific data supplied by the client (e.g., position, color).

Q3: When should you use Flyweight Pattern?
A3:
- When you have a large number of objects that share most of their data.
- When memory consumption is a concern.

Q4: What is the role of the Flyweight Factory?
A4: It manages and reuses flyweight instances, ensuring shared objects are not duplicated.

Q5: How does Flyweight differ from Singleton?
A5:
- Singleton ensures one instance of a class.
- Flyweight ensures sharing of many small objects with common intrinsic data.

Q6: Disadvantages?
A6:
- Adds code complexity (splitting intrinsic/extrinsic states).
- Harder to debug because multiple objects share the same data.
 */
