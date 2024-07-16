package com.Intern1906.Spring_Freamework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02helloWorldSpring {

	public static void main(String[] args) {
		// We do launching the SpringContext
		// then Configuring the things using some other class
		try (var context = new AnnotationConfigApplicationContext(helloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3parameters"));
			System.out.println(context.getBean("person4parameters"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(address.class));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		;

	}

}
