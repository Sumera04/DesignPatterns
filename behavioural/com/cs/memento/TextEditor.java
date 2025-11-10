package com.cs.memento;

//Step 2: Originator creates and restores state snapshots
class TextEditor {
	private String text = "";

	public void type(String newText) {
		text += newText;
	}

	public String getText() {
		return text;
	}

	public TextMemento save() {
		return new TextMemento(text); // Creates a snapshot
	}

	public void restore(TextMemento memento) {
		text = memento.getSavedState(); // Restores from snapshot
	}
}
