package com.cs.command;

//Step 4: Invoker class that triggers the command
class RemoteControl {
	private Command command;

	public void setCommand(Command command) {
		this.command = command; // Client sets the command
	}

	public void pressButton() {
		if (command != null)
			command.execute(); // Executes the command
		else
			System.out.println("No command set");
	}
}


