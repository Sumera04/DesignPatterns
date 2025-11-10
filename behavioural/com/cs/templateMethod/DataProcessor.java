package com.cs.templateMethod;

//Step 1: Abstract class defines the template method and abstract steps
abstract class DataProcessor {

	// Template Method: Defines the skeleton of the algorithm
	public final void processData() {
		loadData();       // Step 1
		parseData();      // Step 2
		processDataStep(); // Step 3
		saveData();       // Step 4
	}

	// Steps that must be implemented by subclasses
	protected abstract void loadData();
	protected abstract void parseData();
	protected abstract void processDataStep();

	// Common method shared by all subclasses
	protected void saveData() {
		System.out.println("Saving processed data to file...");
	}
}
