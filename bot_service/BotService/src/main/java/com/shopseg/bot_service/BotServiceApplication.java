package com.shopseg.bot_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shopseg.bot_service.initialize.StartBot;

@SpringBootApplication
public class BotServiceApplication {

	public static void main(String[] args) {		
		SpringApplication.run(BotServiceApplication.class, args);		 
		StartBot.run();
	}
}
