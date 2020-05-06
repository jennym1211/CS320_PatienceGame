package game;

import java.util.Scanner;

import decks.PokerDeck;

public class Main {

	public static void main(String[] args) {

		GameController gc = new GameController();
		gc.table.CreateGame();

		while (gc.GameWon() == false) {

			gc.play();

		}

	}

}
