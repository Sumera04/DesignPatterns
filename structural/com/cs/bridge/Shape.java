package com.cs.bridge;

//Abstraction
public abstract class Shape {
	protected DrawingAPI drawingAPI;  // Composition link to implementation

	protected Shape(DrawingAPI drawingAPI) {
		this.drawingAPI = drawingAPI;
	}

	public abstract void draw();
}