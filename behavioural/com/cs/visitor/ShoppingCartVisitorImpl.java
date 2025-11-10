package com.cs.visitor;

//Step 4: Concrete Visitor — implements operations for each element
class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = book.getPrice();
		if (cost > 50) {
			cost -= 5; // discount for expensive books
		}
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost = " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}
}
