package com.cs.chainOfResponsibility;

//Step 2: Concrete Handlers — each handles a specific level of responsibility
class FileLogger extends Logger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}