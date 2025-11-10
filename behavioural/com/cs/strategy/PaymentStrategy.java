package com.cs.strategy;

//Step 1: Define the Strategy Interface
public interface PaymentStrategy {
	void pay(int amount); // Common behavior for all payment types
}
