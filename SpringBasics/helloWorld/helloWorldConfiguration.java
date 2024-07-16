package com.Intern1906.Spring_Freamework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // declares one or more bean methods
//Verbosity is eliminated
record person(String name, int age, address address) {
};// Record is introduced in JDK 16

record address(String city, String state) {
};

public class helloWorldConfiguration {
	@Bean // Produces the beans managed by Spring container
	public String name() {
		return "Manasa";
	}

	@Bean
	public int age() {
		return 19;
	}

	@Bean
	public person person() {
		return new person("Moksha", 23, new address("Kurnool", "AndhraPradesh")); // toString method gets implemented
																					// directly
	}

	@Bean
	public person person2MethodCall() {
		return new person(name(), age(), address()); // toString method gets implemented directly
	}

	@Bean
	public person person3parameters(String name, int age, address address3) {
		return new person(name, age, address3); // toString method gets implemented directly
	}

	@Bean
	public person person4parameters(String name, int age, @Qualifier("address2qualifier") address address) {
		return new person(name, age, address); // toString method gets implemented directly
	}

	@Bean(name = "address2")
	@Qualifier("address2qualifier")
	public address address() {
		return new address("Bangalore", "Karnataka");
	}

	@Bean
	@Primary
	public address address3() {
		return new address("Vajarahalli", "Karnataka");
	}
}
