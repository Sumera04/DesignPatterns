package com.cs.chainOfResponsibility;

//Behavioral Design Pattern
//Real-World Example: Logging system where messages pass through multiple loggers (Error, File, Console)
/*
Principles Followed:
- Single Responsibility Principle (SRP): Each handler (logger) processes one specific type of request.
- Open/Closed Principle (OCP): New handlers can be added without modifying existing ones.
- Loose Coupling: Sender doesn’t know which handler will process the request.
- Separation of Concerns: Each handler focuses only on its own logic.

Pros of Chain of Responsibility Pattern:
1. Reduces complex if-else or switch statements.
2. Promotes flexible and extensible request handling.
3. Allows multiple handlers to process the same request.
4. Decouples sender and receiver.

Real-World Analogy:
- Customer support escalation: requests move from Level 1 → Level 2 → Manager until resolved.
- Logging framework: error messages may go through ErrorLogger → FileLogger → ConsoleLogger.
*/

//Step 3: Client class — builds the chain and triggers processing
public class ChainOfResponsibilityDemo {

	// Build the chain: Error → File → Console
	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.DEBUG);
		Logger consoleLogger = new ConsoleLogger(Logger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger; // Return head of the chain
	}

	public static void main(String[] args) {
		Logger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(Logger.INFO, "This is an information.");    // Handled by Console
		loggerChain.logMessage(Logger.DEBUG, "This is a debug level info."); // File + Console
		loggerChain.logMessage(Logger.ERROR, "This is an error message.");   // Error + File + Console
	}
}


/*Interview Q&A:
Q1: What problem does the Chain of Responsibility solve?
A1: It allows multiple handlers to process a request without the sender knowing which one will handle it.

Q2: How does it reduce coupling?
A2: The sender sends the request to the chain’s head; each handler decides whether to handle or pass it along.

Q3: Which SOLID principles does it follow?
A3: SRP (each handler has one responsibility), OCP (new handlers can be added), and Loose Coupling.

Q4: What is the main advantage?
A4: It removes the need for large conditional logic and promotes flexible handler combinations.

Q5: When to use it?
A5: When multiple objects can handle a request, and the exact handler isn’t known in advance (e.g., event handling, logging, approval workflows).

Q6: Common disadvantage?
A6: If no handler processes the request, it may go unhandled. Debugging long chains can also be tricky.
*/
