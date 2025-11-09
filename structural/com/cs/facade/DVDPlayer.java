package com.cs.facade;

//Step 1: Subsystem Classes
class DVDPlayer {
	public void on() { 
		System.out.println("DVD Player ON"); 
	}
	public void play(String movie) { 
		System.out.println("Playing movie: " + movie); 
	}

	public void stop() { 
		System.out.println("Stopping movie"); 
	}

	public void off() { 
		System.out.println("DVD Player OFF"); 
	}
}

