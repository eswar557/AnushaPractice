package com.spring.core.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.CDPlayer;
import com.spring.core.Song;

public class JavaTest {
public static void main(String[] args) {
	ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
	
	Song song =  context.getBean(Song.class);
	song.setSongName("Jai ho");
	
}
}
