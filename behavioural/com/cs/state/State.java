package com.cs.state;

//Step 1: Create the State interface defining common behavior for all states
interface State {
	void handleRequest(); // Defines behavior that varies by state
}
