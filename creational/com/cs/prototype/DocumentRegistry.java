package com.cs.prototype;

//===============================================================
//PROTOTYPE REGISTRY (OPTIONAL)
//===============================================================

/**
 * Acts as a "Prototype Manager" for storing and cloning prototypes.
 *
 * Principle: Encapsulation
 *    - Hides clone logic from the client.
 * Principle: SRP
 *    - Handles only registration and retrieval of prototypes.
 */
import java.util.HashMap;
import java.util.Map;

class DocumentRegistry {

	private static Map<String, Document> registry = new HashMap<>();

	public static void addPrototype(String key, Document doc) {
		registry.put(key, doc);
	}

	public static Document getPrototype(String key) {
		Document doc = registry.get(key);
		if (doc != null) {
			return (Document) doc.clone();
		}
		throw new IllegalArgumentException("No prototype found for: " + key);
	}
}