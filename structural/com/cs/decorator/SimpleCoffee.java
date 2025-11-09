package com.cs.decorator;

//Step 2: Concrete Component
class SimpleCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

	@Override
	public double getCost() {
		return 50.0;
	}
}
