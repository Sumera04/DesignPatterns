package com.cs.state;

//Step 3: Context class maintains the current state and delegates behavior to it
class TrafficLightContext {
	private State currentState; // Holds current light state

	public void setState(State state) {
		this.currentState = state; // Change current state dynamically
	}

	public void applyState() {
		if (currentState != null)
			currentState.handleRequest(); // Delegate behavior to the state
		else
			System.out.println("No state set!");
	}
}
