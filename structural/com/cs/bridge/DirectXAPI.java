package com.cs.bridge;

//Concrete Implementor B
class DirectXAPI implements DrawingAPI {
	public void drawCircle(double x, double y, double radius) {
		System.out.println("Drawing Circle using DirectX at (" + x + ", " + y + ") radius " + radius);
	}
}
