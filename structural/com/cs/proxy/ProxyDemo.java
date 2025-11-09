package com.cs.proxy;

//Structural Design Pattern
//Real-World Example: Image viewer loading images lazily using a Proxy

/*
Principles Followed:
- Single Responsibility Principle (SRP): Proxy adds access control or lazy loading logic.
- Open/Closed Principle (OCP): You can introduce new proxy types without modifying real subjects.
- Dependency Inversion Principle (DIP): Client depends on abstraction (interface), not concrete classes.
- Encapsulation: Proxy hides object creation or access complexity from the client.

Pros of Proxy Pattern:
1. Controls access to resource-heavy or remote objects.
2. Adds security, logging, caching, or lazy initialization.
3. Reduces system load by deferring object creation.
4. Client interacts through the same interface, ensuring transparency.

Real-World Analogy:
- Credit card as a proxy for cash: It provides access to funds without handling real money.
- YouTube thumbnail: It represents a video but loads the actual video only when clicked.
*/

//Step 4: Client Code
public class ProxyDemo {
 public static void main(String[] args) {
     Image image1 = new ProxyImage("photo1.jpg");
     Image image2 = new ProxyImage("photo2.jpg");

     // Image will be loaded only when display() is called
     System.out.println("First call to display photo1:");
     image1.display();  // Loads from disk + displays

     System.out.println("\nSecond call to display photo1:");
     image1.display();  // Uses cached image, no loading

     System.out.println("\nDisplay photo2:");
     image2.display();  // Loads from disk + displays
 }
}

/*
Expected Output:
First call to display photo1:
Loading image from disk: photo1.jpg
Displaying image: photo1.jpg

Second call to display photo1:
Displaying image: photo1.jpg

Display photo2:
Loading image from disk: photo2.jpg
Displaying image: photo2.jpg
*/

/* Interview Q&A:
Q1: What problem does the Proxy solve?
A1: It controls access to an object that is expensive, remote, or sensitive by acting as an intermediary.

Q2: How is Proxy different from Decorator?
A2: 
- Proxy controls access (e.g., lazy loading, security).
- Decorator adds new behavior or responsibilities.

Q3: Types of Proxy?
A3: 
- **Virtual Proxy**: Lazy initialization (e.g., load images when needed).  
- **Protection Proxy**: Access control based on permissions.  
- **Remote Proxy**: Manages communication with remote objects.  
- **Caching Proxy**: Caches results to improve performance.  
- **Logging Proxy**: Adds logging around object calls.

Q4: When to use Proxy Pattern?
A4: 
- When creating objects is expensive and should be deferred.
- When you need access control, caching, or logging around objects.
- When the real object resides in a different address space (remote objects).

Q5: What design principles does it follow?
A5: 
- SRP: Proxy manages access logic separately.
- OCP: New proxy behaviors can be added easily.
- DIP: Client works with interface, not concrete implementations.
*/
