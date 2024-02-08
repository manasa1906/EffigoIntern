package com.Intern1906.Spring_Freamework.app;

import com.Intern1906.Spring_Freamework.game.gameRunner;
import com.Intern1906.Spring_Freamework.game.pacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		// var game =new marioGame();
		// var game = new superContraGame();
		var game = new pacmanGame();
		var gameRunner = new gameRunner(game);

		gameRunner.run();
	}

}
