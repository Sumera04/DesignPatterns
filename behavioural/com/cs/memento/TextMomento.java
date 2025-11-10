package com.cs.memento;


//Step 1: Memento class stores internal state
class TextMemento {
	private final String state;

	public TextMemento(String state) {
		this.state = state;
	}

	public String getSavedState() {
		return state;
	}
}