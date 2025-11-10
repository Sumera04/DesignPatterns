package com.cs.mediator;

//Step 3: Colleague (User) class interacting via the mediator
class User {
	private String name;
	private ChatMediator mediator;

	public User(String name, ChatMediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		mediator.showMessage(this, message); // Delegates message sending to mediator
	}
}
