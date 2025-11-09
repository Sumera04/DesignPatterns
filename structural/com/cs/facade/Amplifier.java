package com.cs.facade;

//Step 1: Subsystem Classes
class Amplifier {
	public void on() { 
		System.out.println("Amplifier ON"); 
	}

	public void setVolume(int level) { 
		System.out.println("Volume set to " + level); 
	}

	public void off() { 
		System.out.println("Amplifier OFF"); 
	}
}