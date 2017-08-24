package com.spring.core;

public class CDPlayer {
	private Song song;

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	public void play() {
		System.out.println("Playing " + this.song.getSongName() + "...");
	}
}
