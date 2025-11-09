package com.cs.singleton;

/**
 * Thread-Safe Singleton using synchronized method.
 *
 * ✅ Key Idea:
 *    - Makes getInstance() synchronized to ensure only one thread can create
 *      the instance at a time.
 *
 * ✅ Pros:
 *    - Simple and guarantees thread safety.
 *
 * ⚠️ Cons:
 *    - Synchronization adds performance overhead.
 *      Even after the instance is created, every call to getInstance()
 *      still acquires the lock.
 *
 * 🧠 Interview Tip:
 *    - This was an early fix to the "Classic Singleton" thread-safety issue.
 *    - Mention that it's safe but not optimal.
 *    - The optimized solution is "Double-Checked Locking" or
 *      "Static Inner Class" approach.
 */

public class SingletonWithLocking {
	
	// Step 1: Static reference to the single instance
	private static SingletonWithLocking instance;
	
	// Step 2: Private constructor to prevent external instantiation
	private SingletonWithLocking() { }
	
	/**
	 * Step 3: Thread-safe access method.
	 * 
	 * The synchronized keyword ensures that only one thread can execute
	 * this method at a time — preventing multiple instance creation.
	 */
	public static synchronized SingletonWithLocking getInstance() {
		if (instance == null)
			instance = new SingletonWithLocking(); // Safe: only one thread can enter here
		
		return instance;
	}
	
	/**
	 * Simple utility method to verify the singleton behavior.
	 */
	public static void display() {
		System.out.println("Inside SingletonWithLocking");
	}
}
