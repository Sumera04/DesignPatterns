package com.cs.flyweight;

//Step 2: Concrete Flyweight — stores intrinsic state (shared data)
class Circle implements Shape {
	private final String shapeType = "Circle"; // Intrinsic state (shared)
	private String outline; // Intrinsic data

	public Circle(String outline) {
		this.outline = outline;
	}

	@Override
	public void draw(int x, int y, String color) {
		// Extrinsic state: position and color (not stored in the object)
		System.out.println("Drawing " + shapeType + " with " + outline +
				" outline at (" + x + "," + y + ") with color " + color);
	}
}
