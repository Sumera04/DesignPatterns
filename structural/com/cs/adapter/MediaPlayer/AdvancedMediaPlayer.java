package com.cs.adapter.MediaPlayer;

//Adaptee: existing incompatible interface
class AdvancedMediaPlayer {
	public void playVlc(String filename) {
		System.out.println("Playing VLC file: " + filename);
	}

	public void playMp4(String filename) {
		System.out.println("Playing MP4 file: " + filename);
	}
}