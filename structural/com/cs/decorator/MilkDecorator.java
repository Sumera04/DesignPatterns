package com.cs.decorator;

//Step 4: Concrete Decorators — add new behavior
class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return super.getCost() + 10.0;
	}
}