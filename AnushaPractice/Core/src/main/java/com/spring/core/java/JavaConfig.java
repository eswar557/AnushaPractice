package com.spring.core.java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.core.CDPlayer;
import com.spring.core.Song;

@Configuration
public class JavaConfig {
	@Bean
	public Song jaiHo(){
		Song song = new Song();
		song.setSongName("Jai Ho");
		return song;
	}
	
	@Bean
	@Scope(scopeName="prototype")
	public CDPlayer cdPlayer() {
		CDPlayer cdPlayer =  new CDPlayer();
		cdPlayer.setSong(jaiHo());
		return cdPlayer;
	}
}
