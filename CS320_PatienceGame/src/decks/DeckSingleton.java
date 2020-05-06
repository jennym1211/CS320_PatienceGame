package decks;

import java.util.ArrayList;

import cards.*;
import decks.*;

public class DeckSingleton {
	
	private static DeckSingleton ds = null;
	private PokerDeck deck;

	private DeckSingleton()
	{
		deck = new PokerDeck();
		
	}
	public static DeckSingleton GetDeck() {
		
			if(ds == null)
			{
			  ds = new DeckSingleton();
			}
			return ds;
	}

}
