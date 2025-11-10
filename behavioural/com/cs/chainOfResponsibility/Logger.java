package com.cs.chainOfResponsibility;

//Step 1: Create the abstract handler defining the chain structure
abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;             // Log level this handler is responsible for
	protected Logger nextLogger;     // Reference to the next handler in chain

	// Set next logger in the chain
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	// Template method to handle request
	public void logMessage(int level, String message) {
		if (this.level <= level) {   // Check if this handler can process the request
			write(message);
		}
		if (nextLogger != null) {    // Forward to next handler
			nextLogger.logMessage(level, message);
		}
	}

	// Each concrete handler implements its own write logic
	protected abstract void write(String message);
}
