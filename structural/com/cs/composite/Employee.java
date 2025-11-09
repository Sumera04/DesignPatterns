package com.cs.composite;

//Component Interface
interface Employee {
	void showDetails();

	default void add(Employee e) { 
		throw new UnsupportedOperationException(); 
	}

	default void remove(Employee e) { 
		throw new UnsupportedOperationException(); 
	}
}