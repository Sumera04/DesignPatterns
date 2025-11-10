package com.cs.iterator;

//Step 4: Concrete Iterator implementing traversal logic
class BookIterator implements Iterator {
	private String[] books;
	private int index = 0;

	public BookIterator(String[] books) {
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return index < books.length; // Check if more elements exist
	}

	@Override
	public Object next() {
		if (this.hasNext())
			return books[index++]; // Return current and move to next
		return null;
	}
}

