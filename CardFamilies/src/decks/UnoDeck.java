package decks;
import java.util.ArrayList;

import cards.*;

public class UnoDeck extends Deck {

    private ArrayList<Card> unoDeck;
    
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

		unoDeck = new ArrayList<Card>();

	}

    @Override
    public ArrayList<Card> createTabledeck() {
        
		for (int suit = 0; suit < suitsIndeck.length; suit++)
		{
			for (int value = 1; value <= numStandardValue.length; value++)
			{
                unoDeck.add(new UnoCard(0, "Red"));
                unoDeck.add(new UnoCard(1, "Red"));
                unoDeck.add(new UnoCard(1, "Red"));
                unoDeck.add(new UnoCard(2, "Red"));
                unoDeck.add(new UnoCard(2, "Red"));
                unoDeck.add(new UnoCard(3, "Red"));
                unoDeck.add(new UnoCard(3, "Red"));
                unoDeck.add(new UnoCard(4, "Red"));
                unoDeck.add(new UnoCard(4, "Red"));
                unoDeck.add(new UnoCard(5, "Red"));
                unoDeck.add(new UnoCard(5, "Red"));
                unoDeck.add(new UnoCard(6, "Red"));
                unoDeck.add(new UnoCard(6, "Red"));
                unoDeck.add(new UnoCard(7, "Red"));
                unoDeck.add(new UnoCard(7, "Red"));
                unoDeck.add(new UnoCard(8, "Red"));
                unoDeck.add(new UnoCard(8, "Red"));
                unoDeck.add(new UnoCard(9, "Red"));
                unoDeck.add(new UnoCard(9, "Red"));
                unoDeck.add(new UnoCard(10, "Red"));
                unoDeck.add(new UnoCard(10, "Red"));
                unoDeck.add(new UnoCard(11, "Red"));
                unoDeck.add(new UnoCard(11, "Red"));
                unoDeck.add(new UnoCard(12, "Red"));
                unoDeck.add(new UnoCard(12, "Red"));
         

                unoDeck.add(new UnoCard(0, "Green"));
                unoDeck.add(new UnoCard(1, "Green"));
                unoDeck.add(new UnoCard(1, "Green"));
                unoDeck.add(new UnoCard(2, "Green"));
                unoDeck.add(new UnoCard(2, "Green"));
                unoDeck.add(new UnoCard(3, "Green"));
                unoDeck.add(new UnoCard(3, "Green"));
                unoDeck.add(new UnoCard(4, "Green"));
                unoDeck.add(new UnoCard(4, "Green"));
                unoDeck.add(new UnoCard(5, "Green"));
                unoDeck.add(new UnoCard(5, "Green"));
                unoDeck.add(new UnoCard(6, "Green"));
                unoDeck.add(new UnoCard(6, "Green"));
                unoDeck.add(new UnoCard(7, "Green"));
                unoDeck.add(new UnoCard(7, "Green"));
                unoDeck.add(new UnoCard(8, "Green"));
                unoDeck.add(new UnoCard(8, "Green"));
                unoDeck.add(new UnoCard(9, "Green"));
                unoDeck.add(new UnoCard(9, "Green"));
                unoDeck.add(new UnoCard(10, "Green"));
                unoDeck.add(new UnoCard(10, "Green"));
                unoDeck.add(new UnoCard(11, "Green"));
                unoDeck.add(new UnoCard(11, "Green"));
                unoDeck.add(new UnoCard(12, "Green"));
                unoDeck.add(new UnoCard(12, "Green"));
                unoDeck.add(new UnoCard(13, "Green"));
                unoDeck.add(new UnoCard(13, "Green"));
                unoDeck.add(new UnoCard(13, "Green"));
                unoDeck.add(new UnoCard(13, "Green"));
                

                unoDeck.add(new UnoCard(0, "Yellow"));
                unoDeck.add(new UnoCard(1, "Yellow"));
                unoDeck.add(new UnoCard(1, "Yellow"));
                unoDeck.add(new UnoCard(2, "Yellow"));
                unoDeck.add(new UnoCard(2, "Yellow"));
                unoDeck.add(new UnoCard(3, "Yellow"));
                unoDeck.add(new UnoCard(3, "Yellow"));
                unoDeck.add(new UnoCard(4, "Yellow"));
                unoDeck.add(new UnoCard(4, "Yellow"));
                unoDeck.add(new UnoCard(5, "Yellow"));
                unoDeck.add(new UnoCard(5, "Yellow"));
                unoDeck.add(new UnoCard(6, "Yellow"));
                unoDeck.add(new UnoCard(6, "Yellow"));
                unoDeck.add(new UnoCard(7, "Yellow"));
                unoDeck.add(new UnoCard(7, "Yellow"));
                unoDeck.add(new UnoCard(8, "Yellow"));
                unoDeck.add(new UnoCard(8, "Yellow"));
                unoDeck.add(new UnoCard(9, "Yellow"));
                unoDeck.add(new UnoCard(9, "Yellow"));
                unoDeck.add(new UnoCard(10, "Yellow"));
                unoDeck.add(new UnoCard(10, "Yellow"));
                unoDeck.add(new UnoCard(11, "Yellow"));
                unoDeck.add(new UnoCard(11, "Yellow"));
                unoDeck.add(new UnoCard(12, "Yellow"));
                unoDeck.add(new UnoCard(12, "Yellow"));
                

                unoDeck.add(new UnoCard(0, "Blue"));
                unoDeck.add(new UnoCard(1, "Blue"));
                unoDeck.add(new UnoCard(1, "Blue"));
                unoDeck.add(new UnoCard(2, "Blue"));
                unoDeck.add(new UnoCard(2, "Blue"));
                unoDeck.add(new UnoCard(3, "Blue"));
                unoDeck.add(new UnoCard(3, "Blue"));
                unoDeck.add(new UnoCard(4, "Blue"));
                unoDeck.add(new UnoCard(4, "Blue"));
                unoDeck.add(new UnoCard(5, "Blue"));
                unoDeck.add(new UnoCard(5, "Blue"));
                unoDeck.add(new UnoCard(6, "Blue"));
                unoDeck.add(new UnoCard(6, "Blue"));
                unoDeck.add(new UnoCard(7, "Blue"));
                unoDeck.add(new UnoCard(7, "Blue"));
                unoDeck.add(new UnoCard(8, "Blue"));
                unoDeck.add(new UnoCard(8, "Blue"));
                unoDeck.add(new UnoCard(9, "Blue"));
                unoDeck.add(new UnoCard(9, "Blue"));
                unoDeck.add(new UnoCard(10, "Blue"));
                unoDeck.add(new UnoCard(10, "Blue"));
                unoDeck.add(new UnoCard(11, "Blue"));
                unoDeck.add(new UnoCard(11, "Blue"));
                unoDeck.add(new UnoCard(12, "Blue"));
                unoDeck.add(new UnoCard(12, "Blue"));

                unoDeck.add(new UnoCard(13, "Black"));
                unoDeck.add(new UnoCard(13, "Black"));
                unoDeck.add(new UnoCard(13, "Black"));
                unoDeck.add(new UnoCard(13, "Black"));
                unoDeck.add(new UnoCard(14, "Black"));
                unoDeck.add(new UnoCard(14, "Black"));
                unoDeck.add(new UnoCard(14, "Black"));
                unoDeck.add(new UnoCard(14, "Black"));
             
              
			}
		}
		return unoDeck;
    }


    public String toString()
	{
		/*
		 * Uses stringbuilder to format the arraylist of the deck more neatly.
		 */
		StringBuilder sb = new StringBuilder("\n");

		for (int i = 0; i < unoDeck.size(); i++)
		{

			sb.append(unoDeck.get(i)).append(" ");
			if (i % 6 == 0)
			{

				sb.append(unoDeck.get(i)).append("\n");
			}
		}

		return sb.toString();

    }
}