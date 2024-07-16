package com.Intern1906.Spring_Freamework.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Intern1906.Spring_Freamework.game.gameRunner;
import com.Intern1906.Spring_Freamework.game.gamingConsole;

public class App03GamingGamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(gamingConfiguration.class)) {

			context.getBean(gamingConsole.class).up();
			context.getBean(gameRunner.class).run();
		}

	}
}