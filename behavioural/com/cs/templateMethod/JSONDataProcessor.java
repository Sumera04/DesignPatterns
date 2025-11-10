package com.cs.templateMethod;

//Step 2: Concrete subclasses define specific behavior for steps
class JSONDataProcessor extends DataProcessor {

	@Override
	protected void loadData() {
		System.out.println("Loading JSON data...");
	}

	@Override
	protected void parseData() {
		System.out.println("Parsing JSON file...");
	}

	@Override
	protected void processDataStep() {
		System.out.println("Processing JSON elements...");
	}
}
