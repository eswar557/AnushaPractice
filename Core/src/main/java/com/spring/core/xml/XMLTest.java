package com.spring.core.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.CDPlayer;

public class XMLTest {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		CDPlayer player = context.getBean(CDPlayer.class);
		player.play();
	}
}