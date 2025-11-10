package com.cs.mediator;

//Step 2: Concrete Mediator implementing central communication logic
class ChatRoom implements ChatMediator {
	@Override
	public void showMessage(User user, String message) {
		System.out.println(user.getName() + " [" + java.time.LocalTime.now() + "]: " + message);
	}
}
