package decks;

import java.util.ArrayList;

import cards.*;
import decks.*;

public class DeckSingleton {
	
	
	private static Deck deck;

	
	public static Deck GetDeck() {
		
			if(deck == null)
			{
				deck = new PokerDeck();
			}
			return deck;
	}

}
