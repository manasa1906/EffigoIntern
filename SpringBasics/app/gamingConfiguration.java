package com.Intern1906.Spring_Freamework.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Intern1906.Spring_Freamework.game.gameRunner;
import com.Intern1906.Spring_Freamework.game.gamingConsole;
import com.Intern1906.Spring_Freamework.game.pacmanGame;

@Configuration
public class gamingConfiguration {
	@Bean
	public gamingConsole game() {
		var game = new pacmanGame();
		return game;
	}

	@Bean
	public gameRunner gameRunner(gamingConsole game) {
		var gameRunner = new gameRunner(game);
		return gameRunner;
	}

}
