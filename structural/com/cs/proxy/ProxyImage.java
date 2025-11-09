package com.cs.proxy;

//Step 3: Proxy — controls access to the RealImage
class ProxyImage implements Image {
	private String filename;
	private RealImage realImage; // Composition (holds a reference to real object)

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (realImage == null) {
			// Lazy initialization — load only when needed
			realImage = new RealImage(filename);
		}
		realImage.display();
	}
}