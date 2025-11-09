package com.cs.singleton;

public class SingletonDemo {
	public static void main(String[] args) {

		SingletonClassicEagerLoading se = SingletonClassicEagerLoading.getInstance();
		se.display();
		
		SingletonClassicLazyLoading sc = SingletonClassicLazyLoading.getInstance();
		sc.display();
		
		SingletonWithLocking scl = SingletonWithLocking.getInstance();
		scl.display();
		
		SingletonWithDoubleLocking scdl = SingletonWithDoubleLocking.getInstance();
		scdl.display();
		
		SingletonWithInnerClass scic = SingletonWithInnerClass.getInstance();
		scic.display();
	}
}
/*  Q&A – SINGLETON PATTERN

Q1: What is the Singleton Pattern?
A1: It is a creational design pattern that ensures a class has only one instance and provides a global point of access to it.

Q2: What problem does it solve?
A2: It prevents multiple instances of a class when only one is needed, for example, for shared resources like configuration, logging, or thread pools.

Q3: What are the types of Singleton implementations in Java?
A3:
- Eager Initialization
- Lazy Initialization
- Thread-safe Singleton (synchronized)
- Double-Checked Locking
- Static Inner Class
- Enum Singleton

Q4: What are real-world examples of Singleton?
A4:
- Logger class
- Configuration manager
- Database connection pool manager
- Runtime class (e.g., `Runtime.getRuntime()`)

Q5: Which SOLID principles does Singleton affect?
A5:
- SRP: Singleton often violates SRP if it handles multiple responsibilities.
- DIP: Singleton can violate DIP if clients depend directly on its concrete implementation.
- But it promotes controlled access to a shared resource.

Q6: What are the advantages of Singleton?
A6:
- Controlled access to the single instance.
- Reduced memory footprint (only one instance exists).
- Provides a global point of access to shared resources.

Q7: What are the disadvantages of Singleton?
A7:
- Can introduce global state, making testing harder.
- Can violate Single Responsibility Principle if overused.
- Can create hidden dependencies between classes.
- Multithreading issues if not implemented correctly.

Q8: When should you use Singleton?
A8:
- When exactly one instance of a class is needed.
- When you want to coordinate actions across the system via a single point.
- When the resource is expensive to create.

Q9: How is Singleton different from Factory or Builder patterns?
A9:
- Singleton controls the number of instances (one only), while Factory and Builder focus on *how* objects are created.
- Singleton is about instance management, not construction logic.

Q10: How can Singleton be made thread-safe in Java?
A10:
- Use synchronized access in lazy initialization.
- Use double-checked locking with volatile keyword.
- Use static inner class initialization.
- Use Enum (Java recommended approach for Singleton).
*/
