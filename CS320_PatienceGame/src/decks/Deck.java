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
	protected ArrayList<Card> deck = new ArrayList<Card>();

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
	 * Removes and returns the card at the top of the deck.
	 * 
	 * @return the topmost card
	 * @throws IllegalStateException if the deck is empty
	 */
	public Card deal() {
		try {
			if (deck.size() < 0)
				throw new IllegalStateException("Deck is empty");
		} catch (IllegalStateException e) {
			System.out.println("Deck is empty!");
		}
		return deck.remove(0);
		// return deck.pop();
	}

	public abstract ArrayList<Card> createDeck();

	/**
	 * Randomizes the order of cards in the deck object.
	 */
	public void shuffle() {

		Collections.shuffle(deck);

	}

	/**
	 * Returns the deck as an arraylist.
	 * 
	 * @return - ArrayList of the card object.
	 */
	public ArrayList<Card> asArrayList() {

		ArrayList<Card> temp = new ArrayList<Card>();
		deck.toArray();

		temp.addAll(deck);

		return temp;
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
	 * Returns the deck as a string.
	 * 
	 * @return - Deck as string
	 */
	public String toString() {
		String result = "";
		for (Card c : deck)
			result += c + "\n";
		return result;

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