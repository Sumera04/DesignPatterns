package com.cs.interpreter;

//Step 2: TerminalExpression — represents simple values (e.g., words or symbols)
class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}
}