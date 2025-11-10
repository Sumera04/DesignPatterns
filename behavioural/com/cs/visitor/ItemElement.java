package com.cs.visitor;

//Step 1: Element interface — defines accept(Visitor)
interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}