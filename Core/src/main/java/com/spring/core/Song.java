package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("song1")
public class Song{
	@Value("#{'Jai ho'}")
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
