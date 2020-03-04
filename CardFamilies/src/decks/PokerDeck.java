package decks;
import java.util.ArrayList;

import cards.*;

public class PokerDeck extends Deck {

    private ArrayList<Card> deck;
    
    /*
	 * Values of cards
	 */
	protected static final int[] numStandardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 }; // standard
	// number of suits in a deck.

	/*
	 * Array of Suits.
	 */
	protected static final String[] suitsIndeck = { "Hearts", "Clubs", "Diamonds", "Spades" }; // total
    // suits in deck.
    

    public PokerDeck()

	{

		deck = new ArrayList<Card>();

	}


    @Override
    public ArrayList<Card> createTabledeck() {
        
		for (int suit = 0; suit < suitsIndeck.length; suit++)
		{
			for (int value = 1; value <= numStandardValue.length; value++)
			{
				deck.add(new PokerCard(numStandardValue[value], suitsIndeck[suit]));
				
				
			}
		}
		return deck;
    }


   






}