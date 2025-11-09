package com.cs.singleton;

/**
 * Eager Initialization Singleton
 * 
 * ✅ Key Idea:
 *    - Instance is created at class loading time.
 * 
 * ✅ Pros:
 *    - Thread-safe by default (no synchronization needed).
 *    - Simple and easy to understand.
 * 
 * ⚠️ Cons:
 *    - Instance is created even if it’s never used (no lazy loading).
 *    - Not ideal if instance creation is heavy and may never be needed.
 */

public class SingletonClassicEagerLoading {
    
    // Step 1: Create the single instance eagerly (when class is loaded)
    private static final SingletonClassicEagerLoading instance = new SingletonClassicEagerLoading();
    
    // Step 2: Private constructor to prevent external instantiation
    private SingletonClassicEagerLoading() {
    }
    
    // Step 3: Public method to access the instance
    public static SingletonClassicEagerLoading getInstance() {
        return instance;
    }

	// Utility method just to demonstrate that the singleton object works.
    public static void display() {
        System.out.println("Inside SingletonClassicEagerLoading");
    }
}
