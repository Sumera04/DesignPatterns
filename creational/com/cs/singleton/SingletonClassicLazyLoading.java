package com.cs.singleton;

/**
 * Classic (lazy) Singleton implementation.
 * 
 * ✅ Key Idea:
 *    - Instance is created only when it's first requested (lazy initialization).
 * 
 * ⚠️ Limitation:
 *    - NOT thread-safe. Multiple threads calling getInstance() at the same time
 *      can create multiple instances, breaking the Singleton pattern.
 * 
 * 🧠 Tip for Interview:
 *    - Be ready to explain how to make it thread-safe using:
 *        1. synchronized method
 *        2. double-checked locking (with volatile)
 *        3. static inner class (best modern approach)
 */

public class SingletonClassicLazyLoading {
	
	// Step 1: Static reference to the single instance (starts as null)
	private static SingletonClassicLazyLoading instance;
	
	// Step 2: Private constructor prevents instantiation from other classes
	private SingletonClassicLazyLoading() {
	}
	
	/**
	 * Step 3: Public method to provide access to the single instance.
	 * 
	 * Lazy initialization: Instance is created only when first requested.
	 * 
	 * ⚠️ Not thread-safe:
	 * If two threads call getInstance() simultaneously when instance == null,
	 * both could create separate instances.
	 */
	public static SingletonClassicLazyLoading getInstance() {
		if(instance == null)
			instance = new SingletonClassicLazyLoading(); // may create multiple instances if not synchronized
		
		return instance;
	}	
	
	/**
	 * Utility method just to demonstrate that the singleton object works.
	 */
	public static void display() {
		System.out.println("Inside SingletonClassic");
	}
}

