package com.cs.iterator;

//Step 3: Concrete Collection implementing data storage and iterator creation
class BookCollection implements Collection {
	private String[] books = { "Design Patterns", "Clean Code", "Effective Java", "Refactoring" };

	@Override
	public Iterator createIterator() {
		return new BookIterator(books); // Returns a concrete iterator
	}
}