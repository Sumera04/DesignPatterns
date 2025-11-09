package com.cs.prototype;

import java.util.HashMap;
import java.util.Map;

//===============================================================
// PROTOTYPE REGISTRY
//===============================================================
/**
 * Stores and provides cloned prototypes.
 *
 *  Encapsulation — hides internal creation logic.
 */
class DocumentRegistryWithMetadata {
	private static Map<String, DocumentWithMetadata> registry = new HashMap<>();

	public static void addPrototype(String key, DocumentWithMetadata doc) {
		registry.put(key, doc);
	}

	public static DocumentWithMetadata getDeepCopy(String key) {
		DocumentWithMetadata doc = registry.get(key);
		if (doc != null) 
			return (DocumentWithMetadata) doc.clone();

		throw new IllegalArgumentException("No prototype found for key: " + key);
	}

	public static DocumentWithMetadata getShallowCopy(String key) {
		DocumentWithMetadata doc = registry.get(key);
		if (doc != null) 
			return (DocumentWithMetadata) doc.shallowClone();

		throw new IllegalArgumentException("No prototype found for key: " + key);
	}
}
