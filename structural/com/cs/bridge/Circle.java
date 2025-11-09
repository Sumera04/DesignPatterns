package com.cs.bridge;

//Refined Abstraction
class Circle extends Shape {
	private double x, y, radius;

	public Circle(double x, double y, double radius, DrawingAPI drawingAPI) {
		super(drawingAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawingAPI.drawCircle(x, y, radius); // Delegation to implementation
	}
}
