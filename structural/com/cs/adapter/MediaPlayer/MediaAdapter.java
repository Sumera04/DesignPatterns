package com.cs.adapter.MediaPlayer;

//Adapter: converts the interface of AdvancedMediaPlayer to MediaPlayer
class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedPlayer;

	public MediaAdapter(String type) {
		if(type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
			advancedPlayer = new AdvancedMediaPlayer();
		}
	}

	@Override
	public void play(String filename) {
		if(filename.endsWith(".vlc")) {
			advancedPlayer.playVlc(filename);
		} else if(filename.endsWith(".mp4")) {
			advancedPlayer.playMp4(filename);
		}
	}
}