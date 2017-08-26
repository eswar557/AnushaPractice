package com.spring.core.java;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages={"com.spring"})
@ImportResource({"config.xml"})
public class JavaConfig {
	// EMPTY
}
