package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class Song{
	private String songName;
	public String getSongName() {
		return this.songName;
	}
	public void setSongName(String songName) {
		this.songName =  songName;
		System.out.println("Actual method");
		//throw new IllegalArgumentException();
	}
	@Override
	public String toString() {
		return "Song[name:"+ songName +"]";
	}
}
