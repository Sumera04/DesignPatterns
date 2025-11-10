package com.cs.state;

//Step 2: Concrete States implement different behavior
class RedLightState implements State {
	@Override
	public void handleRequest() {
		System.out.println("Red Light - STOP!");
	}
}
