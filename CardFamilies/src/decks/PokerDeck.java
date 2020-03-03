package CardFamilies.src.decks;
import java.util.ArrayList;

import CardFamilies.src.cards.*;

public class PokerDeck extends Deck {

    private ArrayList<Card> deck;
    
    /*
	 * Values of cards
	 */
	protected static final int[] numStandardValue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 }; // standard
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
				deck.add(new PokerCard(1, "Hearts"));
				deck.add(new PokerCard(2, "Hearts"));
				deck.add(new PokerCard(3, "Hearts"));
				deck.add(new PokerCard(4, "Hearts"));
				deck.add(new PokerCard(5, "Hearts"));
				deck.add(new PokerCard(6, "Hearts"));
				deck.add(new PokerCard(7, "Hearts"));
				deck.add(new PokerCard(8, "Hearts"));
				deck.add(new PokerCard(9, "Hearts"));
				deck.add(new PokerCard(10, "Hearts"));
				deck.add(new PokerCard(11, "Hearts"));
				deck.add(new PokerCard(12, "Hearts"));
				deck.add(new PokerCard(13, "Hearts"));
				deck.add(new PokerCard(14, "Hearts"));

				deck.add(new PokerCard(1, "Spades"));
				deck.add(new PokerCard(2, "Spades"));
				deck.add(new PokerCard(3, "Spades"));
				deck.add(new PokerCard(4, "Spades"));
				deck.add(new PokerCard(5, "Spades"));
				deck.add(new PokerCard(6, "Spades"));
				deck.add(new PokerCard(7, "Spades"));
				deck.add(new PokerCard(8, "Spades"));
				deck.add(new PokerCard(9, "Spades"));
				deck.add(new PokerCard(10, "Spades"));
				deck.add(new PokerCard(11, "Spades"));
				deck.add(new PokerCard(12, "Spades"));
				deck.add(new PokerCard(13, "Spades"));
				deck.add(new PokerCard(14, "Spades"));

				deck.add(new PokerCard(1, "Clubs"));
				deck.add(new PokerCard(2, "Clubs"));
				deck.add(new PokerCard(3, "Clubs"));
				deck.add(new PokerCard(4, "Clubs"));
				deck.add(new PokerCard(5, "Clubs"));
				deck.add(new PokerCard(6, "Clubs"));
				deck.add(new PokerCard(7, "Clubs"));
				deck.add(new PokerCard(8, "Clubs"));
				deck.add(new PokerCard(9, "Clubs"));
				deck.add(new PokerCard(10, "Clubs"));
				deck.add(new PokerCard(11, "Clubs"));
				deck.add(new PokerCard(12, "Clubs"));
				deck.add(new PokerCard(13, "Clubs"));
				deck.add(new PokerCard(14, "Clubs"));

				deck.add(new PokerCard(1, "Diamonds"));
				deck.add(new PokerCard(2, "Diamonds"));
				deck.add(new PokerCard(3, "Diamonds"));
				deck.add(new PokerCard(4, "Diamonds"));
				deck.add(new PokerCard(5, "Diamonds"));
				deck.add(new PokerCard(6, "Diamonds"));
				deck.add(new PokerCard(7, "Diamonds"));
				deck.add(new PokerCard(8, "Diamonds"));
				deck.add(new PokerCard(9, "Diamonds"));
				deck.add(new PokerCard(10, "Diamonds"));
				deck.add(new PokerCard(11, "Diamonds"));
				deck.add(new PokerCard(12, "Diamonds"));
				deck.add(new PokerCard(13, "Diamonds"));
				deck.add(new PokerCard(14, "Diamonds"));
			}
		}
		return deck;
    }


    public String toString()
	{
		/*
		 * Uses stringbuilder to format the arraylist of the deck more neatly.
		 */
		StringBuilder sb = new StringBuilder("\n");

		for (int i = 0; i < deck.size(); i++)
		{

			sb.append(deck.get(i)).append(" ");
			if (i % 6 == 0)
			{

				sb.append(deck.get(i)).append("\n");
			}
		}

		return sb.toString();

    }






}