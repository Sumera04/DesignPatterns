package com.cs.chainOfResponsibility;

//Step 2: Concrete Handlers — each handles a specific level of responsibility
class ErrorLogger extends Logger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error::Logger: " + message);
	}
}
