package com.chatting.sayung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan
@Configuration
@SpringBootApplication
public class SayungApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayungApplication.class, args);
	}

	@Bean
	public InternalResourceViewResolver setupViewResolver(){

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
