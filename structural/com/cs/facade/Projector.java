package com.cs.facade;

//Step 1: Subsystem Classes
class Projector {
	public void on() { 
		System.out.println("Projector ON"); 
	}

	public void setInput(DVDPlayer dvd) { 
		System.out.println("Projector input set to DVD Player"); 
	}

	public void off() { 
		System.out.println("Projector OFF"); 
	}
}