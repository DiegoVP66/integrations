package com.dvpdev.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dvpdev.integrations.services.EmailService;
import com.dvpdev.integrations.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Bean
	public EmailService emailServicce() {
		return new MockEmailService();
	}

}
