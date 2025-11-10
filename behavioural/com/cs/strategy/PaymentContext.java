package com.cs.strategy;

//Step 3: Context Class — uses the Strategy
public class PaymentContext {
	private PaymentStrategy strategy; // Holds the reference to current strategy

	// Inject strategy through constructor
	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	// Allow changing strategy at runtime
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	// Delegate payment to selected strategy
	public void payBill(int amount) {
		strategy.pay(amount);
	}
}
