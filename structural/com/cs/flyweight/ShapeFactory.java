package com.cs.flyweight;

//Step 3: Flyweight Factory — manages shared flyweights
import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
	private static final Map<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String outline) {
		Circle circle = (Circle) circleMap.get(outline);
		if (circle == null) {
			circle = new Circle(outline);
			circleMap.put(outline, circle);
			System.out.println("Created new Circle with outline: " + outline);
		}
		return circle;
	}
}
