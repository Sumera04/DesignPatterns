package com.cs.state;

//Step 2: Concrete States implement different behavior
class GreenLightState implements State {
	@Override
	public void handleRequest() {
		System.out.println("Green Light - GO!");
	}
}
