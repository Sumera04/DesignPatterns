package com.cs.adapter.MediaPlayer;

//Client: uses the Target interface
class AudioPlayer implements MediaPlayer {
	private MediaAdapter adapter;

	@Override
	public void play(String filename) {
		if(filename.endsWith(".mp3")) {
			System.out.println("Playing MP3 file: " + filename);
		} else if(filename.endsWith(".mp4") || filename.endsWith(".vlc")) {
			adapter = new MediaAdapter(filename.substring(filename.lastIndexOf(".")+1));
			adapter.play(filename);
		} else {
			System.out.println("Invalid media format: " + filename);
		}
	}
}
