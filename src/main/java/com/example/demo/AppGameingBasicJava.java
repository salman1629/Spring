package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContraGame;

public class AppGameingBasicJava {

	public static void main(String[] args) {
		var marioGame = new SuperContraGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
