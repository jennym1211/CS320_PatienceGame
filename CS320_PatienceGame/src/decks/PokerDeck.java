package decks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cards.*;
import piles.StockPile;

public class PokerDeck extends Deck {

	private ArrayList<Card> deck;

	/*
	 * Values of cards
	 */
	protected static final int[] numStandardValue = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 }; // standard
	// number of suits in a deck.

	/*
	 * Array of Suits.
	 */
	protected static final Suit[] suitsIndeck = { Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS, Suit.SPADES }; // total
	// suits in deck.

	public PokerDeck()
	{
		super();
		deck = new ArrayList<Card>();
		for (int suit = 0; suit < suitsIndeck.length; suit++) {
			for (int value = 0; value < numStandardValue.length; value++) {
				deck.add(new PokerCard(numStandardValue[value], suitsIndeck[suit]));}}	
	}

	/**
	 * Removes and returns the card at the top of the deck.
	 * 
	 * @return the topmost card
	 * @throws IllegalStateException if the deck is empty
	 */
	public Card deal() {
		try {
			if ( deck.size() < 0)
				throw new IllegalStateException("Deck is empty");
		} catch (IllegalStateException e) {
			System.out.println("Deck is empty!");
		}
		return deck.remove(0);
		// return deck.pop();
	}

	/**
	 * Arranges the deck's cards in random order.
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}


	/**
	 *  Returns the deck as a string.
	 *  
	 *  @return - Deck as string
	 */
	public String toString() {
		String result = "";
		for (Card c : deck)
			result += c + "\n";
		return result;


	}
	
	
	/**
	 *  Returns the deck as an arraylist.
	 * @return - ArrayList of the card object.
	 */
	public ArrayList<Card> asArrayList() {

		ArrayList<Card> temp = new ArrayList<Card>();
		deck.toArray();
		
		temp.addAll(deck);
		
		return temp;
	}

}