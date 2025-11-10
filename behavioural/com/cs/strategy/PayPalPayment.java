package com.cs.strategy;

//Step 2: Concrete Strategy Classes implementing the algorithm

//Handles PayPal payment logic
public class PayPalPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using PayPal.");
	}
}