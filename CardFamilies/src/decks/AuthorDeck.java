package decks;
import java.util.ArrayList;

import cards.*;

public class AuthorDeck extends Deck {

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
    

    protected static final String[] authorsInDeck = {"Louisa May Alcott", "James Fenimore Cooper","Charles Dickens", "Nathaniel Hawthorne", "Washington Irving","Henry Wadsworth Longfellow", "Sir Walter Scott","William Shakespeare","Robert Louis Stevenson","Alfred, Lord Tennyson", "Mark Twain"};

    @Override
    public ArrayList<Card> createTabledeck() {
        
		for (int suit = 0; suit < suitsIndeck.length; suit++)
		{
			for (int value = 1; value <= numStandardValue.length; value++)
			{
				deck.add(new AuthorCard(1, "Hearts"));
				deck.add(new AuthorCard(2, "Hearts"));
				deck.add(new AuthorCard(3, "Hearts"));
				deck.add(new AuthorCard(4, "Hearts"));
				deck.add(new AuthorCard(5, "Hearts"));
				deck.add(new AuthorCard(6, "Hearts"));
				deck.add(new AuthorCard(7, "Hearts"));
				deck.add(new AuthorCard(8, "Hearts"));
				deck.add(new AuthorCard(9, "Hearts"));
				deck.add(new AuthorCard(10, "Hearts"));
				deck.add(new AuthorCard(11, "Hearts"));
				deck.add(new AuthorCard(12, "Hearts"));
				deck.add(new AuthorCard(13, "Hearts"));
				deck.add(new AuthorCard(14, "Hearts"));

				deck.add(new AuthorCard(1, "Spades"));
				deck.add(new AuthorCard(2, "Spades"));
				deck.add(new AuthorCard(3, "Spades"));
				deck.add(new AuthorCard(4, "Spades"));
				deck.add(new AuthorCard(5, "Spades"));
				deck.add(new AuthorCard(6, "Spades"));
				deck.add(new AuthorCard(7, "Spades"));
				deck.add(new AuthorCard(8, "Spades"));
				deck.add(new AuthorCard(9, "Spades"));
				deck.add(new AuthorCard(10, "Spades"));
				deck.add(new AuthorCard(11, "Spades"));
				deck.add(new AuthorCard(12, "Spades"));
				deck.add(new AuthorCard(13, "Spades"));
				deck.add(new AuthorCard(14, "Spades"));

				deck.add(new AuthorCard(1, "Clubs"));
				deck.add(new AuthorCard(2, "Clubs"));
				deck.add(new AuthorCard(3, "Clubs"));
				deck.add(new AuthorCard(4, "Clubs"));
				deck.add(new AuthorCard(5, "Clubs"));
				deck.add(new AuthorCard(6, "Clubs"));
				deck.add(new AuthorCard(7, "Clubs"));
				deck.add(new AuthorCard(8, "Clubs"));
				deck.add(new AuthorCard(9, "Clubs"));
				deck.add(new AuthorCard(10, "Clubs"));
				deck.add(new AuthorCard(11, "Clubs"));
				deck.add(new AuthorCard(12, "Clubs"));
				deck.add(new AuthorCard(13, "Clubs"));
				deck.add(new AuthorCard(14, "Clubs"));

				deck.add(new AuthorCard(1, "Diamonds"));
				deck.add(new AuthorCard(2, "Diamonds"));
				deck.add(new AuthorCard(3, "Diamonds"));
				deck.add(new AuthorCard(4, "Diamonds"));
				deck.add(new AuthorCard(5, "Diamonds"));
				deck.add(new AuthorCard(6, "Diamonds"));
				deck.add(new AuthorCard(7, "Diamonds"));
				deck.add(new AuthorCard(8, "Diamonds"));
				deck.add(new AuthorCard(9, "Diamonds"));
				deck.add(new AuthorCard(10, "Diamonds"));
				deck.add(new AuthorCard(11, "Diamonds"));
				deck.add(new AuthorCard(12, "Diamonds"));
				deck.add(new AuthorCard(13, "Diamonds"));
				deck.add(new AuthorCard(14, "Diamonds"));
			}
		}
		return deck;
    }









}