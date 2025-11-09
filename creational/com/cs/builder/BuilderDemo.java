package com.cs.builder;

//Client code to demonstrate usage
public class BuilderDemo {
	public static void main(String[] args) {
		Computer pc = new Computer.Builder()
				.setCPU("Intel i9")
				.setRAM(32)
				.setStorage(1000)
				.setGPU("RTX 4090")
				.setWiFiEnabled(true)
				.setBluetoothEnabled(true)
				.build();

		pc.showSpecs();
	}
}

/* Q&A – BUILDER PATTERN

Q1: What is the Builder Pattern?
A1: A creational design pattern used to construct complex objects step-by-step, 
especially when objects have many optional parameters.

Q2: When should you use the Builder Pattern?
A2: 
- When a class has many optional fields and telescoping constructors become hard to manage.
- When you want a readable and maintainable way to create complex objects.
- When immutability is desired after construction.

Q3: What problem does it solve?
A3: 
- Avoids long constructors with many parameters.
- Makes object creation more readable.
- Provides flexibility to create different representations of the object.

Q4: How is it different from Factory Pattern?
A4: 
- Factory Pattern focuses on creating a product in one step.
- Builder Pattern focuses on step-by-step construction of a complex object, often with optional parameters.

Q5: What are real-world examples of Builder Pattern?
A5: 
- Constructing a PC or Car with optional components.
- Building HTTP requests in libraries like OkHttp.
- Java's StringBuilder or StringBuffer.
- Constructing a complex meal or pizza with different toppings.

Q6: Which SOLID principles does it follow?
A6: 
- SRP: Builder handles construction, Product holds data.
- OCP: Adding new optional fields does not require changing existing client code.
- Encapsulation: Product’s fields are private and only accessible through builder.
- Immutability: Built object is immutable after construction.
- Fluent Interface: Method chaining makes the code readable.

Q7: What is a “telescoping constructor” and how does Builder solve it?
A7: 
- Telescoping constructor = multiple overloaded constructors with increasing parameters for optional fields.
- Builder replaces it with a single flexible builder class and fluent methods, making the code more readable and maintainable.

Q8: Should the Builder class be static or non-static?
A8: 
- Typically, the Builder is a static inner class to avoid needing an outer class instance.
- Non-static inner class can be used if Builder needs access to the outer class instance, but it’s rarely required.

Q9: Can Builder return different representations of the product?
A9: Yes, the builder can have multiple build methods or configurations to produce different representations of the object.

Q10: How does Builder Pattern promote immutability?
A10: 
- The product’s constructor is private.
- Fields are set only once via the Builder.
- Clients cannot modify fields after construction.
*/
