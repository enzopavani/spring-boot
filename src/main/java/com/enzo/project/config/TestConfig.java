package com.enzo.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.enzo.project.entities.User;
import com.enzo.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@email.com", "988888888", "1234");
		User u2 = new User(null, "Alex Green", "alex@email.com", "977553311", "707");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
