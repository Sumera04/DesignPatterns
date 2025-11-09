package com.cs.facade;

//Step 1: Subsystem Classes
class Lights {
	public void dim(int level) { 
		System.out.println("Lights dimmed to " + level + "%"); 
	}

	public void on() { 
		System.out.println("Lights ON"); 
	}
}
