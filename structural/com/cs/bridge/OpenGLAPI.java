package com.cs.bridge;

//Concrete Implementor A
class OpenGLAPI implements DrawingAPI {
	public void drawCircle(double x, double y, double radius) {
		System.out.println("Drawing Circle using OpenGL at (" + x + ", " + y + ") radius " + radius);
	}
}
