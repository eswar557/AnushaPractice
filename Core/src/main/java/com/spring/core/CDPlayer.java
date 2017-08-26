package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	@Autowired
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CDPlayer[song:"+ (song == null ? "" : song.getSongName()) +"]";
	}
}