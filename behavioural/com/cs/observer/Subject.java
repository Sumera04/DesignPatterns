package com.cs.observer;

//Step 2: Subject Interface — defines methods for managing observers
interface Subject {
	void attach(Observer observer);     // Register observer
	void detach(Observer observer);     // Unregister observer
	void notifyObservers(String message); // Notify all observers
}
