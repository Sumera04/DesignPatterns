package com.cs.memento;

//Step 3: Caretaker manages the list of saved states
class History {
	private java.util.Stack<TextMemento> history = new java.util.Stack<>();

	public void save(TextEditor editor) {
		history.push(editor.save());
	}

	public void undo(TextEditor editor) {
		if (!history.isEmpty()) {
			editor.restore(history.pop());
		}
	}
}