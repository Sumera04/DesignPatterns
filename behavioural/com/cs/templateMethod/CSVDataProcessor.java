package com.cs.templateMethod;

//Step 2: Concrete subclasses define specific behavior for steps
class CSVDataProcessor extends DataProcessor {

	@Override
	protected void loadData() {
		System.out.println("Loading CSV data...");
	}

	@Override
	protected void parseData() {
		System.out.println("Parsing CSV file...");
	}

	@Override
	protected void processDataStep() {
		System.out.println("Processing CSV records...");
	}
}
