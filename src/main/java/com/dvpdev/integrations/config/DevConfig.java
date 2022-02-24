package com.dvpdev.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dvpdev.integrations.services.EmailService;
import com.dvpdev.integrations.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Bean
	public EmailService emailServicce() {
		return new SendGridEmailService();
	}

}
