package decks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public Card deal()
    {
    	try
		{
			if (deck.isEmpty())
				throw new IllegalStateException("Deck is empty");
		} catch (IllegalStateException e)
		{
			System.out.println("Deck is empty!");
		}
		return deck.remove(deck.size() - 1);
		// return deck.pop();
	}


    /**
	 * Arranges the deck's cards in random order.
	 */
	public void shuffle()
		{
			Collections.shuffle(deck);
		}


    @Override
    public ArrayList<Card> createDeck() {
        
		for (int suit = 0; suit < suitsIndeck.length; suit++)
		{
			for (int value = 1; value <= numStandardValue.length; value++)
			{
				deck.add(new PokerCard(numStandardValue[value], suitsIndeck[suit]));
				
				
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