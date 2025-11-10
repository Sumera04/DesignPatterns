package com.cs.observer;

//Step 4: Concrete Observers — define custom reaction to update
class Subscriber implements Observer {
	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " received notification: " + message);
	}
}
