package com.spring.core.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.CDPlayer;

public class JavaTest {
public static void main(String[] args) {
	ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
	CDPlayer player = context.getBean(CDPlayer.class);
	player.play();
}
}
