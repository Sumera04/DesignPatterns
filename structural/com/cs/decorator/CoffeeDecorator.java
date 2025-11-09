package com.cs.decorator;

//Step 3: Base Decorator — implements the same interface
abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee; // Composition

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
}
