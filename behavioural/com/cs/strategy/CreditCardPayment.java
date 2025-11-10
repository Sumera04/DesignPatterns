package com.cs.strategy;

//Step 2: Concrete Strategy Classes implementing the algorithm

//Handles Credit Card payment logic
public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using Credit Card.");
	}
}
