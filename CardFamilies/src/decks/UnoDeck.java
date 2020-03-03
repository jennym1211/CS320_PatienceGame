package CardFamilies.src.decks;
import java.util.ArrayList;

import CardFamilies.src.cards.*;

public class UnoDeck extends Deck {

    private ArrayList<Card> deck;
    
    /*
	 * Values of cards
	 */
	protected static final int[] numStandardValue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; // standard
	// number of suits in a deck.

	/*
	 * Array of Suits.
	 */
	protected static final String[] suitsIndeck = { "Red","Green","Yellow","Blue","Black"}; // total
    // suits in deck.
    
    public UnoDeck()

	{

		deck = new ArrayList<Card>();

	}

    @Override
    public ArrayList<Card> createTabledeck() {
        
		for (int suit = 0; suit < suitsIndeck.length; suit++)
		{
			for (int value = 1; value <= numStandardValue.length; value++)
			{
                deck.add(new UnoCard(0, "Red"));
                deck.add(new UnoCard(1, "Red"));
                deck.add(new UnoCard(1, "Red"));
                deck.add(new UnoCard(2, "Red"));
                deck.add(new UnoCard(2, "Red"));
                deck.add(new UnoCard(3, "Red"));
                deck.add(new UnoCard(3, "Red"));
                deck.add(new UnoCard(4, "Red"));
                deck.add(new UnoCard(4, "Red"));
                deck.add(new UnoCard(5, "Red"));
                deck.add(new UnoCard(5, "Red"));
                deck.add(new UnoCard(6, "Red"));
                deck.add(new UnoCard(6, "Red"));
                deck.add(new UnoCard(7, "Red"));
                deck.add(new UnoCard(7, "Red"));
                deck.add(new UnoCard(8, "Red"));
                deck.add(new UnoCard(8, "Red"));
                deck.add(new UnoCard(9, "Red"));
                deck.add(new UnoCard(9, "Red"));
                deck.add(new UnoCard(10, "Red"));
                deck.add(new UnoCard(10, "Red"));
                deck.add(new UnoCard(11, "Red"));
                deck.add(new UnoCard(11, "Red"));
                deck.add(new UnoCard(12, "Red"));
                deck.add(new UnoCard(12, "Red"));
         

                deck.add(new UnoCard(0, "Green"));
                deck.add(new UnoCard(1, "Green"));
                deck.add(new UnoCard(1, "Green"));
                deck.add(new UnoCard(2, "Green"));
                deck.add(new UnoCard(2, "Green"));
                deck.add(new UnoCard(3, "Green"));
                deck.add(new UnoCard(3, "Green"));
                deck.add(new UnoCard(4, "Green"));
                deck.add(new UnoCard(4, "Green"));
                deck.add(new UnoCard(5, "Green"));
                deck.add(new UnoCard(5, "Green"));
                deck.add(new UnoCard(6, "Green"));
                deck.add(new UnoCard(6, "Green"));
                deck.add(new UnoCard(7, "Green"));
                deck.add(new UnoCard(7, "Green"));
                deck.add(new UnoCard(8, "Green"));
                deck.add(new UnoCard(8, "Green"));
                deck.add(new UnoCard(9, "Green"));
                deck.add(new UnoCard(9, "Green"));
                deck.add(new UnoCard(10, "Green"));
                deck.add(new UnoCard(10, "Green"));
                deck.add(new UnoCard(11, "Green"));
                deck.add(new UnoCard(11, "Green"));
                deck.add(new UnoCard(12, "Green"));
                deck.add(new UnoCard(12, "Green"));
                deck.add(new UnoCard(13, "Green"));
                deck.add(new UnoCard(13, "Green"));
                deck.add(new UnoCard(13, "Green"));
                deck.add(new UnoCard(13, "Green"));
                

                deck.add(new UnoCard(0, "Yellow"));
                deck.add(new UnoCard(1, "Yellow"));
                deck.add(new UnoCard(1, "Yellow"));
                deck.add(new UnoCard(2, "Yellow"));
                deck.add(new UnoCard(2, "Yellow"));
                deck.add(new UnoCard(3, "Yellow"));
                deck.add(new UnoCard(3, "Yellow"));
                deck.add(new UnoCard(4, "Yellow"));
                deck.add(new UnoCard(4, "Yellow"));
                deck.add(new UnoCard(5, "Yellow"));
                deck.add(new UnoCard(5, "Yellow"));
                deck.add(new UnoCard(6, "Yellow"));
                deck.add(new UnoCard(6, "Yellow"));
                deck.add(new UnoCard(7, "Yellow"));
                deck.add(new UnoCard(7, "Yellow"));
                deck.add(new UnoCard(8, "Yellow"));
                deck.add(new UnoCard(8, "Yellow"));
                deck.add(new UnoCard(9, "Yellow"));
                deck.add(new UnoCard(9, "Yellow"));
                deck.add(new UnoCard(10, "Yellow"));
                deck.add(new UnoCard(10, "Yellow"));
                deck.add(new UnoCard(11, "Yellow"));
                deck.add(new UnoCard(11, "Yellow"));
                deck.add(new UnoCard(12, "Yellow"));
                deck.add(new UnoCard(12, "Yellow"));
                

                deck.add(new UnoCard(0, "Blue"));
                deck.add(new UnoCard(1, "Blue"));
                deck.add(new UnoCard(1, "Blue"));
                deck.add(new UnoCard(2, "Blue"));
                deck.add(new UnoCard(2, "Blue"));
                deck.add(new UnoCard(3, "Blue"));
                deck.add(new UnoCard(3, "Blue"));
                deck.add(new UnoCard(4, "Blue"));
                deck.add(new UnoCard(4, "Blue"));
                deck.add(new UnoCard(5, "Blue"));
                deck.add(new UnoCard(5, "Blue"));
                deck.add(new UnoCard(6, "Blue"));
                deck.add(new UnoCard(6, "Blue"));
                deck.add(new UnoCard(7, "Blue"));
                deck.add(new UnoCard(7, "Blue"));
                deck.add(new UnoCard(8, "Blue"));
                deck.add(new UnoCard(8, "Blue"));
                deck.add(new UnoCard(9, "Blue"));
                deck.add(new UnoCard(9, "Blue"));
                deck.add(new UnoCard(10, "Blue"));
                deck.add(new UnoCard(10, "Blue"));
                deck.add(new UnoCard(11, "Blue"));
                deck.add(new UnoCard(11, "Blue"));
                deck.add(new UnoCard(12, "Blue"));
                deck.add(new UnoCard(12, "Blue"));

                deck.add(new UnoCard(13, "Black"));
                deck.add(new UnoCard(13, "Black"));
                deck.add(new UnoCard(13, "Black"));
                deck.add(new UnoCard(13, "Black"));
                deck.add(new UnoCard(14, "Black"));
                deck.add(new UnoCard(14, "Black"));
                deck.add(new UnoCard(14, "Black"));
                deck.add(new UnoCard(14, "Black"));
             
              
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