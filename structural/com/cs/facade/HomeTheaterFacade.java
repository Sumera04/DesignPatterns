package com.cs.facade;

//Step 2: Facade Class
class HomeTheaterFacade {
	private DVDPlayer dvd;
	private Projector projector;
	private Amplifier amp;
	private Lights lights;

	public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Amplifier amp, Lights lights) {
		this.dvd = dvd;
		this.projector = projector;
		this.amp = amp;
		this.lights = lights;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		lights.dim(30);
		projector.on();
		projector.setInput(dvd);
		amp.on();
		amp.setVolume(8);
		dvd.on();
		dvd.play(movie);
		System.out.println("Movie started!\n");
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		dvd.stop();
		dvd.off();
		amp.off();
		projector.off();
		lights.on();
		System.out.println("Movie theater shut down.\n");
	}
}
