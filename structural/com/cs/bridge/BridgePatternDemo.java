package com.cs.bridge;

//Structural Design Pattern
//Real-World Example: Drawing shapes (like Circle) using different rendering APIs (OpenGL, DirectX)
/*
Principles Followed:
- Composition over Inheritance: Shape "has-a" DrawingAPI instead of extending it.
- Single Responsibility Principle (SRP): Shape defines abstraction; DrawingAPI handles implementation.
- Open/Closed Principle (OCP): New shapes or rendering APIs can be added without modifying existing code.
- Dependency Inversion Principle (DIP): High-level modules (Shape) depend on abstractions (DrawingAPI), 
  not concrete classes.

Pros of Bridge Pattern:
1. Decouples abstraction from implementation, so both can evolve independently.
2. Avoids class explosion (no need for every combination of shape and rendering type).
3. Improves flexibility and scalability.
4. Makes code easier to maintain and extend.

Real-World Analogy:
- Remote control (abstraction) controlling different TV brands (implementations).
- Payment system abstraction (Payment) using different gateways (Stripe, PayPal).
*/
public class BridgePatternDemo {
  public static void main(String[] args) {
      Shape circle1 = new Circle(1, 2, 3, new OpenGLAPI());
      Shape circle2 = new Circle(4, 5, 6, new DirectXAPI());

      circle1.draw();  // Uses OpenGL implementation
      circle2.draw();  // Uses DirectX implementation
  }
}

/*Interview Q&A:
Q1: What problem does the Bridge Pattern solve?
A1: It separates abstraction from implementation so both can vary independently.

Q2: How is Bridge different from Adapter?
A2: Bridge is designed upfront to separate concerns; Adapter is applied later to make existing interfaces compatible.

Q3: Why prefer composition over inheritance here?
A3: Composition allows runtime flexibility and avoids rigid hierarchies caused by inheritance.

Q4: When should you use Bridge Pattern?
A4: When you have multiple dimensions of change (e.g., shape type and rendering type).

Q5: Is Bridge similar to Strategy Pattern?
A5: No. Bridge is structural (separates abstraction and implementation); Strategy is behavioral 
(selects algorithm at runtime).
*/
