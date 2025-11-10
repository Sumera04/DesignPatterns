package com.cs.state;

//Step 2: Concrete States implement different behavior
class YellowLightState implements State {
	@Override
	public void handleRequest() {
		System.out.println("Yellow Light - READY!");
	}
}