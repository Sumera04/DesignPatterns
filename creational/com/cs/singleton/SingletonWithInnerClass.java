package com.cs.singleton;

/**
 * Singleton Using Static Inner Class (Bill Pugh(pronounced as bill pew) Singleton)
 *
 * ✅ Key Idea:
 *    - The inner static class is NOT loaded until it is referenced.
 *    - The instance is created only when getInstance() is called for the first time.
 *
 * ✅ Pros:
 *    - Thread-safe without using synchronized or volatile.
 *    - Lazy-loaded (created only when needed).
 *    - High performance — no locking overhead.
 *    - Simple and clean — recommended in modern Java.
 *
 * ⚙️ How it works:
 *    - The JVM guarantees that a class is loaded only once, in a thread-safe manner.
 *    - The static inner class (Singleton) is loaded when getInstance() is called.
 *    - This triggers creation of the SingletonWithInnerClass instance only once.
 *
 * 🧠 Interview Tip:
 *    - Be ready to explain that this approach uses JVM class-loading
 *      guarantees to achieve lazy loading and thread-safety.
 *    - Mention that it's better than "double-checked locking"
 *      because it’s simpler, safer, and avoids synchronization.
 */

public class SingletonWithInnerClass {
	
	// Step 1: Private constructor prevents direct instantiation
	private SingletonWithInnerClass() { }

	/**
	 * Step 2: Public accessor method to return the singleton instance.
	 * 
	 * The first call to this method will trigger the loading of the
	 * inner static class (Singleton), which creates the instance.
	 */
	public static SingletonWithInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * Step 3: Static inner class responsible for holding the instance.
	 * 
	 * - This class is not loaded until it’s first referenced by getInstance().
	 * - The instance is created when the class is initialized.
	 */
	private static class SingletonHolder {
		private static final SingletonWithInnerClass INSTANCE = new SingletonWithInnerClass();
	}

	/**
	 * Simple utility method for demonstration.
	 */
	public static void display() {
		System.out.println("Inside SingletonWithInnerClass");
	}
}
