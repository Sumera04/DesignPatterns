package com.cs.chainOfResponsibility;

//Step 2: Concrete Handlers — each handles a specific level of responsibility
class ConsoleLogger extends Logger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
