package decks;

import java.util.ArrayList;
import java.util.Collections;
import piles.*;
import cards.*;

/**
 * This class represents a physical deck of playing cards, and holds the
 * functions as such. This collection of cards will be used to lay out the
 * tableau columns and stock pile, since these two objects contain the cards
 * from this object.
 * 
 * @author Jennifer Mackey
 */

public abstract class Deck {
	protected ArrayList<Card> deck;

	/**
	 * Creates a new deck with 52 cards in sorted order.
	 */
	public Deck() {
		this.deck = new ArrayList<Card>();

	}

	/**
	 * Adds a card to the top of the object.
	 * 
	 * @param c - the card to be added.
	 */
	public void add(Card c)

	{
		deck.add(c);
	}

	/**
	 * Returns the card at the top of the stack.
	 * 
	 * @return - a card object
	 */
	public Card get()

	{
		return deck.get(0);

	}

	/**
	 * Randomizes the order of cards in the deck object.
	 */
	public void shuffle() {

		Collections.shuffle(deck);

	}

	/**
	 * Returns the size of the deck.
	 * 
	 * @return - the size of the deck
	 */
	public int size()

	{

		return deck.size();
	}

	/**
	 * Checks to see if the deck is empty.
	 * 
	 * @return true if the deck is empty
	 */

	public boolean isEmpty() {
		return deck.isEmpty();
	}

	public void add(int size, Card card) {
		deck.add(size, card);

	}

}