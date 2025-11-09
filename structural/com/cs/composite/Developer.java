package com.cs.composite;

//Leaf Class - Represents individual objects (no children)
class Developer implements Employee {
	private String name;
	private String position;

	public Developer(String name, String position) {
		this.name = name;
		this.position = position;
	}

	public void showDetails() {
		System.out.println("Developer: " + name + " (" + position + ")");
	}
}
