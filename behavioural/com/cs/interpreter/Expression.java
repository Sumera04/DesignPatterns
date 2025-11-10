package com.cs.interpreter;

//Step 1: Expression interface — defines the interpret() method
interface Expression {
	boolean interpret(String context);
}
