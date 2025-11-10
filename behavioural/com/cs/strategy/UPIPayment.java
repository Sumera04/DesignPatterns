package com.cs.strategy;

//Step 2: Concrete Strategy Classes implementing the algorithm

//Handles UPI payment logic
public class UPIPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using UPI.");
	}
}
