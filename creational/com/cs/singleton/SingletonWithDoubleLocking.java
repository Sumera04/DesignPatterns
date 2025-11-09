package com.cs.singleton;

/**
 * Thread-Safe Singleton using Double-Checked Locking (DCL)
 *
 * ✅ Key Idea:
 *    - Combines lazy initialization with high performance.
 *    - Synchronization is applied only the first time the instance is created.
 *
 * ✅ Pros:
 *    - Thread-safe and lazy-loaded.
 *    - Faster than synchronizing the entire getInstance() method.
 *
 * ⚠️ Important:
 *    - 'instance' must be declared as 'volatile' to prevent
 *      issues with instruction reordering in JVM.
 *      What is  instruction reordering in JVM?
 *      if (instance == null) {
 *   		synchronized (Singleton.class) {
 *       	if (instance == null)
 *           instance = new Singleton();
 *   		}
 *		}
 *		
 *		it looks like the JVM will do these steps in order: 
 *		1. Allocate memory for the object.
 *		2. Call the constructor (new Singleton()).
 *		3. Assign the reference to instance.
 *
 *		However, the JVM and CPU are allowed to reorder these instructions to optimize performance.
 *		So it could actually happen like this:
 *
 *		1. Allocate memory for the object.
 *		2. Assign the reference to instance (before constructor finishes).
 *		3. Then call the constructor.
 *
 * 🧠 Interview Tip:
 *    - Be prepared to explain what "instruction reordering" is and why
 *      'volatile' is needed.
 *      
 *      "Why do we use volatile in the double-checked locking singleton?"
 *		Say:
 *		“Because without volatile, instruction reordering by the JVM could cause another thread 
 *		to see a non-null reference to a partially constructed object.
 *		Declaring instance as volatile prevents this by ensuring visibility and preventing reordering.”
		
 *    - Also mention that the "static inner class" pattern is preferred today
 *      because it’s simpler and equally efficient.
 */

public class SingletonWithDoubleLocking {

    // Step 1: Declare instance as volatile
    // Without 'volatile', threads might see a partially constructed object
    private static volatile SingletonWithDoubleLocking instance;

    // Step 2: Private constructor prevents direct instantiation
    private SingletonWithDoubleLocking() { }

    /**
     * Step 3: Public accessor method using double-checked locking.
     * 
     * 1️⃣ First check (without lock) improves performance
     *     - Avoids locking once instance is initialized.
     * 2️⃣ Second check (inside synchronized block)
     *     - Ensures only one thread initializes the instance.
     */
    public static SingletonWithDoubleLocking getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (SingletonWithDoubleLocking.class) {
                if (instance == null) // Second check (with locking)
                    instance = new SingletonWithDoubleLocking();
            }
        }
        return instance;
    }

    /**
     * Utility method to test the singleton.
     */
    public static void display() {
        System.out.println("Inside SingletonWithDoubleLocking");
    }
}
