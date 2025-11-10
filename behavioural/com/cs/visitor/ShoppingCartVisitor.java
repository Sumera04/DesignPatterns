package com.cs.visitor;

//Step 3: Visitor interface — declares visit methods for each element type
interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
