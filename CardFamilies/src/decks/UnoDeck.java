package decks;
import java.util.ArrayList;

import cards.*;

public class UnoDeck extends Deck {

    private ArrayList<Card> unoDeck;
    
    /*
	 * Values of cards
	 */
	protected static final int[] ranksInDeck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // standard
	// number of suits in a deck.
	protected static final int[] wildRanks = { 13, 14};

	/*
	 * Array of Suits.
	 */
	protected static final String[] suitsIndeck = { "Red","Green","Yellow","Blue"}; // total
    // suits in deck.
	
	protected static final String[] wildSuits = {"Black"};
    
    public UnoDeck()

	{
		unoDeck = new ArrayList<Card>();
	}

    @Override
    public ArrayList<Card> createTabledeck() {
        
    	//Adding regular Uno Cards
		for (int suit = 0; suit < suitsIndeck.length; suit++)
		{
			for (int rank = 1; rank <= ranksInDeck.length; rank++)
			{
               unoDeck.add(new UnoCard(ranksInDeck[rank], suitsIndeck[suit]));
 
			}
		}
		
		//Adding Wild Cards
		for (int suit = 0; suit < wildSuits.length; suit++)
		{
			for (int rank = 1; rank <= wildRanks.length; rank++)
			{
               unoDeck.add(new UnoCard(wildRanks[rank], wildSuits[suit]));
 
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