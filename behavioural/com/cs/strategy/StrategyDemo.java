package com.cs.strategy;

//Behavioral Design Pattern
//Real-World Example: Payment system supporting multiple payment methods (Credit Card, PayPal, UPI)
/*
Principles Followed:
- Open/Closed Principle (OCP): New payment types can be added without modifying existing code.
- Single Responsibility Principle (SRP): Each payment strategy handles only one algorithm.
- Dependency Inversion Principle (DIP): The context depends on the PaymentStrategy interface, not concrete classes.
- Composition Over Inheritance: Behavior (strategy) is injected at runtime, not inherited.

Pros of Strategy Pattern:
1. Removes complex conditional logic.
2. Enables switching algorithms dynamically.
3. Makes code easy to extend and maintain.
4. Promotes flexibility and cleaner separation of concerns.

Real-World Analogy:
- Navigation App: You can switch between “fastest”, “shortest”, or “scenic” routes.
- Payment Gateway: Choose between CreditCard, PayPal, or UPI payment methods.
*/

//Step 4: Demo Class — Client selects strategy dynamically
public class StrategyDemo {
	public static void main(String[] args) {
		PaymentContext context = new PaymentContext(new CreditCardPayment()); // Use CreditCard
		context.payBill(2500);

		context.setPaymentStrategy(new PayPalPayment()); // Switch to PayPal
		context.payBill(1800);

		context.setPaymentStrategy(new UPIPayment()); // Switch to UPI
		context.payBill(900);
	}
}


/*Interview Q&A:
Q1: What problem does the Strategy Pattern solve?
A1: It eliminates large conditional logic by allowing selection of an algorithm (behavior) at runtime.

Q2: How does it provide flexibility?
A2: Each algorithm is encapsulated in a separate class and injected dynamically into the context.

Q3: Difference between Strategy and State Pattern?
A3: Strategy is chosen by the client; State changes automatically based on internal conditions.

Q4: How does it follow SOLID principles?
A4: 
- SRP: Each strategy class handles one specific behavior.
- OCP: New strategies can be added without modifying existing ones.
- DIP: Context depends on abstraction, not concrete implementation.

Q5: When should you use it?
A5: When multiple algorithms can achieve the same goal (e.g., payment modes, sorting methods, compression algorithms).

Q6: Common disadvantage?
A6: Increases number of small classes and requires the client to know available strategies.
*/

