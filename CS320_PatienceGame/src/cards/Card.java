package cards;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * This class represents a card object that can be applied to most card games
 * that have a suit and rank involved. It has the values of the rank and suit
 * and compares it with those values.
 * 
 * 
 * The card is the basic playing token for the game. Without this, the game is
 * pretty much un-playable. It is based on the French playing deck.
 * 
 * 
 * 
 * @author Jennifer Mackey
 * 
 * 
 */

public abstract class Card implements CardInterface {

	protected boolean visiblity;
	protected Suit suit;
	protected int rank;
	protected int value;

	/**
	 * * Constructor that will pass a parameter of its rank and suit, and contain
	 * the information for the aforementioned.
	 * 
	 * 
	 * @param suit - The suit of the card.
	 * @param rank - The numerical rank of the card.
	 */

	public Card(int newRank, Suit newSuit) {
		this.rank = newRank;
		this.suit = newSuit;
		visiblity = true;

	}

	/**
	 * Hides the card, negating it's shown status.
	 */
	public void hide() {
		visiblity = !visiblity;
	}

	/**
	 * This will return the cards as shown, if true.
	 * 
	 * @return - true if face up or false otherwise.
	 */
	public boolean show() {
		return visiblity;
	}

	/**
	 * Returns the card's suit value. Suits include the four following:
	 * 
	 * SPADES, DIAMONDS, CLUBS, HEARTS.
	 * 
	 * @return - the card's suit.
	 */

	public Suit getSuit() {
		return suit;
	}

	
	/**
	 * Returns the card's rank value.
	 * 
	 * 
	 * It will contain the values 1-14.
	 * 
	 * @return - the card's rank
	 */

	public int getRank() {
		return rank;
	}

	/**
	 * Returns the card's visibilty.
	 */
	public boolean isVisible() {
		return visiblity;
	}

	/**
	 * Gets the point value of the card.
	 */
	public int getValue() {
		return value;
	}

	
	/**
	 *  Sets the point value of the card.
	 * @param newValue
	 */
	protected void setValue(int newValue) {
		value = newValue;
	}

	public boolean equals(Card c) {
		if (suit == c.getSuit() && rank == c.getRank())
			return (true);
		else
			return (false);
	}

	/**
	 * Compares two cards values, in respect to the rank.
	 * 
	 * @param other - the card being compared.
	 * @return - 0 if equal, less than 0 if less, greater than 0 if greater.
	 */

	public int compareTo(Card c) {
		if (c.rank > this.rank || (c.rank == this.rank)) {
			return -1;
		} else if (this.rank > c.rank || (this.rank == c.rank)) {
			return 1;
		} else {
			return 0;
		}
	}

}
