package decks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cards.*;
import piles.StockPile;

public class PokerDeck extends Deck {

	private ArrayList<Card> deck = new ArrayList<Card>();

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

	public PokerDeck() {
		super();
		super.deck = deck;
		deck = createDeck();

	}

	public ArrayList<Card> createDeck() {
		for (int suit = 0; suit < suitsIndeck.length; suit++) {
			for (int value = 0; value < numStandardValue.length; value++) {
				deck.add(new PokerCard(numStandardValue[value], suitsIndeck[suit]));
			}
		}

		return deck;
	}

}