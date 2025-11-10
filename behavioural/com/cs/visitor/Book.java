package com.cs.visitor;

//Step 2: Concrete Elements — implement accept and provide data
class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int price, String isbnNumber) {
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this); // double dispatch
	}
}